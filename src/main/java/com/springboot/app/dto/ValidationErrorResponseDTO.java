package com.springboot.app.dto;

import java.util.Map;

public class ValidationErrorResponseDTO {
	
	private int status;
	private String message;
	private Map<String, String> errors;
	
	public ValidationErrorResponseDTO() {}
	
	

	public ValidationErrorResponseDTO(int status, String message, Map<String, String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}



	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	

}
