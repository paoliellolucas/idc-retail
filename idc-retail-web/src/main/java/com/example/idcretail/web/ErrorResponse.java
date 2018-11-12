package com.example.idcretail.web;

import java.time.LocalDateTime;

public class ErrorResponse {
	
	private LocalDateTime timestamp;
	
	private String message;
	
	public ErrorResponse(String message) {
		this.message = message;
		this.timestamp = LocalDateTime.now();
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
