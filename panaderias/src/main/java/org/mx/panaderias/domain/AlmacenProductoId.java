package org.mx.panaderias.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class AlmacenProductoId implements java.io.Serializable{
	private Almacen almacen;
	private Producto producto;
	
	@ManyToOne
	public Almacen getAlmacen(){ return this.almacen; }
	
	public void setAlmacen(Almacen almacen){ this.almacen = almacen; } 

	@ManyToOne
	public Producto getProducto(){ return this.producto; }
	
	public void setProducto(Producto producto){ this.producto = producto; }
	
	/**
	* equals method implementation
	*/
	public boolean equals(Object o){
		if(this==o) return true;
		if(o==null || getClass() != o.getClass() ) return false;
		
		AlmacenProductoId alm = (AlmacenProductoId)o;
		if (almacen != null ? !almacen.equals(alm.almacen) : alm.almacen != null) return false;
        	if (producto != null ? !producto.equals(alm.producto) : alm.producto != null) return false;
		
	        return true;
	}
	
	/**
	* hash code
	*/
	public int hashCode(){
		int result;
        	result = (almacen != null ? almacen.hashCode() : 0);
	        result = 31 * result + (producto != null ? producto.hashCode() : 0);
	        return result;	
	}
}
