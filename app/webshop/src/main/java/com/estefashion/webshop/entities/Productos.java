package com.estefashion.webshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productos")
// identificador, nombre, descripcion, PVP,SN,imagen ,color_predominante, stock,
// temporada, rebajadp,

public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;
	private String descripcion;
	private float pvp;
	private String sn;
	private String imagen;
	private String colorPredominante;
	private Integer stock;
	private boolean temporada;
	private boolean rebajado;
	private int id_categoria;
	private int id_tipo_cliente;
	public Productos() {
		super();
	}
	public Productos(int identificador, String nombre, String descripcion, float pvp, String sn, String imagen,
			String colorPredominante, Integer stock, boolean temporada, boolean rebajado, int id_categoria,
			int id_tipo_cliente) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.sn = sn;
		this.imagen = imagen;
		this.colorPredominante = colorPredominante;
		this.stock = stock;
		this.temporada = temporada;
		this.rebajado = rebajado;
		this.id_categoria = id_categoria;
		this.id_tipo_cliente = id_tipo_cliente;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getColorPredominante() {
		return colorPredominante;
	}
	public void setColorPredominante(String colorPredominante) {
		this.colorPredominante = colorPredominante;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public boolean isTemporada() {
		return temporada;
	}
	public void setTemporada(boolean temporada) {
		this.temporada = temporada;
	}
	public boolean isRebajado() {
		return rebajado;
	}
	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getId_tipo_cliente() {
		return id_tipo_cliente;
	}
	public void setId_tipo_cliente(int id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}
	
}