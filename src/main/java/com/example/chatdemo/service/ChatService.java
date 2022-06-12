package com.example.chatdemo.service;

import com.example.chatdemo.dto.ChatCreateDto;
import com.example.chatdemo.dto.ChatDto;
import com.example.chatdemo.entity.Chat;
import com.example.chatdemo.response.ApiResult;
import com.sun.istack.NotNull;

import java.util.Set;

public interface ChatService {

    ApiResult<ChatDto> create(@NotNull ChatCreateDto dto);

    ApiResult<Set<Chat>> getChats(Long userId);
}
