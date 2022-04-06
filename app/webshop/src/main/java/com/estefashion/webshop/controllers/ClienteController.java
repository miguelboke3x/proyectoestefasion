package com.estefashion.webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Cliente;
import com.estefashion.webshop.services.IClienteService;

@Controller
public class ClienteController {
	@Autowired
	private IClienteService ClienteService;

	@RequestMapping(value = "/crearCliente")
	public ModelAndView crearNuevoCliente(@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String apellidos, @RequestParam(required = false) String email,
			@RequestParam(required = false) String password, @RequestParam(required = false) Boolean suscripcion_nl,
			@RequestParam(required = false) String direccion_envio, @RequestParam(required = false) String telefono,
			@RequestParam(required = false) Boolean activo) {
		if (nombre != null) {
			Cliente c = new Cliente(-1, nombre, apellidos, email, password, suscripcion_nl, direccion_envio, telefono, activo);
			ClienteService.addCliente(c);

		}
		List<Cliente> clientes = ClienteService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_Cliente");
		mav.addObject("tipos_Cliente", clientes);
		return mav;
	}
}