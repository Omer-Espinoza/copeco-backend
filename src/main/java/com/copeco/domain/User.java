package com.copeco.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private Integer id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String dni;
    private String address;
    
    // ROLE

}
