package com.hazelab.todo.repository;

import com.hazelab.todo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{
    List<TaskEntity> findAllByIsDeleted(Boolean isDeleted);
}
