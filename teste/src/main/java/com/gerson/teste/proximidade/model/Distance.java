package com.gerson.teste.proximidade.model;

import java.io.Serializable;

public class Distance implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String text;
	private Double value;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
