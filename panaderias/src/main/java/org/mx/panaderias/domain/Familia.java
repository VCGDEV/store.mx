package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
/**
* @Author vcgdev
* @version 1.0
* Familia de productos
*/
@Entity
@Table(name="Familias")
public class Familia implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idFamilias")
	private int idFamilia;
	@Column(name="familia",nullable=false)
	private String familia;

	public void setIdFamilia(int idFamilia){this.idFamilia=idFamilia;}
	public String getIdFamilia(){return this.idFamilia;}
	public void setFamilia(String familia){this.familia=familia;}
	public String getFamilia(){return this.idFamilia;}
}
