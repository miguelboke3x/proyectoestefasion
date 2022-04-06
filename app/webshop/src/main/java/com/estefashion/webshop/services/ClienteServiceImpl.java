package com.estefashion.webshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estefashion.webshop.entities.Cliente;
import com.estefashion.webshop.repository.IClienteRepository;



@Service
public class ClienteServiceImpl implements IClienteService {
		
		@Autowired
		IClienteRepository repo;
		
		@Override
		public void addCliente (Cliente c){
			repo.save(c);
		}
		@Override
		public List<Cliente> findAll() {
			return repo.findAll();
	}

}
