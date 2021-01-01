package com.victorvilar.estruturadados.exercicios;

import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio4 {

	//melhore a classe Lista e implemente o metodo get ,
	//semelhando o metodo get da classe ArrayList;


	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		
		
		String a = lista.obtem(2);
		System.out.println(a);
		
		
		
	}
	
	
	
	
}
