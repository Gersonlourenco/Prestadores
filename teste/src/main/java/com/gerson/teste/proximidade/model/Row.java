package com.gerson.teste.proximidade.model;

import java.io.Serializable;

public class Row implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Element[] elements;

	public Element[] getElements() {
		return elements;
	}

	public void setElements(Element[] elements) {
		this.elements = elements;
	}

}
