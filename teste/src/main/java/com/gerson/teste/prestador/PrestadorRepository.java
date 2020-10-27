package com.gerson.teste.prestador;

import java.util.ArrayList;
import java.util.List;

import com.gerson.teste.prestador.model.EspecialidadePrestador;
import com.gerson.teste.prestador.model.Prestador;

public class PrestadorRepository {
	
	public List<Prestador> findByEspecialidade(EspecialidadePrestador especialidade) {
		List<Prestador> listPrestador = new ArrayList<>();
		
		for (Prestador prestador : buildPrestadores()) {
			if(prestador.getEspecialidadePrestador().contains(especialidade)) {
				listPrestador.add(prestador);
			}
		}
		
		return listPrestador;
	}

	private List<Prestador> buildPrestadores() {
		// criação de tipo prestadores
		EspecialidadePrestador cardiologia = new EspecialidadePrestador("Cardiologia");
		EspecialidadePrestador dermatologia = new EspecialidadePrestador("Dermatologia");
		EspecialidadePrestador oftalmologia = new EspecialidadePrestador("Oftalmologia");
		
		// Alimenta prestadores
		List<Prestador> listPrestador = new ArrayList<>();
		listPrestador.add(new Prestador("Fulano 1", "endereco", 30.0, 30.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 2", "endereco", 31.0, 31.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 3", "endereco", 32.0, 32.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 4", "endereco", 33.0, 33.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 5", "endereco", 34.0, 34.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 6", "endereco", 35.0, 35.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 7", "endereco", 36.0, 36.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 8", "endereco", 37.0, 37.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 9", "endereco", 38.0, 38.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 10", "endereco", 39.0, 39.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 11", "endereco", 40.0, 40.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 12", "endereco", 41.0, 41.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 13", "endereco", 42.0, 42.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 14", "endereco", 43.0, 43.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 15", "endereco", 44.0, 44.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 16", "endereco", 45.0, 45.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 17", "endereco", 46.0, 46.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 18", "endereco", 47.0, 47.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 19", "endereco", 48.0, 48.0, new ArrayList<>()));
		listPrestador.add(new Prestador("Fulano 20", "endereco", 49.0, 49.0, new ArrayList<>()));
		return listPrestador;
	}
}
