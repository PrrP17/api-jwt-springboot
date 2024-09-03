package com.jwt.demo.domain.service;

import com.jwt.demo.domain.dto.UserDTO;
import com.jwt.demo.domain.model.User;

import java.util.List;

public interface UserServiceInterface {

    void saveNewUser(UserDTO dto);

    List<UserDTO> listAllUser();
}
