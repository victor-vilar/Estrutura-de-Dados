package com.victorvilar.estruturadados.exercicios;

import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio2 {

	//melhore a classe Lista e implemente o metodo ultimo indice,
	//semelhando o metodo lastIndexOf da classe ArrayList;


	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("A");
		lista.adicionar("A");
		lista.adicionar("A");
		
		int i = lista.UltimoIndice("B");
		System.out.println(i);
		
		
	}
	
	
	
	
}
