package com.motuma.customer_microservice.customercloudmicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ResourceNotAcceptableException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldname;
	private Object fieldValue;
	
	public ResourceNotAcceptableException(String resourceName, String fieldName, Object fieldValu) {
		super(String.format("%s not found with %s: '%s'", resourceName, fieldName, fieldName));
		this.resourceName = resourceName;
		this.fieldname = fieldName;
		this.fieldValue = fieldValue;
	}
}
