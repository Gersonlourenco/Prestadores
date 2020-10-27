package com.gerson.teste.prestador.service;

import java.util.List;

import com.gerson.teste.prestador.PrestadorVO;

public interface PrestadorService {
	public List<PrestadorVO> obterPrestadoresProximidade(Double latitude, Double longitude, String especialidade);
}
