package com.example.chatdemo.mapper;

import com.example.chatdemo.dto.MessageCreateDto;
import com.example.chatdemo.dto.MessageDto;
import com.example.chatdemo.entity.Message;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface MessageMapper {

    Message fromCreateDto(MessageCreateDto dto);

    MessageDto toDto(Message user);

    List<MessageDto> toDto(List<Message> list);


}
