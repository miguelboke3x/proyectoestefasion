package com.estefashion.webshop.restcontrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estefashion.webshop.entities.Productos;
import com.estefashion.webshop.services.IProductosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ResProductosControler {
	@Autowired
	IProductosService ips;
	
	
		
		@GetMapping(path="/productos", produces= {MediaType.APPLICATION_JSON_VALUE})
		List<Productos> getProductos(){
			return ips.findAll();
		}
	

	}