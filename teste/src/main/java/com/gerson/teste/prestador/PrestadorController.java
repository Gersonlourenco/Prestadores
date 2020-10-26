package com.gerson.teste.prestador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerson.teste.prestador.service.PrestadorDTO;
import com.gerson.teste.prestador.service.PrestadorService;

/**
 * Esta classe implementa uma API REST para a interação com a entidade
 * {@link Prestador}
 * 
 * @author Gerson Carvalho
 *
 */
@RestController
@RequestMapping("/api/prestadores")
public class PrestadorController {
	
	@Autowired
	private PrestadorService prestadorService;

	@PostMapping
	public ResponseEntity<List<Prestador>> obterPrestadoresSaude(@RequestBody PrestadorDTO prestadorDTO) {
		List<Prestador> prestadores = prestadorService.obterPrestadoresProximidade(prestadorDTO);
		return ResponseEntity.ok(prestadores);
	}

}