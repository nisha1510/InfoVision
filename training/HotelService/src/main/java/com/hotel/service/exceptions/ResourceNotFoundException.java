package com.hotel.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String s) {
		super(s);
	}
	public ResourceNotFoundException() {
		super("REsource not found..");
	}
}
