package com.hazelab.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {
    @GetMapping("/index")
    @ModelAttribute
    public ModelAndView index(ModelAndView model){
        model.setViewName("index");//これなくても通る
        return model;
    }
    @GetMapping("/create")
    @ModelAttribute
    public ModelAndView create(ModelAndView model){

        return null;
    }





}
