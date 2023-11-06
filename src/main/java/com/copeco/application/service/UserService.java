package com.copeco.application.service;

import com.copeco.application.repository.UserRepository;
import com.copeco.domain.User;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getUsers() {
        return userRepository.getUsers();
    }

    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteUserById(id);
    }

    public boolean userExistisById(Integer id) {
        return userRepository.userExistsById(id);
    }
}
