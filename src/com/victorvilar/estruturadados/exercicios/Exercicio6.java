package com.victorvilar.estruturadados.exercicios;

import java.util.Scanner;

import com.victorvilar.estruturadados.vetor.Contato;
import com.victorvilar.estruturadados.vetor.Lista;

public class Exercicio6 {

//
//	utilize a classe lista ou vetor e classe contato
//	e desenvolva os seguintes itens:
//	1. crie um vetor com capacidade para 20 contatos
//	2. insira 30 contatos no vetor
//	crie um exemplo de utilização de cada metodo da lista

	public static void main(String[] args) {
		
		//variaveis
		Lista<Contato> lista = new Lista<Contato>(20);
		Scanner sc = new Scanner(System.in);
		criarContatosDinamicamente(20, lista);
		int opcao = 1;
		
		
		//começando o programa
		
		while(opcao != 0) {
			opcao = menuObterOpcao(sc);
		
		switch(opcao) {
		case 1:
			adicionarNovoUsuario(sc, lista);
			break;
		case 2:
			adicionarNovoUsuarioPorPosicao(sc,lista);
			break;
		}
		
		}
		
		
		System.out.println("Programa terminado");
		

	}
	
	
	
	
	private static void adicionarNovoUsuario(Scanner sc, Lista<Contato> lista) {
		Contato cc;
		String nome;
		String email;
		
		System.out.print("Informe o nome do usuario: ");
		nome = sc.nextLine();
		System.out.print("Informe o email do usuario: ");
		email = sc.nextLine();
		
		cc = new Contato();
		cc.setNome(nome);
		cc.setEmail(email);	
		lista.adicionar(cc);
		System.out.print("Usuario Cadastrado com Sucesso !");
		System.out.print(cc + "\n\n\n ");
		
	}
	
	private static void adicionarNovoUsuarioPorPosicao( Scanner sc, Lista<Contato> lista) {
		Contato cc;
		String nome;
		String email;
		int posicao = 0;
		boolean entradaValida = false;
		
		System.out.print("Informe o nome do usuario: ");
		nome = sc.nextLine();
		System.out.print("Informe o email do usuario: ");
		email = sc.nextLine();
		
		while(!entradaValida) {
			try {
				System.out.print("Informe a posicao: ");
				posicao = Integer.parseInt(sc.nextLine());
				entradaValida = true;
			}catch(Exception e) {
				System.out.println("Entrada Invalida Digite novamente\n\n\n");
			}
		}
		cc = new Contato();
		cc.setNome(nome);
		cc.setEmail(email);	
		lista.adicionar(cc,posicao);
		System.out.print("Usuario Cadastrado com Sucesso !");
		System.out.print(cc + "\n\n\n ");
		
	}
	
	
	
	
	
	
	
	
	private static int menuObterOpcao(Scanner sc) {
		int opcao;
		boolean entradaValida = false;
		String entrada;
		while(!entradaValida) {
			System.out.println("Digite a opção desejada");
			System.out.println("1. Adiciona contato no final do vetor");
			System.out.println("2. Adiciona contato em opcao especifica");
			System.out.println("3. Obtem contato em opcao especifica");
			System.out.println("4. Consulta contato");
			System.out.println("5. Consulta ultimo indice do contato");
			System.out.println("6. Verifica se o Contato existe");
			System.out.println("7. remove por posiçao");
			System.out.println("8. excluir contato");
			System.out.println("9. Verifica tamanho");
			System.out.println("10. limpar vetor");
			System.out.println("11. imprime vetor");
			System.out.println("0. sair");
			
			try {
				entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);	
				if(opcao >=0 && opcao<=11) {
					entradaValida = true;
					return opcao;
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println("Entrada Invalida Digite novamente\n\n\n");
			}
		}
		
		return 0; 
	}
	
	
	
	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato cc;
		for(int x = 0; x <= quantidade ; x++) {
			cc = new Contato();
			cc.setNome("Nome:" + x);
			cc.setEmail("Email:contato." + x + "@.com.br");
			lista.adicionar(cc);
		}
	}
	
	
}
