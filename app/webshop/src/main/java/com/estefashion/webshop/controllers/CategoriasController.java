
package com.estefashion.webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Categoria;
import com.estefashion.webshop.entities.Productos;
import com.estefashion.webshop.entities.TiposClientes;
import com.estefashion.webshop.services.ICategoriasService;
import com.estefashion.webshop.services.IClienteService;
import com.estefashion.webshop.services.IProductosService;
import com.estefashion.webshop.services.ITiposClientesService;

@Controller
public class CategoriasController {
	@Autowired
	private ICategoriasService categoriasService;

	@Autowired
	private ITiposClientesService tiposClientesService;

	@Autowired
	private IProductosService ProductosService;

	
	@RequestMapping(value = "/crearCategorias")
	public ModelAndView crearNuevaCategoria(
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String imagen) {
		if (nombre != null) {
			Categoria c = new Categoria(nombre, imagen);
			categoriasService.addCategorias(c);
			return new ModelAndView("redirect:/crearCategorias");

		}
		List<Categoria> categoria = categoriasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_categoria");
		mav.addObject("tipos_categorias", categoria);
		return mav;
	}
	@RequestMapping(value = "/borrarCategorias") 
	public ModelAndView borrarCategorias( 
			@RequestParam(required=false) Integer id){ 
			categoriasService.delete(id);
			return new ModelAndView("redirect:./crearCategorias");
		}

	@RequestMapping(value = "/crearTiposClientes")
	public ModelAndView crearNuevoTiposClientes(
			@RequestParam(required = false) String nombre) {
		if (nombre != null) {
			TiposClientes c = new TiposClientes(nombre);
			tiposClientesService.addTiposClientes(c);

		}
		List<TiposClientes> tiposClientes = tiposClientesService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_tiposclientes");
		mav.addObject("tipos_tiposClientes", tiposClientes);
		return mav;
	}

	@RequestMapping(value = "/crearProductos")
	public ModelAndView crearNuevoProductos(

			@RequestParam(required = false) String nombre, 
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) Float pvp, 
			@RequestParam(required = false) String sn,
			@RequestParam(required = false) String imagen, 
			@RequestParam(required = false) String colorPredominante,
			@RequestParam(required = false) Integer stock, 
			@RequestParam(required = false) Boolean temporada,
			@RequestParam(required = false) Boolean rebajado, 
			@RequestParam(required = false) Integer id_categorias,
			@RequestParam(required = false) Integer id_tipo_cliente) {
		if (nombre != null) {
			temporada = temporada==null? false : true;
			rebajado = rebajado==null? false: true;
			Productos c = new Productos(-1, nombre, descripcion, pvp, sn, imagen, colorPredominante, stock, true, true,
					id_categorias, id_tipo_cliente);
			ProductosService.addProductos(c);

		}
		List<Productos> Productos = ProductosService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_Productos");
		mav.addObject("tipos_productos", Productos);
		return mav;
	}
	
}