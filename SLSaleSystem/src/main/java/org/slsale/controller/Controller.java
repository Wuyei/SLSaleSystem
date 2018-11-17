package org.slsale.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    
    @RequestMapping("/index.html")
    public String main() {
        System.out.println("df");
        return "index";
    }
}
