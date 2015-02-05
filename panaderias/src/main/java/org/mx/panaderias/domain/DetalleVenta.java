package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name="DetalleVenta")
public class DetalleVenta implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idDetalleVenta")
	private int idDetalleVenta;
	@Column(name="cantidad")
	private BigDecimal cantidad;
	@Column(name="preciounitario")
	private BigDecimal precioUnitario;
	@Column(name="idAlmacen")
	private int idAlmacen;
	@Column(name="idProducto")
	private int idProducto;
	@Column(name="idVenta")
	private int idVenta;
	
	public void setIdDetallVenta(int idDetalleVenta){ this.idDetalleVenta = idDetalleVenta; }
	public int getIdDetalleVenta(){ return this.idDetalleVenta; }
	public void setCantidad(BigDecimal cantidad){ this.cantidad = cantidad; }
	public BigDecimal getCantidad(){ return this.cantidad; }
	public void setPrecioUnitario(BigDecimal precioUnitario){ this.precioUnitario = precioUnitario; }
	public BigDecimal getPrecioUnitario(){ return this.precioUnitario; }
	public void setIdAlmacen(int idAlmacen){ this.idAlmacen = idAlmacen; }
	public int getIdAlmacen(){ return this.idAlmacen; }
	public void setIdProducto(int idProducto){ this.idProducto = idProducto; }
	public int getIdProducto(){ return this.idProducto; }
	public void setIdVenta(int idVenta){ this.idVenta = idVenta; }
	public int getIdVenta(){ return this.idVenta; }

}
