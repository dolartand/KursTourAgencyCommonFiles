package com.kurs.dto.AdminDTOs;

import java.io.Serializable;
import java.time.LocalDate;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String firstName;
    private String surname;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String role;

    public UserDTO() {
    }

    public UserDTO(int id, String name, String firstName, String surname, String email,
                   String phone, LocalDate birthDate, String role) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String lastName) {
        this.firstName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
