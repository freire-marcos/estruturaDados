package com.marcos.estruturaDados.vetor;

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
	
	public void adiciona(String elemento) throws Exception {
		
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			throw new Exception("Tá vendo que essa porra tá cheia não?");
		}
		
	}

}
