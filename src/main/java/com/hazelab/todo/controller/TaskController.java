package com.hazelab.todo.controller;


import com.hazelab.todo.entity.TaskEntity;
import com.hazelab.todo.repository.TaskRepository;
import com.hazelab.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<TaskEntity> findList(){
        return taskService.findList();
    }

    public Optional<TaskEntity> find(Integer id){
        return taskService.find(id);
    }

}
