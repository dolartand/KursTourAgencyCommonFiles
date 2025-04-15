package com.kurs.dto.AdminDTOs;

import java.io.Serializable;

public class PromoteUserRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userId;

    public PromoteUserRequest() {}

    public PromoteUserRequest(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
