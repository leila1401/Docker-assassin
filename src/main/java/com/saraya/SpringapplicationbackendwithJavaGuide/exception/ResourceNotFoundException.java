package com.saraya.SpringapplicationbackendwithJavaGuide.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fiedValue;
	public ResourceNotFoundException(String resourceName, String fieldName, Object fiedValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fiedValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fiedValue = fiedValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public Object getFiedValue() {
		return fiedValue;
	}
	
	
	
	

}
