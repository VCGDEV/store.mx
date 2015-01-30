package org.mx.panaderias.domain;

public class Usuario{
	private String userName;
	private String password;
	private boolean enabled;
	
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
}
