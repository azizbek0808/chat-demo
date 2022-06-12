package com.example.chatdemo.controller;

import com.example.chatdemo.dto.UserCreateDto;
import com.example.chatdemo.dto.UserDto;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ApiResult<UserDto> create(@RequestBody UserCreateDto dto) {
        return service.create(dto);
    }

}
