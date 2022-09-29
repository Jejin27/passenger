package com.flight.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class Resourcebook extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String reName;
	private String fdName;
	private Object fdValue;
	public Resourcebook(String reName, String fdName, Object fdValue) {
		super();
		this.reName = reName;
		this.fdName = fdName;
		this.fdValue = fdValue;
	}
	public String getreName() {
		return reName;
	}
	public String getfdName() {
		return fdName;
	}
	public Object getfdValue() {
		return fdValue;
	}

}
