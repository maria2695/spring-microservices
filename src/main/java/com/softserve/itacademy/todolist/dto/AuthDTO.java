package com.softserve.itacademy.todolist.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthDTO{
    private String username;
    private String password;
}
