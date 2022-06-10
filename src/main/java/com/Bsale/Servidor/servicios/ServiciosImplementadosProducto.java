package com.Bsale.Servidor.servicios;

import com.Bsale.Servidor.modelos.Producto;
import com.Bsale.Servidor.repositorios.RepositorioProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosImplementadosProducto implements ServiciosProducto {
	
	@Autowired	
	private RepositorioProducto repositorioProducto;

	@Override
	public List<Producto> listarProductos() {
		
		return repositorioProducto.findAll();
	}

	@Override
	public List<Producto> listarProductosNombre(String nombre) {

		return repositorioProducto.findByNombreContaining(nombre);
	}

	@Override
	public List<Producto> ListarProductosCategoria(Long categoriaId) {

		return repositorioProducto.findByCategoriaId(categoriaId);
	}

}
