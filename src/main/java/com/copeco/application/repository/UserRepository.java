package com.copeco.application.repository;

import com.copeco.domain.User;

public interface UserRepository {
    Iterable<User> getUsers();

    User getUserById(Integer id);

    User saveUser(User user);

    void deleteUserById(Integer id);

    boolean userExistsById(Integer id);
}
