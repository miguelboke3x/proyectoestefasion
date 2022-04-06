package com.estefashion.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.estefashion.webshop.entities.Cliente;


public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
