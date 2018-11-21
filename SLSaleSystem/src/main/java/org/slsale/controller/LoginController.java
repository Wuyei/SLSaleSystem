package org.slsale.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.slsale.common.Constants;
import org.slsale.pojo.Function;
import org.slsale.pojo.Menu;
import org.slsale.pojo.User;
import org.slsale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

@org.springframework.stereotype.Controller
public class LoginController extends BaseController{
    Logger logger = Logger.getLogger(LoginController.class);
    
    @Autowired
    private UserService userService;
    
    /**
     * 跳转登陆页
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        logger.info("==========Weclome to index.html===============");
        return "index";
    }
    
    
    @RequestMapping("/login.html")
    @ResponseBody
    public String login(HttpSession session,@RequestParam(required=false) String userStr) {
        logger.info("====================login.html==========================");
        logger.debug("userStr>>>"+userStr);
        try {
            if(null == userStr || "".equals(userStr)) {
                return "nodata";
            }else {
                User user = JSONObject.parseObject(userStr, new TypeReference<User>() {});
                logger.debug(user.toString());
                if(user.getLoginCode() == null || "".equals(user.getLoginCode().trim())) {
                    return "nodata";
                }
                User sqlUser = userService.getUser(user);
                if(null == sqlUser || "".equals(sqlUser.getLoginCode().trim())) {
                    return "notFindUser";
                }else {
                    session.setAttribute(Constants.SESSION_USER, sqlUser);
                    User updateLastLoginTime = new User();
                    updateLastLoginTime.setId(sqlUser.getId());
                    updateLastLoginTime.setLastLoginTime(new Date());
                    int result = userService.updateUser(updateLastLoginTime);       //更新最后登陆时间
                    logger.debug("updateLastLoginTime >>>" +updateLastLoginTime);
                    if(result == 0) {
                        return "error";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }
    
    /**
     * 主页初始化
     * @return
     */
    @RequestMapping("/main.html")
    public ModelAndView main() {
        logger.info("==========Weclome to main.html===============");
        User user = this.getCurrentUser();
        //所有主子菜单列表
        List<Menu> menuList = new ArrayList<Menu>();
        try {
            menuList = userService.getMenuListByRoleId(user.getRoleId());
            
        } catch (Exception e) {
            e.printStackTrace();
            logger.warn("====主子菜单查询报错未查出来====", e);
            menuList = null;
        }
        ModelAndView mv = new ModelAndView("main");
        mv.addObject("menuList", menuList);
        return mv;
    }
}
