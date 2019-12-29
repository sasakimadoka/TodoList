package com.hazelab.todo.entity;

import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "todo_app")
@Validated
public class ToDoEntity {

    @Id
    private Integer id;

    @NotNull
    private String name;

    private LocalDateTime expired_at;

    @NotNull
    private Integer status;

    @NotNull
    private Integer is_deleted;

    @NotNull
    private LocalDateTime created_at;

    @NotNull
    private LocalDateTime updated_at;

    private String color_label;

}
