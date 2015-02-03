package org.mx.panaderias.domain;

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
import javax.persistence.Transient;
import javax.persistence.JoinColumn;
import java.math.BigDecimal;




@AssociationOverrides({@AssociationOverride(name = "pk.almacen",joinColumns = @JoinColumn(name = "idAlmacen"))
		      ,@AssociationOverride(name = "pk.producto", joinColumns = @JoinColumn(name = "idProducto")) })
public class AlmacenProducto implements java.io.Serializable{
	private AlmacenProductoId pk = new AlmacenProductoId();
	
	@Column(name="stockminimo",nullable=false)
	private BigDecimal stockMinimo;
	@Column(name="stock",nullable=false)
	private BigDecimal stock;
	
	@EmbeddedId
	public AlmacenProductoId getPk(){ return this.pk; }
	public void setPk(AlmacenProductoId  pk){ this.pk = pk; }
	
	@Transient
	public Almacen getAlmacen(){
		return getPk().getAlmacen();
	}
	
	public void setAlmacen(Almacen almacen){
		getPk().setAlmacen(almacen);
	}

	@Transient
	public Producto getProducto(){
		return getPk().getProducto();
	}
			
	public void setProducto(Producto producto){
		getPk().setProducto(producto);
	}

	public void setStockMinimo(BigDecimal stockMinimo){ this.stockMinimo = stockMinimo; }
	public BigDecimal getStockMinimo(){ return this.stockMinimo; }
	public void setStock(BigDecimal stock){ this.stock = stock; }
	public BigDecimal getStock(){ return this.stock; }

	/**
	*equals method implementation
	*/
	public boolean equals(Object o){
		if(this==o)
			return true;
		if(o==null || getClass() != o.getClass())
			return false;
		AlmacenProducto alm = (AlmacenProducto)o;
		
		if(getPk()!=null ? !getPk().equals(alm.getPk()) : alm.getPk()!=null)
			return false;
		return true;
	}

	/**
	* hash code implementation
	*/
	public int hashCode(){
		return (getPk() != null ? getPk().hashCode() : 0);
	}
		
}
