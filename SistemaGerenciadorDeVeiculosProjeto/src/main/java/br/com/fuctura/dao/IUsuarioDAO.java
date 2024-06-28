package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Usuario;

public interface IUsuarioDAO {
	void persistir(Connection conn, Usuario user);
}
