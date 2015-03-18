<<<<<<< HEAD
package org.mx.panaderias.domain;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Transient;

import java.math.BigDecimal;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import org.hibernate.annotations.AccessType;

import java.util.Set;
import java.util.HashSet;
/**
* @Author vcgdev
* @version 1.0
* Producto
*/
@Entity
@Table(name="Productos")
@Access(javax.persistence.AccessType.PROPERTY)
public class Producto implements java.io.Serializable{

	private int idProducto;

	private String codigo;
	
	private String descripcion;
	
	private int idFamilia;
	
	private int idUnidad;
	
	private Double precioCompra;
	
	private Double precioVenta;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="pk.producto")
	private Set<AlmacenProducto> almacenes = new HashSet<AlmacenProducto>(0);

	@Transient private IntegerProperty idProductoP = new SimpleIntegerProperty();
	@Transient private StringProperty codigoP = new SimpleStringProperty();
	@Transient private StringProperty descripcionP = new SimpleStringProperty();
	@Transient private IntegerProperty idFamiliaP = new SimpleIntegerProperty();
	@Transient private IntegerProperty idUnidadP  = new SimpleIntegerProperty();
	@Transient private DoubleProperty precioCompraP = new SimpleDoubleProperty();
	@Transient private DoubleProperty precioVentaP = new SimpleDoubleProperty();
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idProducto")
	public int getIdProducto() {
		return idProductoP.getValue();
	}
	public void setIdProducto(int idProducto) {
		this.idProductoP.setValue(idProducto);
	}
	@Column(name="codigo",nullable=false)
	public String getCodigo() {
		return codigoP.getValue();
	}
	public void setCodigo(String codigo) {
		this.codigoP.setValue(codigo);
	}
	public String getDescripcion() {
		return descripcionP.getValue();
	}
	@Column(name="descripcion",nullable=false)
	public void setDescripcion(String descripcion) {
		this.descripcionP.setValue(descripcion);
	}
	@Column(name="idFamilia")
	public int getIdFamilia() {
		
		return idFamiliaP.getValue();
	}
	public void setIdFamilia(int idFamilia) {
		this.idFamiliaP.setValue(idFamilia);
	}
	@Column(name="idUnidad")
	public int getIdUnidad() {
		return idUnidadP.getValue();
	}
	public void setIdUnidad(int idUnidad) {
		this.idUnidadP.setValue(idUnidad);
	}
	@Column(name="precioCompra",nullable=false)
	public Double getPrecioCompra() {
		return precioCompraP.getValue();
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompraP.setValue(precioCompra);
	}
	@Column(name="precioVenta",nullable=false)
	public Double getPrecioVenta() {
		return precioVentaP.getValue();
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVentaP.setValue(precioVenta);
	}
	
	@Transient 
	public IntegerProperty getIdProductoP() {
		return idProductoP;
	}
	public void setIdProductoP(IntegerProperty idProductoP) {
		this.idProductoP = idProductoP;
	}
	@Transient 
	public StringProperty getCodigoP() {
		return codigoP;
	}
	public void setCodigoP(StringProperty codigoP) {
		this.codigoP = codigoP;
	}
	@Transient 
	public StringProperty getDescripcionP() {
		return descripcionP;
	}
	public void setDescripcionP(StringProperty descripcionP) {
		this.descripcionP = descripcionP;
	}
	@Transient 
	public IntegerProperty getIdFamiliaP() {
		return idFamiliaP;
	}
	public void setIdFamiliaP(IntegerProperty idFamiliaP) {
		this.idFamiliaP = idFamiliaP;
	}
	@Transient 
	public IntegerProperty getIdUnidadP() {
		return idUnidadP;
	}
	public void setIdUnidadP(IntegerProperty idUnidadP) {
		this.idUnidadP = idUnidadP;
	}
	@Transient 
	public DoubleProperty getPrecioCompraP() {
		return precioCompraP;
	}
	public void setPrecioCompraP(DoubleProperty precioCompraP) {
		this.precioCompraP = precioCompraP;
	}
	@Transient 
	public DoubleProperty getPrecioVentaP() {
		return precioVentaP;
	}
	public void setPrecioVentaP(DoubleProperty precioVentaP) {
		this.precioVentaP = precioVentaP;
	}
	@Override
	public String toString() {
		return "Producto [idProductoP=" + idProductoP.getValue() + ", codigoP="
				+ codigoP.getValue() + ", descripcionP=" + descripcionP.getValue() + ", idFamiliaP="
				+ idFamiliaP.getValue() + ", idUnidadP=" + idUnidadP.getValue() + ", precioCompraP="
				+ precioCompraP.getValue() + ", precioVentaP=" + precioVentaP.getValue() + "]";
	}
	
	
}

