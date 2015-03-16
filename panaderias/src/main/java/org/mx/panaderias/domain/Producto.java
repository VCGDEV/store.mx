package org.mx.panaderias.domain;

import javafx.fxml.FXML;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import java.math.BigDecimal;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.Set;
import java.util.HashSet;
/**
* @Author vcgdev
* @version 1.0
* Producto
*/
@Entity
@Table(name="Producto")
public class Producto implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idProducto")
	private int idProducto;
	@Column(name="codigo",nullable=false)
	private String codigo;
	@Column(name="descripcion",nullable=false)
	private String descripcion;
	@Column(name="idFamilias")
	private int idFamilia;
	@Column(name="idUnidades")
	private int idUnidad;
	@Column(name="precioCompra",nullable=false)
	private Double precioCompra;
	@Column(name="precioVenta",nullable=false)
	private Double precioVenta;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="pk.producto")
	private Set<AlmacenProducto> almacenes = new HashSet<AlmacenProducto>(0);

	public void setIdProducto(int idProducto){ this.idProducto = idProducto; }
	public int getIdProducto(){ return this.idProducto; }
	public void setCodigo(String codigo){ this.codigo=codigo; }
	public String getCodigo(){ return this.codigo; }
	public void setDescripcion(String descripcion){ this.descripcion = descripcion; }
	public String getDescripcion(){return this.descripcion; }
	public void setIdFamilia(int idFamilia){ this.idFamilia = idFamilia; }
	public int getIdFamilia(){ return this.idFamilia; }
	public void setIdUnidad(int idUnidad){ this.idUnidad = idUnidad; }
	public int getIdUnidad(){ return this.idUnidad; }
	public void setPrecioCompra(Double precioCompra){ this.precioCompra = precioCompra; }
	public Double getPrecioCompra(){ return this.precioCompra; }
	public void setPrecioVenta(Double precioVenta){ this.precioVenta = precioVenta; }
	public Double getPrecioVenta(){ return this.precioVenta; }

	
	public Set<AlmacenProducto> getAlmacenes(){ 
		return this.almacenes;
	}

	public void setAlmacenes(Set<AlmacenProducto> almacenes){
		this.almacenes = almacenes;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", idFamilia=" + idFamilia
				+ ", idUnidad=" + idUnidad + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", almacenes=" + almacenes
				+ "]";
	}
	
	
}

