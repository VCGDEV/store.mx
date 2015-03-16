package org.mx.panaderias.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="Configuracion")
public class Configuracion implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idconfiguracion")
	private int idConfiguracion;
	@Column(name="pathfolder")
	private String pathFolder;
	@Column(name="logo")
	private String logo;
	@Column(name="rfc")
	private String rfc;
	@Column(name="razonSocial")
	private String razonSocial;
	@Column(name="idDireccion")
	private int idDireccion;//direccion 
	
	public void setIdConfiguracion(int idConfiguracion){ this.idConfiguracion = idConfiguracion; }	
	public int getIdConfiguracion(){ return this.idConfiguracion; }
	public void setPathFolder(String pathFolder){ this.pathFolder = pathFolder; }
	public String getPathFolder(){ return this.pathFolder; }
	public void setLogo(String logo){ this.logo = logo; }
	public String getLogo(){ return this.logo; }
	public void setRfc(String rfc){ this.rfc = rfc; }
	public String getRfc(){ return this.rfc; }
	public void setRazonSocial(String razonSocial){ this.razonSocial= razonSocial; }
	public String getRazonSocial(){ return this.razonSocial; }
	public void setIdDireccion(int idDireccion){ this.idDireccion = idDireccion; }
	public int getIdDireccion(){ return this.idDireccion; }
}

