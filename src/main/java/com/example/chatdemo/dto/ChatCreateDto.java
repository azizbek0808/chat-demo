package com.example.chatdemo.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ChatCreateDto {
    private String name;
    private ArrayList<Long> usersArray;
}

