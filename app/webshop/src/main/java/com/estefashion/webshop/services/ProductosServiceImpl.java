package com.estefashion.webshop.services;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estefashion.webshop.entities.Productos;

import com.estefashion.webshop.repository.IProductosRepository;


@Service
public class ProductosServiceImpl implements IProductosService{
	
	@Autowired
	IProductosRepository repo;
	
	@Override
	public void addProductos(Productos c) {
		repo.save(c);	
}
	@Override
	public List<Productos> findAll() {
		return repo.findAll();	
}
}