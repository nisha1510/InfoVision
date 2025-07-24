package com.smarttelecom.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usage_logs")
public class UsageLog {
	
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userId;
    private LocalDate date;
    private int callDuration; // in minutes
    private double dataUsed;  // in MB
    private int smsCount;
	public UsageLog() {
		super();
	}
	public UsageLog(String id, String userId, LocalDate date, int callDuration, double dataUsed, int smsCount) {
		super();
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.callDuration = callDuration;
		this.dataUsed = dataUsed;
		this.smsCount = smsCount;
	}
    
    
}
