package com.victorvilar.estruturadados.teste;

import com.victorvilar.estruturadados.vetor.Vetor;

public class Teste {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		vetor.adicionar("Elemento1");
		vetor.adicionar("Elemento2");
		vetor.adicionar("Elemento3");
		vetor.adicionar("Elemento4");
		int i = vetor.getTamanho();
		System.out.println(i);
		
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca("Elemento2"));
		
		vetor.adicionar("rtes", 0);
		vetor.remove(1);
		System.out.println(vetor.toString());
		System.out.println(vetor.getTamanho());
		
		
		
		
	}

}
