package com.example.chatdemo.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ChatDto {
    private Long id;
    private String name;
    private Set<UserDto> users = new HashSet<>();
    private String createdAt;
}

