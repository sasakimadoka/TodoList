package com.hazelab.todo.entity;

import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class TaskEntity {

    @Id
    private Integer id;

    @NotNull
    private String name;

    private LocalDateTime expiredAt;

    @NotNull
    private Integer status;

    @NotNull
    private Integer isDeleted;

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private LocalDateTime updatedAt;

    private String colorLabel;

}
