package com.example.chatdemo.controller;

import com.example.chatdemo.dto.MessageCreateDto;
import com.example.chatdemo.dto.MessageDto;
import com.example.chatdemo.entity.Chat;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService service;

    @PostMapping("/create")
    public ApiResult<MessageDto> create(@RequestBody MessageCreateDto dto) {
        return service.create(dto);
    }

    @GetMapping("/get/chatId={chatId}")
    public ApiResult<Set<MessageDto>> getMessages(@PathVariable(value = "chatId") Long chatId) {
        return service.getMessages(chatId);
    }

}
