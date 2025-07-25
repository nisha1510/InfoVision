package com.telecom.customer.exceptions;


import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

	@RestControllerAdvice
	public class GlobalExceptionHandler {

	    @ExceptionHandler(IllegalArgumentException.class)
	    public ResponseEntity<Map<String, Object>> handleIllegalArgument(IllegalArgumentException ex) {
	        return buildError(HttpStatus.BAD_REQUEST, ex.getMessage());
	    }

	    @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<Map<String, Object>> handleResourceNotFound(ResourceNotFoundException ex) {
	        return buildError(HttpStatus.NOT_FOUND, ex.getMessage());
	    }
	    @ExceptionHandler(DataIntegrityViolationException.class)
	    public ResponseEntity<Map<String, Object>> handleDataConflict(DataIntegrityViolationException ex) {
	        return buildError(HttpStatus.CONFLICT, "A customer already exists with this email or mobile.");
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
	        return buildError(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected server error.");
	    }

	    private ResponseEntity<Map<String, Object>> buildError(HttpStatus status, String message) {
	        Map<String, Object> errorBody = new LinkedHashMap<>();
	        errorBody.put("timestamp", LocalDateTime.now());
	        errorBody.put("status", status.value());
	        errorBody.put("error", status.getReasonPhrase());
	        errorBody.put("message", message);
	        return ResponseEntity.status(status).body(errorBody);
	    }
	}

