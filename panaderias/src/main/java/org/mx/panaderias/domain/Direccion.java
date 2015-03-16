package org.mx.panaderias.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

/**
* @Author vcgdev
* @version 1.0
* Direccion de empleado, cliente, proveedor o almacen
**/

@Entity
@Table(name="Direccion")
public class Direccion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idDireccion")
	private int idDireccion;
	@Column(name="estado")
	@NotEmpty(message="Ingrese la entidad federativa")
	private String estado;
	@Column(name="municipio")
	@NotEmpty(message="Ingrese el municipio")
	private String municipio;
	@Column(name="localidad")
	@NotEmpty(message="Ingrese la localidad")
	private String localidad;
	@Column(name="colonia")
	@NotEmpty(message="Debe ingresar la colonia")
	private String colonia;
	@Column(name="calle")
	@NotEmpty(message="Ingrese la direccion")
	private String calle;
	@Column(name="numeroExterior")
	@NotEmpty(message="Ingrese el numero exterior")
	private String numeroExterior;
	@Column(name="numeroInterior")
	private String numeroInterior;
	@Column(name="telefonos")
	private String telefonos;
	@Column(name="correo")
	@Email(message="Ingrese un correo valido")
	private String correo;

	public void setIdDireccion(int idDireccion){ this.idDireccion=idDireccion;}
	public int getIdDireccion(){return this.idDireccion;}
	public void setEstado(String estado){this.estado=estado;}
	public String getEstado(){return this.estado;}
	public void setMunicipio(String municipio){this.municipio=municipio;}
	public String getMunicipio(){return this.municipio;}
	public void setLocalidad(String localidad){this.localidad = localidad;}
	public String getLocalidad(){return this.localidad;}
	public void setColonia(String colonia){ this.colonia = colonia; }
	public String getColonia(){ return this.colonia;}
	public void setCalle(String calle){ this.calle=calle;}
	public String getCalle(){return this.calle;}
	public void setNumeroExterior(String numeroExterior){this.numeroExterior = numeroExterior;}
	public String getNumeroExterior(){return this.numeroExterior;}
	public void setNumeroInterior(String numeroInterior){this.numeroInterior = numeroInterior;}
	public String getNumeroInterior(){return this.numeroInterior;}
	public void setTelefonos(String telefonos){this.telefonos = telefonos;}
	public String getTelefonos(){return this.telefonos;}
	public void setCorreo(String correo){this.correo = correo;}
	public String getCorreo(){return this.correo;}

}
