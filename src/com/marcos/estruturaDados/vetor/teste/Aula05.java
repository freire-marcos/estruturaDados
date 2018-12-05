package com.marcos.estruturaDados.vetor.teste;

import com.marcos.estruturaDados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("teste 1");
		vetor.adiciona("teste 2");
		vetor.adiciona("teste 3");

		
		if(vetor.busca("tEstE 1")){
			System.out.println("blz tá aí");
		}
		else{
			System.out.println("se faz de doido?");
		}
	}

}
