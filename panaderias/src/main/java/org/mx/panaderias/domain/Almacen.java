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
/**
* @Autor vcgdev
* @version 1.0
* Se manejan almacenes por separado
*/
@Entity
@Table(name="Almacen")
public class Almacen implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAlmacen")
	private int idAlmacen;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="idDireccion")
	private int idDireccion;
			
	private Set<Producto> productos = new HashSet<Producto>(0);
	
	public void setProductos(Set<Producto> productos){
		this.productos = productos;
	}

	@OnetToMany(fetch=FetchType.LAZY,mappedBy="pk.almacen",cascade=CascadeType.ALL)
	public Set<Producto> getProductos(){
		return this.productos;
	}
	
	public void setIdAlmacen(int idAlmacen)	{ this.idAlmacen = idAlmacen; }
	public int getIdAlmacen(){ return this.idAlmacen; }
	public void setNombre(String nombre){ this.nombre = nombre; }
	public String getNombre(){ return this.nombre; }
	public void setIdDireccion(int idDireccion){ this.idDireccion = idDireccion; }
	public int getIdDireccion(){ return this.idDireccion; }
	
}
