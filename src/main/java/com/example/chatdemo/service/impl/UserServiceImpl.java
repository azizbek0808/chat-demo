package com.example.chatdemo.service.impl;

import com.example.chatdemo.dto.UserCreateDto;
import com.example.chatdemo.dto.UserDto;
import com.example.chatdemo.entity.User;
import com.example.chatdemo.exception.RestException;
import com.example.chatdemo.mapper.UserMapper;
import com.example.chatdemo.repository.UserRepository;
import com.example.chatdemo.response.ApiResult;
import com.example.chatdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;
    private final UserRepository repository;

    @Override
    public ApiResult<UserDto> create(UserCreateDto dto) {
        existUserByUserNameAndIdIfExistThrow(dto.getUsername(), null);
        User user = mapper.fromCreateDto(dto);
        user.setCreatedAt(new Date());
        return ApiResult.successResponse(mapper.toDto(repository.save(user)));
    }

    private void existUserByUserNameAndIdIfExistThrow(String username, Long id) {
        if ((id == null && repository.existsByUsername(username)) || (id != null && repository.existsByIdNotAndUsername(id, username))) {
            throw RestException.restThrow("User already exist", HttpStatus.BAD_REQUEST);
        }
    }
}
