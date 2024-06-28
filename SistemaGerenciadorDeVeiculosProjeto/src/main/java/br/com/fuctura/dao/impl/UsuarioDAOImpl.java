package br.com.fuctura.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fuctura.dao.IUsuarioDAO;
import br.com.fuctura.entidade.Usuario;

public class UsuarioDAOImpl implements IUsuarioDAO {

	// salvar 1 usuário
	public void persistir(Connection conexao, Usuario usuario) {

		try {

			String comandoSQL = "insert into usuario (idade, cpf) values (?, ?)";
			PreparedStatement pstm = conexao.prepareStatement(comandoSQL);
			pstm.setInt(1, usuario.getIdade());
			pstm.setString(2, usuario.getCpf());
			pstm.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
