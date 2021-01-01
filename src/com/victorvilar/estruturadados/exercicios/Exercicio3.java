package com.victorvilar.estruturadados.exercicios;

import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio3 {

	//melhore a classe Lista e implemente o metodo remove o elemento,
	//semelhando o metodo lastIndexOf da classe ArrayList;


	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("A");
		lista.adicionar("A");
		lista.adicionar("A");
		
		lista.removeElemento("A");
		lista.removeElemento("A");
		System.out.println(lista);
		
		
	}
	
	
	
	
}
