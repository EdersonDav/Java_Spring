package com.ederson.curso.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fidldName;
	private String fieldMessage;
	
	public FieldMessage() {}

	public FieldMessage(String fidldName, String fieldMessage) {
		super();
		this.fidldName = fidldName;
		this.fieldMessage = fieldMessage;
	}

	public String getFidldName() {
		return fidldName;
	}

	public void setFidldName(String fidldName) {
		this.fidldName = fidldName;
	}

	public String getFieldMessage() {
		return fieldMessage;
	}

	public void setFieldMessage(String fieldMessage) {
		this.fieldMessage = fieldMessage;
	}
	
}
