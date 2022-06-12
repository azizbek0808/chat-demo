package com.example.chatdemo.dto;

import lombok.Data;

@Data
public class MessageCreateDto {
    private String text;
    private Long authorId;
    private Long chatId;
}

