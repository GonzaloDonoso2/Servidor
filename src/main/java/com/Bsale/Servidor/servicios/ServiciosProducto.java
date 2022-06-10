package com.Bsale.Servidor.servicios;

import com.Bsale.Servidor.modelos.Producto;
import java.util.List;

public interface ServiciosProducto {
	
	List<Producto>listarProductos();
	List<Producto>ListarProductosCategoria(Long categoriaId);
	List<Producto>listarProductosNombre(String nombre);
}
