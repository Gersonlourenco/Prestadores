package com.gerson.teste.proximidade.model;

import java.io.Serializable;

public class Matrix implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] destination_addresses;
	private String[] origin_addresses;
	private String error_message;
	private Row[] rows;
	private String status;

	public String[] getDestination_addresses() {
		return destination_addresses;
	}

	public void setDestination_addresses(String[] destination_addresses) {
		this.destination_addresses = destination_addresses;
	}

	public String[] getOrigin_addresses() {
		return origin_addresses;
	}

	public void setOrigin_addresses(String[] origin_addresses) {
		this.origin_addresses = origin_addresses;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	public Row[] getRows() {
		return rows;
	}

	public void setRows(Row[] rows) {
		this.rows = rows;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
