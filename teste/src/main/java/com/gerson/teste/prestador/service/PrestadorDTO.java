package com.gerson.teste.prestador.service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Esta classe é utilizada para transportar os dados necessários para a
 * persistência de uma {@link Agenda}.
 * 
 * @author 04225778126
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrestadorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double latitude;
	private Double longitude;
	private List<LocalDate> datasDisponibilizadas;
}