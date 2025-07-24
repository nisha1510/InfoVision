package com.smarttelecom.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsageLogDTO {
    private String userId;
    private LocalDate date;
    private int callDuration;   // in minutes
    private double dataUsed;    // in MB
    private int smsCount;       // number of SMS
}
