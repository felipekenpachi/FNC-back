package com.example.demo.domain;

public class Procedimento {
	private int codigo;
	private String nome;
	private int prazoDias;

	public Procedimento() {

	}

	public Procedimento(int codigo, String nome, int prazoDias) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.prazoDias = prazoDias;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrazoDias() {
		return prazoDias;
	}

	public void setPrazoDias(int prazoDias) {
		this.prazoDias = prazoDias;
	}

}
