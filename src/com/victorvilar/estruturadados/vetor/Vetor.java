package com.victorvilar.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanhoDoVetor = 0;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}
	
//	dessa maneira todas as vezes que fosse necessario adicionar
//	um novo objeto no array sempre teria que iterar
//	desse forma conforme o array fosse ficando maior, mais lento
//	ficaria o programa
//	public void adiciona(String string) {
//		for(int x = 0 ; x < this.elementos.length; x++) {
//			if(elementos[x] == null) {
//				this.elementos[x] = string;
//				break;
//			}
//		}
//	}
	
	//adicionar
	public boolean adicionar(String string) {
		if(this.tamanhoDoVetor < this.elementos.length) {
			this.elementos[this.tamanhoDoVetor] = string;
			this.tamanhoDoVetor++;
			this.aumentaCapacidade();
			return true;
		}
		return false;
	}
	
	//adicionar em uma posição
	public void adicionar(String string, int indice) throws IllegalArgumentException {
		if(!(indice < tamanhoDoVetor && indice >=0)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		for(int i = this.tamanhoDoVetor - 1; i >= indice; i--) {
			this.elementos[i + 1] = this.elementos[i];
			
		}
		
		this.elementos[indice] = string;
		this.tamanhoDoVetor++;
		this.aumentaCapacidade();
		
	}
	
	
	
	public int getTamanho() {
		return this.tamanhoDoVetor;
	}
	
	//a classe Array possui metodos para manipulação de arrays
	//conforme o exemplo abaixo
	//classe string builder
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanhoDoVetor - 1; i++ ) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		s.append(this.elementos[this.tamanhoDoVetor - 1] );
		s.append("]");
		return s.toString();
	}
	
	
	public String busca(int index)throws IllegalArgumentException {
		if(!(index < tamanhoDoVetor && index >=0)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		return this.elementos[index];
	}
	
	
	public int busca(String elemento) {
		for(int x = 0; x < this.tamanhoDoVetor; x++) {
			if(elemento.equals(this.elementos[x])) {
				return x;
			}
		}
		return -1;
	}
	
	
	//aumentando a capacidade
	private void aumentaCapacidade() {
		if(this.tamanhoDoVetor == this.elementos.length) {
			String[] novoVetor = new String[this.tamanhoDoVetor * 2];
			for(int i = 0; i< this.tamanhoDoVetor ; i++) {
				novoVetor[i] = this.elementos[i];
			}
			this.elementos = novoVetor;
		}
		
	}
	
	//remover
	public void remove(int indice) {
		if(!(indice < tamanhoDoVetor && indice >=0)) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		for(int x = indice; x < tamanhoDoVetor - 1 ; x ++ ) {
			this.elementos[x] = this.elementos[x+1];
			
		}
		this.tamanhoDoVetor--;
		
	}
	

	
	
	
	
	
}
