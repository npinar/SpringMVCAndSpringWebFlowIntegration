package com.myjavasolutions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class RegistrationController {
 
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser() {
        return "thankyou";
    }
 
    @RequestMapping("/home")  
    public String home() {
    	return "home";
    }  
}
