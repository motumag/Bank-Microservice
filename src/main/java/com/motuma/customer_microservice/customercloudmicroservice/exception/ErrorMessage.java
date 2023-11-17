package com.motuma.customer_microservice.customercloudmicroservice.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
	
	  private int statusCode;
	  @JsonFormat(shape = Shape.STRING, pattern = "YYYY-MM-DD HH:MM:SS")
	  private LocalDateTime dateTime;
	  private String message;
	  private String description;

}
