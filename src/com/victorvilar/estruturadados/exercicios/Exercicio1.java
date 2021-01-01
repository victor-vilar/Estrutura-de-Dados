package com.victorvilar.estruturadados.exercicios;

import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio1 {

	//melhore a classe Lista e implemente o metodo contem,
	//semelhando o metodo contains da classe ArrayList;

	

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("a");
		lista.adicionar("b");
		lista.adicionar("c");
		System.out.println(lista.contem("a"));
		System.out.println(lista.contem("b"));
		System.out.println(lista.contem("c"));
		System.out.println(lista.contem("d"));
		
		
	}
	
	
	
	
}
