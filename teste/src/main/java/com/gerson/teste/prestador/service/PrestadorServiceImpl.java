package com.gerson.teste.prestador.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.gerson.teste.prestador.Prestador;

/**
 * @author 04225778126
 *
 */
@Service
public class PrestadorServiceImpl implements PrestadorService {

	/*private AgendaRepository agendaRepository;

	private AgendaFactory agendaFactory;

	@Autowired
	public PrestadorServiceImpl(AgendaRepository agendaRepository, AgendaFactory agendaFactory) {
		this.agendaRepository = agendaRepository;
		this.agendaFactory = agendaFactory;
	}*/

	@Override
	public List<Prestador> obterPrestadoresProximidade(PrestadorDTO prestadorDTO) {
		// persist
		//return this.agendaRepository.save(agendaFactory.createFrom(agendaDTO));
		return null;
	}

}
