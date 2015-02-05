package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.math.BigDecimal;

/*
* @Author vcgdev
* @version 1.0
* Compras
*/

@Entity
@Table(name="Compras")
public class Compra implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCompras")
	private int idCompra;
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@Column(name="subtotal")
	private BigDecimal subtotal;
	@Column(name="iva")
	private BigDecimal iva;
	@Column(name="total")
	private BigDecimal total;
	@Column(name="username")
	private String username;
	@Column(name="idBeneficiario")
	private int idBeneficiario;//proveedor
	
	public void setIdCompra(int idCompra){ this.idCompra = idCompra; }
	public int getIdCompra(){ return this.idCompra; }
	public void setFecha(Date fecha){ this.fecha = fecha; }
	public Date getFecha(){ return this.fecha; }
	public void setSubtotal(BigDecimal subtotal){ this.subtotal = subtotal; }
	public BigDecimal getSubtotal(){ return this.subtotal; }
	public void setIva(BigDecimal iva){ this.iva = iva; }
	public BigDecimal getIva(){ return this.iva; }
	public void setTotal(BigDecimal total){ this.total = total; }
	public BigDecimal getTotal(){ return this.total; }
	public void setUsername(String username){ this.username = username; }
	public String getUsername(){ return this.username; }
	public void setIdBeneficiario(int idBeneficiario){ this.idBeneficiario = idBeneficiario; }
	public int getIdBeneficiario(){ return this.idBeneficiario; }
}
