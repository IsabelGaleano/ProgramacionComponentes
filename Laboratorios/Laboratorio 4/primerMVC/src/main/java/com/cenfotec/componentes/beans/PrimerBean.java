package com.cenfotec.componentes.beans;

public class PrimerBean {
	private String name;
	private int numero;

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Integer getDiscriminante() {
		return this.numero / 2;
	}
}
