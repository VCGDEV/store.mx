package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name="DetalleCompra")
public class DetalleCompra implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idDetalleCompra")
	private int idDetalleCompra;
	@Column(name="cantidad")
	private BigDecimal cantidad;
	@Column(name="preciounitario")
	private BigDecimal precioUnitario;
	@Column(name="idCompras")
	private int idCompra;
	@Column(name="idAlmacen")
	private int idAlmacen;
	@Column(name="idProducto")
	private int idProducto;

	public void setIdDetalleCompra(int idDetalleCompra){ this.idDetalleCompra = idDetalleCompra; }
	public int getIdDetalleCompra(){ return this.idDetalleCompra; }
	public void setCantidad(BigDecimal cantidad){ this.cantidad = cantidad; }
	public BigDecimal getCantidad(){ return this.cantidad; }
	public void setPrecioUnitario(BigDecimal precioUnitario){ this.precioUnitario = precioUnitario; }
	public BigDecimal getPrecioUnitario(){ return this.precioUnitario; }
	public void setIdCompra(int idCompra){ this.idCompra = idCompra; }
	public int getIdCompra(){ return this.idCompra; }
	public void setIdAlmacen(int idAlmacen){ this.idAlmacen = idAlmacen; }
	public int getIdAlmacen(){ return this.idAlmacen; }
	public void setIdProducto(int idProducto){ this.idProducto = idProducto; }
	public int getIdProducto(){ return this.idProducto; }
}

