package com.hazelab.todo.controller;

import com.hazelab.todo.entity.TaskEntity;
import com.hazelab.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

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
    public ModelAndView submit(ModelAndView model, TaskEntity taskEntity){
        taskEntity.setStatus(0);
        taskEntity.setIsDeleted(false);
        taskService.create(taskEntity);
        model.addObject("createCheck",taskEntity.getName());
        return index(model);
    }
    @GetMapping("/task_list")
    @ModelAttribute
    public ModelAndView task_list(ModelAndView model){
        List<TaskEntity> taskEntity = this.taskService.findList();
        model.addObject("taskList",taskEntity);
        model.setViewName("task_list");
        return model;
    }

}
