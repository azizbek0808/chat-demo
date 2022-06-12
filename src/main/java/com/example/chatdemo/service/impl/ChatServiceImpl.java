package com.example.chatdemo.service.impl;

import com.example.chatdemo.dto.ChatCreateDto;
import com.example.chatdemo.dto.ChatDto;
import com.example.chatdemo.entity.Chat;
import com.example.chatdemo.entity.User;
import com.example.chatdemo.mapper.ChatMapper;
import com.example.chatdemo.repository.ChatRepository;
import com.example.chatdemo.repository.UserRepository;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;
    private final UserRepository userRepository;
    private final ChatMapper mapper;

    @Override
    public ApiResult<ChatDto> create(ChatCreateDto dto) {
        Chat chat = mapper.fromCreateDto(dto);
        Set<User> userSet = new HashSet<>();
        for (Long userId : dto.getUsersArray()) {
            userSet.add(userRepository.findById(userId).get());
        }
        chat.setUsers(userSet);
        chat.setCreatedAt(new Date());
        return ApiResult.successResponse(mapper.toDto(chatRepository.save(chat)));
    }

    @Override
    public ApiResult<Set<Chat>> getChats(Long userId) {
        return ApiResult.successResponse(new TreeSet<>(chatRepository.findAllByUserId(userId)));
    }
}
