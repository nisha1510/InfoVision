package com.smarttelecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserWithPlanDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private PlanDTO plan;
}
