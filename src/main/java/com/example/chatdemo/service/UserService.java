package com.example.chatdemo.service;

import com.example.chatdemo.dto.UserCreateDto;
import com.example.chatdemo.dto.UserDto;
import com.example.chatdemo.response.ApiResult;
import com.sun.istack.NotNull;

public interface UserService {

    ApiResult<UserDto> create(@NotNull UserCreateDto dto);

}
