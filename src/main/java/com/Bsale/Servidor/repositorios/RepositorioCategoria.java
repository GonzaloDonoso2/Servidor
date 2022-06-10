package com.Bsale.Servidor.repositorios;

import com.Bsale.Servidor.modelos.Categoria;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface RepositorioCategoria extends Repository<Categoria, Long> {
	
	List<Categoria>findAll();
}
