package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Usuario;

public interface IUsuarioRepository {
	public Usuario buscarPorUsername(String username);
	public void insertarEstudiante(Usuario usuario);
}
