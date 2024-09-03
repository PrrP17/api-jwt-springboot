package com.jwt.demo.domain.util;

import com.jwt.demo.domain.dto.UserDTO;
import com.jwt.demo.domain.model.User;

import java.util.Collection;
import java.util.List;

public interface UserConverterInteface {

    User convertFromDto(UserDTO dto);

    UserDTO convertFromEntity(User entity);

    List<User> createFromDtos(Collection<UserDTO> dtos);

    List<UserDTO> createFromEntities(Collection<User> entities);
}
