package com.copeco.infrastructure.adapter;

import com.copeco.application.repository.UserRepository;
import com.copeco.domain.User;
import com.copeco.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserCrudRepository userCrudRepository;

    private final UserMapper userMapper;

    public UserRepositoryImpl(UserCrudRepository userCrudRepository, UserMapper userMapper) {
        this.userCrudRepository = userCrudRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Iterable<User> getUsers() {
        return userMapper.toUsers(userCrudRepository.findAll());
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.toUser(userCrudRepository.findById(id).get());
    }

    @Override
    public User saveUser(User user) {
        return userMapper.toUser(userCrudRepository.save(userMapper.toUserEntity(user)));
    }

    @Override
    public void deleteUserById(Integer id) {
        userCrudRepository.deleteById(id);
    }

    @Override
    public boolean userExistsById(Integer id) {
        return userCrudRepository.existsById(id);
    }
}
