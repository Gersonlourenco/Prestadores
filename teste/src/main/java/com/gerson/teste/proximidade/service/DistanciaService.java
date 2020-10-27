package com.gerson.teste.proximidade.service;

public interface DistanciaService {
	public Double calculaDistancia(Double latitudeOrigem, Double longitudeOrigem,
			Double latitudeDestino, Double longitudeDestino) throws Exception;
}
