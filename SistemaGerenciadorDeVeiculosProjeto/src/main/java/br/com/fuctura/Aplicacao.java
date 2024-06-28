package br.com.fuctura;

import java.sql.SQLException;

import br.com.fuctura.config.Conexao;
import br.com.fuctura.dao.IUsuarioDAO;
import br.com.fuctura.dao.impl.UsuarioDAOImpl;
import br.com.fuctura.entidade.Usuario;

public class Aplicacao {

	public static void main(String[] args) {
		var url = "jdbc:postgresql://localhost:5432/postgres";
		var user = "postgres";
		var pass = "123";

		try {

			Conexao conn = new Conexao(url, user, pass);

			System.out.println("Conectado com sucesso!");

			IUsuarioDAO dao = new UsuarioDAOImpl();

			String cpf = "96385274112";
			int idade = 80;

			Usuario u = new Usuario();
			u.setIdade(idade);
			u.setCpf(cpf);

			dao.persistir(conn.getConnection(), u);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
