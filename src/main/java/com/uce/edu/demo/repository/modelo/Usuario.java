package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	@SequenceGenerator(name = "seq_usuario", allocationSize = 1, sequenceName = "seq_usuario")
	@Column(name = "usua_id")
	private Integer id;
	@Column(name = "usua_username")
	private String username;
	@Column(name = "usua_password")
	private String password;
	
	@Column(name = "usua_semilla")
	private String semilla;
	
	@Column(name="usua_tiempo_vigencia")
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
