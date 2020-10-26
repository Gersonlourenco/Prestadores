package com.gerson.teste.prestador.service;

import java.util.List;

import com.gerson.teste.prestador.Prestador;

public interface PrestadorService {
	/**
	 * @param agendaDTO os dados da {@link Prestador}, contendo id do
	 *                  {@link Voluntario} e as datas informadas
	 * @return Uma nova {@link Prestador} persistida na base
	 */
	public List<Prestador> obterPrestadoresProximidade(PrestadorDTO prestadorDTO);
}
