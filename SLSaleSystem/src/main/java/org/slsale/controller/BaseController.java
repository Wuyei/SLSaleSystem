package org.slsale.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import org.apache.log4j.Logger;
import org.slsale.common.Constants;
import org.slsale.pojo.User;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BaseController {
    Logger logger = Logger.getLogger(BaseController.class);
    
    private User currentUser;

    public User getCurrentUser() {
        logger.info("=========getCurrentUser()===============");
        if(null == currentUser) {
            HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = req.getSession(false);
            if(null != session) {
                currentUser = (User)session.getAttribute(Constants.SESSION_USER);
            }else {
                currentUser = null;
            }
        }
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    /**
     * 日期国际化处理
     * @param dataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Data.class, new PropertiesEditor() {

            @Override
            public void setAsText(String text){
                
                try {
                    setValue(new SimpleDateFormat("yyyy-MM-dd").parse(getAsText()));
                } catch (ParseException e) {
                    e.printStackTrace();
                    setValue(null);
                }
            }

            @Override
            public String getAsText() {
                return new SimpleDateFormat("yyyy-MM-dd").format((Date)getValue());
            }
        });
    }
}
