package com.example.chatdemo.dto;

import lombok.Data;

@Data
public class MessageDto {
    private Long id;
    private String text;
    private UserDto author;
    private ChatDto chat;
}

