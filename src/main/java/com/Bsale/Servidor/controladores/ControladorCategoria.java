package com.Bsale.Servidor.controladores;

import com.Bsale.Servidor.modelos.Categoria;
import com.Bsale.Servidor.servicios.ServiciosCategoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/servidor")
@CrossOrigin("*")
public class ControladorCategoria {
	
	@Autowired
	ServiciosCategoria serviciosCategoria;
	
	@GetMapping(path = "/categorias")
	public List<Categoria> listarCategorias(){
		
		return serviciosCategoria.listarCategorias();		
	}
}
