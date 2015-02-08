package org.mx.panaderias.domain;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/**
* @Autor vcgdev
* @version 1.0
* Se manejan almacenes por separado
*/
@Entity
@Table(name="Almacen")
public class Almacen implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idAlmacen")
	private int idAlmacen;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="idDireccion")
	private int idDireccion;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="pk.almacen",cascade=CascadeType.ALL)			
	private Set<AlmacenProducto> productos = new HashSet<AlmacenProducto>(0);
	
	public void setProductos(Set<AlmacenProducto> productos){
		this.productos = productos;
	}
	
	public Set<AlmacenProducto> getProductos(){
		return this.productos;
	}
	
	public void setIdAlmacen(int idAlmacen)	{ this.idAlmacen = idAlmacen; }
	public int getIdAlmacen(){ return this.idAlmacen; }
	public void setNombre(String nombre){ this.nombre = nombre; }
	public String getNombre(){ return this.nombre; }
	public void setIdDireccion(int idDireccion){ this.idDireccion = idDireccion; }
	public int getIdDireccion(){ return this.idDireccion; }
	
}
