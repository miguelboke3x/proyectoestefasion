package com.estefashion.webshop.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estefashion.webshop.entities.TiposClientes;
import com.estefashion.webshop.repository.ITiposClientesRepository;

	@Service
	public class TiposClientesServiceImpl implements ITiposClientesService {

	@Autowired	
	ITiposClientesRepository repo;
	
	@Override
	public void addTiposClientes(TiposClientes c) {
		repo.save(c);
    }
	
	@Override
	public List<TiposClientes> findAll() {
		return repo.findAll();	
}
	}