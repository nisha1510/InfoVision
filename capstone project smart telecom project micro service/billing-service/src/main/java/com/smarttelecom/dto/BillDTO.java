package com.smarttelecom.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO {
	
	private String userId;
    private LocalDate billingDate;
    private double totalCallCharge;
    private double totalDataCharge;
    private double totalSmsCharge;
    private double totalAmount;
}
