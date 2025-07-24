package com.smarttelecom.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private String planId;
}