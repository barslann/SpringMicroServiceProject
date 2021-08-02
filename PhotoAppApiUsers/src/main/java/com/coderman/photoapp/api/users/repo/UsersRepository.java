package com.coderman.photoapp.api.users.repo;

import com.coderman.photoapp.api.users.data.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity,Long> {
}
