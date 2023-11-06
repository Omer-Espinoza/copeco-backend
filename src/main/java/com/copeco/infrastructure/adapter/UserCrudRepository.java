package com.copeco.infrastructure.adapter;

import com.copeco.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserEntity, Integer> {
}
