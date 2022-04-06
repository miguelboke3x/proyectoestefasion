package com.estefashion.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.estefashion.webshop.entities.Productos;

public interface IProductosRepository extends 
JpaRepository<Productos, Integer>{

}
