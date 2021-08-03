package br.univille.mvgentildsi2021.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//MVC Model / View / Controller
@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping()
    public ModelAndView index(){
        return new ModelAndView("home/index");
    }

}

