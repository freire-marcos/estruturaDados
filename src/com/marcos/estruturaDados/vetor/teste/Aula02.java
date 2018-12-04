package com.marcos.estruturaDados.vetor.teste;

import com.marcos.estruturaDados.vetor.Vetor;

public class Aula02 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);
		
		try {
			vetor.adiciona("puta merda");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			vetor.adiciona("vai procurar uq fazer man");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			vetor.adiciona("vai procurar uq fazer man");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("e aean");
	}

}
