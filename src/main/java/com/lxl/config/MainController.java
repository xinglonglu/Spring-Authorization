package com.lxl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxl.authorization.manager.TokenManager;

@Controller
public class MainController {
    @Autowired
   private TokenManager manager;
    @RequestMapping("/")
    @ResponseBody
    public String home() {
    	System.out.println("666666666666666");
    	long userId =123l;
    	manager.deleteToken(userId);
      return "Hello World!";
    }
}
