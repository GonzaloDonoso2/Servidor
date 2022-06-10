package com.Bsale.Servidor.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Producto {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String nombre;
	
	@Column(name = "url_image")
	private String imagen;
	
	@Column(name = "price")
	private Integer precio;
	
	@Column(name = "discount")
	private Integer descuento;
	
	@ManyToOne	
	@JoinColumn(name = "category")
	Categoria categoria;

	public Producto() {};

	public Producto(Long id, String nombre, String imagen, Integer precio, Integer descuento, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
		this.descuento = descuento;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	};
}
