<<<<<<< HEAD
package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
* @Author vcgdev
* @version 1.0
* Informacion de empleado, cliente o proveedor
*/
@Entity
@Table(name="Beneficiario")
public class Beneficiario implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idBeneficiario")
	private int idBeneficiario;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="rfc",nullable=false)
	private String rfc;
	@Column(name="tipoBeneficiario")
	private int tipoBeneficiario;// 1 empleado, 2 cliente, 3 proveedor
	@Column(name="idDireccion")
	private int idDireccion;//direccion fiscal del beneficiario
	@Column(name="activo")
	private boolean activo;
	@OneToOne
	@JoinColumn(name="idDireccion",insertable=false,updatable=false)
	private Direccion direccion;

	/**
	*getters y setters
	**/
	public void setIdBeneficiario(int idBeneficiario){this.idBeneficiario = idBeneficiario;}
	public int getIdBeneficiario(){return this.idBeneficiario;}
	public void setNombre(String nombre){this.nombre=nombre;}
	public String getNombre(){return this.nombre;}
	public void setRfc(String rfc){this.rfc = rfc;}
	public String getRfc(){return this.rfc;}
	public void setTipoBeneficiario(int tipoBeneficiario){this.tipoBeneficiario = tipoBeneficiario;}
	public int getTipoBeneficiario(){return this.tipoBeneficiario;}
	public void setIdDireccion(int idDireccion){this.idDireccion = idDireccion;}
	public int getIdDireccion(){return this.idDireccion;}
	public void setDireccion(Direccion direccion){ this.direccion = direccion; }
	public void setActivo(boolean activo){ this.activo = activo; }
	public boolean isActivo(){ return this.activo; }
	public Direccion getDireccion(){ return this.direccion;}
}
=======
package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
* @Author vcgdev
* @version 1.0
* Informacion de empleado, cliente o proveedor
*/
@Entity
@Table(name="Beneficiario")
public class Beneficiario implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idBeneficiario")
	private int idBeneficiario;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="rfc",nullable=false)
	private String rfc;
	@Column(name="tipoBeneficiario")
	private int tipoBeneficiario;// 1 empleado, 2 cliente, 3 proveedor
	@Column(name="idDireccion")
	private int idDireccion;//direccion fiscal del beneficiario
	@Column(name="activo")
	private boolean activo;
	@OneToOne
	@JoinColumn(name="idDireccion",insertable=false,updatable=false)
	private Direccion direccion;

	/**
	*getters y setters
	**/
	public void setIdBeneficiario(int idBeneficiario){this.idBeneficiario = idBeneficiario;}
	public int getIdBeneficiario(){return this.idBeneficiario;}
	public void setNombre(String nombre){this.nombre=nombre;}
	public String getNombre(){return this.nombre;}
	public void setRfc(String rfc){this.rfc = rfc;}
	public String getRfc(){return this.rfc;}
	public void setTipoBeneficiario(int tipoBeneficiario){this.tipoBeneficiario = tipoBeneficiario;}
	public int getTipoBeneficiario(){return this.tipoBeneficiario;}
	public void setIdDireccion(int idDireccion){this.idDireccion = idDireccion;}
	public int getIdDireccion(){return this.idDireccion;}
	public void setDireccion(Direccion direccion){ this.direccion = direccion; }
	public void setActivo(boolean activo){ this.activo = activo; }
	public boolean isActivo(){ return this.activo; }
	public Direccion getDireccion(){ return this.direccion;}
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
