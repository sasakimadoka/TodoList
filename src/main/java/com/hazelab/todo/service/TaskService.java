package com.hazelab.todo.service;

import java.util.List;
import java.util.Optional;

import com.hazelab.todo.entity.TaskEntity;
import com.hazelab.todo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<TaskEntity> findList(){
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> find(Integer id){
        return taskRepository.findById(id);
    }

}
