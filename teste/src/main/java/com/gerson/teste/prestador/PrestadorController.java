package com.gerson.teste.prestador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.gerson.teste.prestador.service.PrestadorService;


@RestController
@RequestMapping("/api/prestadores")
public class PrestadorController {
	
	@Autowired
	private PrestadorService prestadorService;

	@RequestMapping(value="/{latitude}/{longitude}/{especialidade}", method=RequestMethod.GET)
	public ResponseEntity<List<PrestadorVO>> obterPrestadoresSaude(@PathVariable("latitude") Double latitude, 
			@PathVariable("longitude") Double longitude, @PathVariable("especialidade") String especialidade) {
		return ResponseEntity.ok(prestadorService.obterPrestadoresProximidade(latitude, longitude, especialidade));
	}

}