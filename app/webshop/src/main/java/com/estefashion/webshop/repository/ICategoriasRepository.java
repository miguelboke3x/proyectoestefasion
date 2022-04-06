package com.estefashion.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.estefashion.webshop.entities.Categoria;

public interface ICategoriasRepository extends 
JpaRepository<Categoria, Integer>{

}