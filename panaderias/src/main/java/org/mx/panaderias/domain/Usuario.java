package org.mx.panaderias.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;
/**
* @Autor vcgdev
* @version 1.0
* Usuario que puede ingresar al sistema,
* en relacion con un Beneficiario el cual tiene sus datos personales y direccion
*/

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{
	@Id
	@Column(name="username")
	@NotEmpty(message="Agregue el usuario")
	private String userName;
	@Column(name="password")
	@NotEmpty(message="Debe establecer alguna contraseña")
	private String password;
	@Column(name="enabled")
	private boolean enabled;
	@Column(name="idBeneficiario")
	private int idBeneficiario;
	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}
	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}
	public boolean isEnabled(){
		return this.enabled;
	}

	public void setIdBeneficiario(int idBeneficiario){
		this.idBeneficiario = idBeneficiario;
	}

	public int getIdBeneficiario(){
		return this.idBeneficiario;
	}
}
