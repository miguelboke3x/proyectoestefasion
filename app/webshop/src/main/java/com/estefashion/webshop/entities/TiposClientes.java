package com.estefashion.webshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipos_clientes")
public class TiposClientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;

	public TiposClientes() {
		super();
	}
	
	
	public TiposClientes(String nombre) {
		this.nombre = nombre;
	}

	public TiposClientes(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
