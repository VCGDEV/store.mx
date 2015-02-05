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


/***
* @Author vcgdev
* @version 1.0
* Clase Venta
*/

@Entity
@Table(name="Venta")
public class Venta implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idVenta")
	private int idVenta;
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@Column(name="username")
	private String username;
	@Column(name="idBeneficiario")
	private int idBeneficiario;
	@Column(name="subtotal")
	private BigDecimal subtotal;
	@Column(name="iva")
	private BigDecimal iva;
	@Column(name="importe")
	private BigDecimal importe;
	@Column(name="efectivo")
	private BigDecimal efectivo;
	@Column(name="cambio")
	private BigDecimal cambio;
	

	public void setIdVenta(int idVenta){ this.idVenta = idVenta; }	
	public int getIdVenta(){ return this.idVenta; }
	public void setFecha(Date fecha){ this.fecha = fecha; }
	public Date getFecha(){ return this.fecha; }
	public void setUsername(String username){ this.username = username; }
	public String getUsername(){ return this.username; }
	public void setIdBeneficiario(int idBeneficiario){ this.idBeneficiario = idBeneficiario; }
	public int getIdBeneficiario(){ return this.idBeneficiario; }
	public void setSubtotal(BigDecimal subtotal){ this.subtotal = subtotal; }
	public BigDecimal getSubtotal(){ return this.subtotal; }
	public void setIva(BigDecimal iva){ this.iva = iva; }
	public BigDecimal getIva(){ return this.iva; }
	public void setImporte(BigDecimal importe){ this.importe = importe; }
	public BigDecimal getImporte(){ return this.importe; }
	public void setEfectivo(BigDecimal efectivo){ this.efectivo = efectivo; }
	public BigDecimal getEfectivo(){ return this.efectivo; }
	public void setCambio(BigDecimal cambio){ this.cambio = cambio; }
	public BigDecimal getCambio(){ return this.cambio; }
}
