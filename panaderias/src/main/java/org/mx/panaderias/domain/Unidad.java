<<<<<<< HEAD
package org.mx.panaderias.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
* Clase para unidades de medida, kilo, metro, pieza, etc
*/

@Entity
@Table(name="Unidades")
public class Unidad implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUnidades")
	private int idUnidad;
	@Column(name="unidad",nullable=false)
	private String unidad;
	@Column(name="activo")
	private boolean activo;

	public void setIdUnidad(int idUnidad){this.idUnidad=idUnidad;}
	public int getIdUnidad(){return this.idUnidad;}
	public void setUnidad(String unidad){this.unidad = unidad;}
	public String getUnidad(){return this.unidad;}
	public void setActivo(boolean activo){ this.activo=activo; }
	public boolean isActivo(){ return this.activo; } 
}

=======
package org.mx.panaderias.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
* Clase para unidades de medida, kilo, metro, pieza, etc
*/

@Entity
@Table(name="Unidades")
public class Unidad implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idUnidades")
	private int idUnidad;
	@Column(name="unidad",nullable=false)
	private String unidad;
	@Column(name="activo")
	private boolean activo;

	public void setIdUnidad(int idUnidad){this.idUnidad=idUnidad;}
	public int getIdUnidad(){return this.idUnidad;}
	public void setUnidad(String unidad){this.unidad = unidad;}
	public String getUnidad(){return this.unidad;}
	public void setActivo(boolean activo){ this.activo=activo; }
	public boolean isActivo(){ return this.activo; } 
}

>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
