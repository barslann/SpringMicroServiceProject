package com.coderman.photoapp.api.users.services;

import com.coderman.photoapp.api.users.dto.UserDTO;

public interface UsersService {
    UserDTO createUser(UserDTO userDetails);
}
