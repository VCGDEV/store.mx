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
public class Unidad implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationTyoe.AUTO)
	@Column(name="idUnidades")
	private int idUnidad;
	@Column(name="unidad",nullable=false)
	private String unidad;

	public void setIdUnidad(int idUnidad){this.idUnidad=idUnidad;}
	public int getIdUnidad(){return this.idUnidad;}
	public void setUnidad(String unidad){this.unidad = unidad;}
	public String getUnidad(){return this.unidad;}
}

