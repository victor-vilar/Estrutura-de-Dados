package com.victorvilar.estruturadados.exercicios;

import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio5 {

//
//	melhore a classe lista e implemente o metodo limpar, onde
//	todos os elemtnso da lista são removidos.
//	esse metodo é semelhante ao metodo clear da classe array list


	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		
		
		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);	
	}
	
	
	
	
}
