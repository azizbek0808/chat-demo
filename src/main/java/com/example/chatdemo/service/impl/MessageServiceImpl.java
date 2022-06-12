package com.example.chatdemo.service.impl;

import com.example.chatdemo.dto.MessageCreateDto;
import com.example.chatdemo.dto.MessageDto;
import com.example.chatdemo.entity.Message;
import com.example.chatdemo.mapper.MessageMapper;
import com.example.chatdemo.repository.ChatRepository;
import com.example.chatdemo.repository.MessageRepository;
import com.example.chatdemo.repository.UserRepository;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private final ChatRepository chatRepository;
    private final MessageMapper mapper;


    @Override
    public ApiResult<MessageDto> create(MessageCreateDto dto) {
        Message message = mapper.fromCreateDto(dto);
        message.setAuthor(userRepository.findById(dto.getAuthorId()).get());
        message.setChat(chatRepository.findById(dto.getChatId()).get());
        message.setCreatedAt(new Date());
        return ApiResult.successResponse(mapper.toDto(messageRepository.save(message)));
    }

    @Override
    public ApiResult<Set<MessageDto>> getMessages(Long chatId) {
        List<Message> list = messageRepository.findAllByChatId(chatId);
        List<MessageDto> messageDtos = mapper.toDto(list);
        Set<MessageDto> set = new HashSet<>(messageDtos);
        return ApiResult.successResponse(set);
    }

}
