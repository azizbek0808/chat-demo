package com.example.chatdemo.controller;

import com.example.chatdemo.dto.ChatCreateDto;
import com.example.chatdemo.dto.ChatDto;
import com.example.chatdemo.entity.Chat;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService service;

    @PostMapping("/create")
    public ApiResult<ChatDto> create(@RequestBody ChatCreateDto dto) {
        return service.create(dto);
    }

    @GetMapping("/get/userId={userId}")
    public ApiResult<Set<Chat>> getChats(@PathVariable(value = "userId") Long userId) {
        return service.getChats(userId);
    }

}
