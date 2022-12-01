package org.generation.italy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class MainController {
    @RequestMapping("/")
    
    public String getHome(Model model) {
    	
    	String name = "Francesco";
    	model.addAttribute("name", name);
    	
    	return "home";
    }
}
