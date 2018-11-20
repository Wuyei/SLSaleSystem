package org.slsale.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.slsale.common.Constants;
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
public class LoginController {
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
    
    @RequestMapping("/main.html")
    public ModelAndView main() {
        logger.info("==========Weclome to main.html===============");
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }
}
