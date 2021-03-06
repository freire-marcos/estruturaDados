package com.marcos.estruturaDados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	
	public String getElementos(int posicao){
		return this.elementos[posicao];
	}

	public Vetor(int capacidade) {

		this.elementos = new String[capacidade];
	}

	
	public boolean adiciona(String elemento){

		if(this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	public int tamanho() {
		return this.tamanho;
	}



	
	public int busca(String elemento){
		
		for (int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equalsIgnoreCase(elemento)){
				return i;
			}
		}
		return -1;
	}


	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for(int i = 0; i < this.tamanho - 1; i++){

			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho > 0){
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");


		//		return Arrays.toString(elementos);
		return s.toString();
	}



}
