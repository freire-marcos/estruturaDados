package com.marcos.estruturaDados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		
		this.elementos = new String[capacidade];
	}
	
//	public void adiciona(String elemento) {
//		
//		for(int i = 0; i < this.elementos.length; i++) {
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}
	
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

	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
	
	

}
