package com.example.chatdemo.mapper;

import com.example.chatdemo.dto.UserCreateDto;
import com.example.chatdemo.dto.UserDto;
import com.example.chatdemo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromCreateDto(UserCreateDto dto);
    UserDto toDto(User user);

}
