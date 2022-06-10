package com.Bsale.Servidor.servicios;

import com.Bsale.Servidor.modelos.Categoria;
import com.Bsale.Servidor.repositorios.RepositorioCategoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosImplementadosCategoria implements ServiciosCategoria {
	
	@Autowired	
	private RepositorioCategoria repositorioCategoria;

	@Override
	public List<Categoria> listarCategorias() {
		
		return repositorioCategoria.findAll();
	}
}
