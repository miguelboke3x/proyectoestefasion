package com.estefashion.webshop.services;

import java.util.List;

import com.estefashion.webshop.entities.Productos;

public interface IProductosService {

	public void addProductos(Productos c);

	public List<Productos> findAll();

}
