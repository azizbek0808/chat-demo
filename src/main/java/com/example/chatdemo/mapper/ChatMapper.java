package com.example.chatdemo.mapper;

import com.example.chatdemo.dto.ChatCreateDto;
import com.example.chatdemo.dto.ChatDto;
import com.example.chatdemo.entity.Chat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface ChatMapper {

    Chat fromCreateDto(ChatCreateDto dto);

    ChatDto toDto(Chat user);

}
