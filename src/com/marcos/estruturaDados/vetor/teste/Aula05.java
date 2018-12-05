package com.marcos.estruturaDados.vetor.teste;

import com.marcos.estruturaDados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("teste 1");
		vetor.adiciona("teste 2");
		vetor.adiciona("teste 3");
		
		
		System.out.println("blz, t·Ì o elemento: " + vetor.getElementos(vetor.busca("testE 1")));
	}

}
