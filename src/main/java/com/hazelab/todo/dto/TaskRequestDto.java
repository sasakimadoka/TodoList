package com.hazelab.todo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
public class TaskRequestDto {


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
