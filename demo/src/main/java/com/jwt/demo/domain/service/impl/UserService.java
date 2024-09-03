package com.jwt.demo.domain.service.impl;

import com.jwt.demo.domain.dto.UserDTO;
import com.jwt.demo.domain.model.User;
import com.jwt.demo.domain.repository.UserRepository;
import com.jwt.demo.domain.service.UserServiceInterface;
import com.jwt.demo.domain.util.UserConverterInteface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepository repository;
    private final UserConverterInteface converter;

    @Override
    public void saveNewUser(UserDTO dto) {
        repository.save(converter.convertFromDto(dto));
    }

    @Override
    public List<UserDTO> listAllUser() {
        List<User> userList = repository.findAll();
        return converter.createFromEntities(userList);
    }
}
