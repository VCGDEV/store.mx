package org.mx.panaderias.domain;

import java.math.BigDecimal;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ProductoWrapper {
	Producto producto = new Producto();
	
	private int idProducto;
	private String codigo;
	private String descripcion;
	private int idFamilia;
	private int idUnidad;
	private Double precioCompra;
	private Double precioVenta;
	

	private IntegerProperty idProductoP = new SimpleIntegerProperty();
	private StringProperty codigoP = new SimpleStringProperty();
	private StringProperty descripcionP = new SimpleStringProperty();
	private IntegerProperty idFamiliaP = new SimpleIntegerProperty();
	private IntegerProperty idUnidadP  = new SimpleIntegerProperty();
	private DoubleProperty precioCompraP = new SimpleDoubleProperty();
	private DoubleProperty precioVentaP = new SimpleDoubleProperty();
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getIdProducto() {
		return idProductoP.getValue();
	}
	public void setIdProducto(int idProducto) {
		this.idProductoP.setValue(idProducto);
	}
	public String getCodigo() {
		return codigoP.getValue();
	}
	public void setCodigo(String codigo) {
		this.codigoP.setValue(codigo);
	}
	public String getDescripcion() {
		return descripcionP.getValue();
	}
	public void setDescripcion(String descripcion) {
		this.descripcionP.setValue(descripcion);
	}
	public int getIdFamilia() {
		return idFamiliaP.getValue();
	}
	public void setIdFamilia(int idFamilia) {
		this.idFamiliaP.setValue(idFamilia);
	}
	public int getIdUnidad() {
		return idUnidadP.getValue();
	}
	public void setIdUnidad(int idUnidad) {
		this.idUnidadP.setValue(idUnidad);
	}
	public Double getPrecioCompra() {
		return precioCompraP.getValue();
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompraP.setValue(precioCompra);
	}
	public Double getPrecioVenta() {
		return precioVentaP.getValue();
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVentaP.setValue(precioVenta);
	}
	public IntegerProperty getIdProductoP() {
		return idProductoP;
	}
	
	
	public void setIdProductoP(IntegerProperty idProductoP) {
		this.idProductoP = idProductoP;
	}
	public StringProperty getCodigoP() {
		return codigoP;
	}
	public void setCodigoP(StringProperty codigoP) {
		this.codigoP = codigoP;
	}
	public StringProperty getDescripcionP() {
		return descripcionP;
	}
	public void setDescripcionP(StringProperty descripcionP) {
		this.descripcionP = descripcionP;
	}
	public IntegerProperty getIdFamiliaP() {
		return idFamiliaP;
	}
	public void setIdFamiliaP(IntegerProperty idFamiliaP) {
		this.idFamiliaP = idFamiliaP;
	}
	public IntegerProperty getIdUnidadP() {
		return idUnidadP;
	}
	public void setIdUnidadP(IntegerProperty idUnidadP) {
		this.idUnidadP = idUnidadP;
	}
	public DoubleProperty getPrecioCompraP() {
		return precioCompraP;
	}
	public void setPrecioCompraP(DoubleProperty precioCompraP) {
		this.precioCompraP = precioCompraP;
	}
	public DoubleProperty getPrecioVentaP() {
		return precioVentaP;
	}
	public void setPrecioVentaP(DoubleProperty precioVentaP) {
		this.precioVentaP = precioVentaP;
	}
	@Override
	public String toString() {
		return "ProductoWrapper [idProductoP=" + idProductoP.getValue() + ", codigoP="
				+ codigoP.getValue() + ", descripcionP=" + descripcionP.getValue() + ", idFamiliaP="
				+ idFamiliaP.getValue() + ", idUnidadP=" + idUnidadP.getValue() + ", precioCompraP="
				+ precioCompraP.getValue() + ", precioVentaP=" + precioVentaP.getValue() + "]";
	}
	
	
}