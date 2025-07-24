package com.telecom.dto;

import com.telecom.enums.PlanType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO {
	private Long id;
    private PlanType type;
    private double price;
    private String validity;
    private String description;
}
