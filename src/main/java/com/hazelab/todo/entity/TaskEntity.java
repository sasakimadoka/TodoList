package com.hazelab.todo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "expired_at")
    private LocalDateTime expiredAt = LocalDateTime.now();

    @NotNull
    @Column(name = "status")
    private Integer status;

    @NotNull
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdA = LocalDateTime.now();

    @NotNull
    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "color_label")
    private String colorLabel;

}
