package com.restfullwebservice.entity;

public class Pessoa {
	private final long idPessoa;
	private final String nome;
	private final int idade;
	
	public Pessoa(long idPessoa, String nome, int idade){
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.idade = idade;
	}

	public long getIdPessoa() {
		return idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}
