package com.victorvilar.estruturadados.vetor;

public class Contato {

	public String nome;
	public String email;
			
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		s.append(this.getNome());
		s.append(",");
		s.append(this.getEmail());
		s.append("]");
		return s.toString();
	}
	
}
