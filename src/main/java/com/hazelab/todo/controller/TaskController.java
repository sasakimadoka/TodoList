package com.hazelab.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

public class TaskController {
    @GetMapping("task")
    @ModelAttribute
    public ModelAndView index(ModelAndView model){
        model.addObject("/task");
        return model;
    }
}
