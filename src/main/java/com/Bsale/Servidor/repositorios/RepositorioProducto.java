package com.Bsale.Servidor.repositorios;

import com.Bsale.Servidor.modelos.Producto;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface RepositorioProducto extends Repository<Producto, Long> {
	
	List<Producto>findAll();
	List<Producto>findByCategoriaId(Long categoriaId);
	List<Producto>findByNombreContaining(String nombre);
}
