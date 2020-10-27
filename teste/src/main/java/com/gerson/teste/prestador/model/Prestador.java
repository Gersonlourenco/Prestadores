package com.gerson.teste.prestador.model;

import java.util.List;

public class Prestador {
	private String nome;
	private String endereco;
	private Double latitude;
	private Double longitude;
	private List<EspecialidadePrestador> especialidadePrestador;
	
	public Prestador(String nome, String endereco, Double latitude, Double longitude,
			List<EspecialidadePrestador> especialidadePrestador) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
		this.especialidadePrestador = especialidadePrestador;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public List<EspecialidadePrestador> getEspecialidadePrestador() {
		return especialidadePrestador;
	}
}
