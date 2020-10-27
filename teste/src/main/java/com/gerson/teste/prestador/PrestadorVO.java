package com.gerson.teste.prestador;

import com.gerson.teste.prestador.model.Prestador;

public class PrestadorVO {
	private String nome;
	private String endereco;
	private Double latitude;
	private Double longitude;
	private Double distanciaEmKm;
	private String[] especialidadePrestador;
	
	public PrestadorVO(Prestador prestador, Double distanciaEmKm) {
		super();
		this.nome = prestador.getNome();
		this.endereco = prestador.getEndereco();
		this.latitude = prestador.getLatitude();
		this.longitude = prestador.getLongitude();
		this.distanciaEmKm = distanciaEmKm;
		this.especialidadePrestador = (String[]) prestador.getEspecialidadePrestador().toArray();
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

	public Double getDistanciaEmKm() {
		return distanciaEmKm;
	}

	public String[] getEspecialidadePrestador() {
		return especialidadePrestador;
	}	
}
