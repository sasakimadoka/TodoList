package com.hazelab.todo.controller;

import com.hazelab.todo.entity.TaskEntity;
import com.hazelab.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/index")
    @ModelAttribute
    public ModelAndView index(ModelAndView model){
        model.setViewName("index");//これなくても通る
        return model;
    }
    @GetMapping("/create")
    @ModelAttribute
    public ModelAndView create(ModelAndView model){
        model.setViewName("create");//これなくても通る
        return model;
    }
    @PostMapping("/submit")
    @ModelAttribute
    public void submit(TaskEntity taskEntity){
        System.out.println("ここ来てる？");
        taskEntity.setStatus(0);
        taskEntity.setIsDeleted(false);
        taskService.create(taskEntity);
    }




}
