package com.biblioteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Marko
 */
@Controller
public class HomeController {
    
    // A Spring controller method should be public
    // return a string (aka the view name) have a good descriptive name
    // and then take in any parameters it needs (aka HttpServletRequest, Model etc)
    // but if it doesn't need them, it doesn't have to!!
    @RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String displayHomePage(){
        return "home";
    }
    
}
