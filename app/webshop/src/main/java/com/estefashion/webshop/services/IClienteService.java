package com.estefashion.webshop.services;

import java.util.List;




import com.estefashion.webshop.entities.Cliente;


public interface IClienteService {
	public void addCliente (Cliente c);

	public List<Cliente> findAll();
}
