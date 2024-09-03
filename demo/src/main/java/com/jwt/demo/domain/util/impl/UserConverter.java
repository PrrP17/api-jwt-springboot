package com.jwt.demo.domain.util.impl;

import com.jwt.demo.domain.dto.UserDTO;
import com.jwt.demo.domain.model.User;
import com.jwt.demo.domain.util.UserConverterInteface;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserConverter implements UserConverterInteface {
    @Override
    public User convertFromDto(UserDTO dto) {
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

    @Override
    public UserDTO convertFromEntity(User entity) {
        return UserDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();
    }

    @Override
    public List<User> createFromDtos(Collection<UserDTO> dtos) {
        return dtos.stream().map(this::convertFromDto)
                .filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> createFromEntities(Collection<User> entities) {
        return entities.stream().map(this::convertFromEntity)
                .filter(Objects::nonNull).collect(Collectors.toList());
    }
}
