package com.victorvilar.estruturadados.teste;

import com.victorvilar.estruturadados.vetor.VetorDeObjetos;

public class TesteVetorDeObjetos {

	public static void main(String[] args) {
		
		VetorDeObjetos vt = new VetorDeObjetos(5);

		
		//nao é uma boa pratica
		//pois os valores tem que ser do mesmo tipo
		vt.adicionar(1);
		vt.adicionar("string");
		
		
		
		
		
	}

}
