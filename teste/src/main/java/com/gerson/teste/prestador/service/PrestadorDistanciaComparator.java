package com.gerson.teste.prestador.service;

import java.util.Comparator;

import com.gerson.teste.prestador.PrestadorVO;

public class PrestadorDistanciaComparator implements Comparator<PrestadorVO> {

	@Override
	public int compare(PrestadorVO o1, PrestadorVO o2) {
		return (int)(o1.getDistanciaEmKm() - o2.getDistanciaEmKm());
	}

}
