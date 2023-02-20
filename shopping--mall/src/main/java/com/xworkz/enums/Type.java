package com.xworkz.enums;

public enum Type {

	Message("found"), ERROR("NOT");

	private String values;

	private Type(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;

	}

}
