package com.copeco.infrastructure.configuration;

import com.copeco.application.repository.UserRepository;
import com.copeco.application.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {


    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

}
