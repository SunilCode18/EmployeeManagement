package com.springboot.app.dto;

public class ErrorResponseDTO {
	
	private int status;
	private String message;
	
	public ErrorResponseDTO() {
	}
	
	
	public ErrorResponseDTO(int status, String message) {
		super();
		this.status = status;
		this.message = message;
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
	
	
	

}
