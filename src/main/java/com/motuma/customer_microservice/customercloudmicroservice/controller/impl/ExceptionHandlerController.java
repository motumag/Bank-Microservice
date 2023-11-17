package com.motuma.customer_microservice.customercloudmicroservice.controller.impl;

import com.motuma.customer_microservice.customercloudmicroservice.controller.IExceptionHandlerController;
import com.motuma.customer_microservice.customercloudmicroservice.exception.*;
import org.hibernate.ResourceClosedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionHandlerController implements IExceptionHandlerController {
	  
	  @Override
	  @ExceptionHandler(Exception.class)
	  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	  public ErrorMessage globalExceptionHandler(Exception ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
		        HttpStatus.INTERNAL_SERVER_ERROR.value(),
		        LocalDateTime.now(),
		        ex.getMessage(),
		        request.getDescription(false));
	    return message;
	  }
	  
	  @Override
	  @ExceptionHandler(ResourceNotFoundException.class)
	  @ResponseStatus(value = HttpStatus.NOT_FOUND)
	  public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
		        HttpStatus.NOT_FOUND.value(),
		        LocalDateTime.now(),
		        ex.getMessage(),
		        request.getDescription(false));
	    
	    return message;
	  }

	@Override
	@ExceptionHandler(ResourceAlreadyReportedException.class)
	@ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
	public ErrorMessage resourseAlreadyReportedException(ResourceAlreadyReportedException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(
				HttpStatus.ALREADY_REPORTED.value(),
				LocalDateTime.now(),
				ex.getMessage(),
				request.getDescription(false)
				);
		return message;
	}

	@Override
	@ExceptionHandler(ResourceNotAcceptableException.class)
	@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
	public ErrorMessage resourseNotAcceptableException(ResourceNotAcceptableException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(
		        HttpStatus.NOT_ACCEPTABLE.value(),
		        LocalDateTime.now(),
		        ex.getMessage(),
		        request.getDescription(false));

		return message;
	}


	@Override
	@ExceptionHandler(ResourceBadRequestException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage resourseBadRequestException(ResourceBadRequestException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(
		        HttpStatus.BAD_REQUEST.value(),
		        LocalDateTime.now(),
		        ex.getMessage(),
		        request.getDescription(false));

		return message;
	}

	@Override
	@ExceptionHandler(ResourceClosedException.class)
	@ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
	public ErrorMessage resourseClosedException(ResourceClosedException ex, WebRequest request) {
		ErrorMessage message = new ErrorMessage(
		        HttpStatus.REQUEST_TIMEOUT.value(),
		        LocalDateTime.now(),
		        ex.getMessage(),
		        request.getDescription(false));

		return message;
	}

}
