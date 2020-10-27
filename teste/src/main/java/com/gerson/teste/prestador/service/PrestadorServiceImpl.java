package com.gerson.teste.prestador.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerson.teste.prestador.PrestadorRepository;
import com.gerson.teste.prestador.PrestadorVO;
import com.gerson.teste.prestador.model.EspecialidadePrestador;
import com.gerson.teste.prestador.model.Prestador;
import com.gerson.teste.proximidade.service.DistanciaService;

/**
 * @author 04225778126
 *
 */
@Service
public class PrestadorServiceImpl implements PrestadorService {
	
	@Autowired
	DistanciaService distanciaService;
	
	@Autowired
	PrestadorRepository prestadorRepository;

	@Override
	public List<PrestadorVO> obterPrestadoresProximidade(Double latitude, Double longitude, String especialidade) {
		List<PrestadorVO> listPrestadorVO = new ArrayList<>();
		
		List<Prestador> listPrestador = prestadorRepository
				.findByEspecialidade(new EspecialidadePrestador(especialidade));
		
		for (Prestador prestador : listPrestador) {
			try {
				Double distanciaEmKm = distanciaService.calculaDistancia(latitude, longitude, prestador.getLatitude(), prestador.getLongitude());
				listPrestadorVO.add(new PrestadorVO(prestador, distanciaEmKm));				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		listPrestadorVO.sort(new PrestadorDistanciaComparator());
		
		return listPrestadorVO;
	}

}
