package com.ssafy.wonik.service;

import com.ssafy.wonik.domain.dto.UserJoinDto;
import com.ssafy.wonik.domain.dto.UserLoginDto;
import com.ssafy.wonik.domain.entity.User;

import java.util.List;

public interface UserService {

    void signup(UserJoinDto userJoinDto);

    String login(UserLoginDto userLoginDto);

    List<User> getAllUser();
}

