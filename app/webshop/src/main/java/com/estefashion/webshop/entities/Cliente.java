package com.estefashion.webshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "clientes")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private boolean suscripcion_nl;
	private String direccion_envio;
	private String telefono;
	private boolean activo;
	public Cliente() {
	}
	public Cliente(int identificador, String nombre, String apellidos, String email, String password,
			boolean suscripcion_nl, String direccion_envio, String telefono, boolean activo) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.suscripcion_nl = suscripcion_nl;
		this.direccion_envio = direccion_envio;
		this.telefono = telefono;
		this.activo = activo;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSuscripcion_nl() {
		return suscripcion_nl;
	}
	public void setSuscripcion_nl(boolean suscripcion_nl) {
		this.suscripcion_nl = suscripcion_nl;
	}
	public String getDireccion_envio() {
		return direccion_envio;
	}
	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}