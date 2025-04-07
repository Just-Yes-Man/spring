package com.spring.spring.models.DTO;

import com.spring.spring.models.User;

public class UserDTO {
    private User[] user;

    public UserDTO(User[] user) {
        this.user = user;
    }

    

    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    

}
