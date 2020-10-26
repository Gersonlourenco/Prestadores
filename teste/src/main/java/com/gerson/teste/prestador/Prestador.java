package com.gerson.teste.prestador;


import lombok.Getter;
import lombok.Setter;
import java.util.List;
import com.gerson.teste.especialidade_prestador.EspecialidadePrestador;

@Getter
@Setter
public class Prestador {
	private long id;
	private String nome;
	private String endereco;
	private Double latitude;
	private Double longitude;
	private Double distanciaEmKm;
	private List<EspecialidadePrestador> especialidadePrestador;
}
