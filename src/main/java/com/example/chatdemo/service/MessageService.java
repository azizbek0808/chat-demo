package com.example.chatdemo.service;

import com.example.chatdemo.dto.MessageCreateDto;
import com.example.chatdemo.dto.MessageDto;
import com.example.chatdemo.response.ApiResult;
import com.sun.istack.NotNull;

import java.util.Set;

public interface MessageService {

    ApiResult<MessageDto> create(@NotNull MessageCreateDto dto);

    ApiResult<Set<MessageDto>> getMessages(Long chatId);
}
