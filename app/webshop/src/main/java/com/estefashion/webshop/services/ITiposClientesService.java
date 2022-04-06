package com.estefashion.webshop.services;

import java.util.List;
import com.estefashion.webshop.entities.TiposClientes;

public interface ITiposClientesService {

	public void addTiposClientes(TiposClientes c);

	public List<TiposClientes> findAll();
}
