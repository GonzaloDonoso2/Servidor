package com.Bsale.Servidor.controladores;

import com.Bsale.Servidor.modelos.Producto;
import com.Bsale.Servidor.servicios.ServiciosProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/servidor")
@CrossOrigin("*")
public class ControladorProducto {
	
	@Autowired
	ServiciosProducto serviciosProducto;
	
	@GetMapping(path = "/productos")
	public List<Producto> listarProducto(){
		
		return serviciosProducto.listarProductos();		
	}
	
	@GetMapping(path = "/productos/productosCategoria/{categoria}")
	public List<Producto> listarProductosId(@PathVariable("categoria") Long categoriaId) {
	  
		return serviciosProducto.ListarProductosCategoria(categoriaId);
	}
	
	@GetMapping(path = "/productos/productosNombre/{nombre}")
	public List<Producto> listarProductosId(@PathVariable("nombre") String nombre) {
	  
		return serviciosProducto.listarProductosNombre(nombre);
	}
}
