package com.example.demo.model;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String sobreNome) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
}