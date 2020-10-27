package com.gerson.teste.proximidade.service;

import com.gerson.teste.proximidade.DistanciaClient;
import com.gerson.teste.proximidade.model.Matrix;

public class DistanciaServiceImpl implements DistanciaService{
	
	DistanciaClient distanciaClient = new DistanciaClient();
	
	public Double calculaDistancia(Double latitudeOrigem, Double longitudeOrigem,
			Double latitudeDestino, Double longitudeDestino) throws Exception {
		Matrix matrix = distanciaClient.sendGet(latitudeOrigem, longitudeOrigem, latitudeDestino, longitudeDestino);
		
		//Apenas para testes como não tenho acesso a API
		return matrix != null ? matrix.getRows()[0].getElements()[0].getDistance().getValue() 
				: latitudeOrigem - longitudeDestino;
	}
}
