package com.uce.edu.demo.service.to;

import java.io.Serializable;

import javax.persistence.Column;

public class UsuarioTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String semilla;
	
	private Integer tiempoVigencia;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSemilla() {
		return semilla;
	}

	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}

	public Integer getTiempoVigencia() {
		return tiempoVigencia;
	}

	public void setTiempoVigencia(Integer tiempoVigencia) {
		this.tiempoVigencia = tiempoVigencia;
	}
	
	
	
}
