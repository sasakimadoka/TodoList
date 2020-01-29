package com.hazelab.todo.controller;


import com.hazelab.todo.entity.TaskEntity;
import com.hazelab.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping(path="/tasks/create/{taskEntity}")
    public ResponseEntity<String> create(@PathVariable TaskEntity taskEntity){
        taskService.create(taskEntity);
        return ResponseEntity.ok("success-create");
    }

    @GetMapping("/tasks")
    public List<TaskEntity> findList(){
        return taskService.findList();
    }

    @GetMapping(path="/tasks/{id}")
    public Optional<TaskEntity> find(@PathVariable Integer id){
        return taskService.find(id);
    }

    @PostMapping("/tasks/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id ){
        taskService.delete(id);
        return ResponseEntity.ok("success");
    }
}
