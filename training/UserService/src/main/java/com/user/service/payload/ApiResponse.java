package com.user.service.payload;

import org.springframework.http.HttpStatus;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	
	private String message;
	private boolean success;
	private HttpStatus status;

}
