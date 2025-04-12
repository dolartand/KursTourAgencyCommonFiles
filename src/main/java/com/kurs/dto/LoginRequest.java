package com.kurs.dto;

import java.io.Serializable;

public class LoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private String role;

    public LoginRequest(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}
