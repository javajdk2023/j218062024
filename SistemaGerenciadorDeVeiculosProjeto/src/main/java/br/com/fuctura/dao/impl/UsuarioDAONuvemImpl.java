package br.com.fuctura.dao.impl;

import java.sql.Connection;

import br.com.fuctura.dao.IUsuarioDAO;
import br.com.fuctura.entidade.Usuario;

public class UsuarioDAONuvemImpl implements IUsuarioDAO {

	@Override
	public void persistir(Connection conn, Usuario user) {
		System.out.println("Vou salvar na nuvem!");
	}
	
	

}
