package com.softserve.itacademy.todolist.dto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class CollaboratorDTO {
    @NotNull
    private long collaborator_id;
}