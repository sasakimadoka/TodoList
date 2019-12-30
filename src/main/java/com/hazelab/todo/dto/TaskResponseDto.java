package com.hazelab.todo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class TaskResponseDto {

    private Integer id;
    private String name;
    private LocalDateTime expiredAt;
    private Integer status;
    private Integer isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String colorLabel;

}
