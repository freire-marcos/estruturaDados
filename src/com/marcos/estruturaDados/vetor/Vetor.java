package com.marcos.estruturaDados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	

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


//	public String busca(int posicao) throws Exception{
//
//		if(!(posicao >= 0 && posicao <= this.tamanho)){
//			
//			throw new Exception("tá maluco, porra?");
//		}
//		return this.elementos[posicao];
//		
//	}
	
	public boolean busca(String elemento){
		
		for (int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equalsIgnoreCase(elemento)){
				return true;
			}
		}
		return false;
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
