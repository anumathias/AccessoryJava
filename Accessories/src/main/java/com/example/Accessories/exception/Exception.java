package com.example.Accessories.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class Exception {

	@ResponseStatus (value = HttpStatus.NOT_FOUND)
	public class ResourceNotFoundException extends RuntimeException{

		private static final long serialVersaionID=1L;
		
		public ResourceNotFoundException(String message) {
			super(message);
		}
	}
}
