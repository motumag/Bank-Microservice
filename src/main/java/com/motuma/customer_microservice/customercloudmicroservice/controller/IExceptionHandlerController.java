package com.motuma.customer_microservice.customercloudmicroservice.controller;

import com.motuma.customer_microservice.customercloudmicroservice.exception.*;
import org.hibernate.ResourceClosedException;
import org.springframework.web.context.request.WebRequest;



public interface IExceptionHandlerController  {
	
	ErrorMessage globalExceptionHandler(Exception ex, WebRequest request);
	ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request);
	ErrorMessage resourseAlreadyReportedException(ResourceAlreadyReportedException ex, WebRequest request);
	ErrorMessage resourseNotAcceptableException(ResourceNotAcceptableException ex, WebRequest request);
	ErrorMessage resourseBadRequestException(ResourceBadRequestException ex, WebRequest request);
	ErrorMessage resourseClosedException(ResourceClosedException ex, WebRequest request);
}
