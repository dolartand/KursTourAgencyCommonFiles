package com.kurs.dto.AdminDTOs;

import java.io.Serializable;
import java.util.List;

public class UsersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success;
    private String message;
    private List<UserDTO> users;

    public UsersResponse() {
    }

    public UsersResponse(boolean success, String message, List<UserDTO> users) {
        this.success = success;
        this.message = message;
        this.users = users;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<UserDTO> getUsers() {
        return users;
    }
}
