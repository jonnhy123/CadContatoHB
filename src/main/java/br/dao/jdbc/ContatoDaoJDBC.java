package br.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.univel.Contato;
import br.univel.dao.ContatoDaoIF;

public class ContatoDaoJDBC implements ContatoDaoIF {
	
	private static final String SQL_BUSCA_TODOS = "SELECT * FROM CONTATO";

	/* (non-Javadoc)
	 * @see br.univel.ContatoDaoIF#getTodos()
	 */
	@Override
	public List<Contato> getTodos() {
		
		Connection con = ConexaoDB
				.getInstance()
				.getConnection();
		
		List<Contato> lista = new ArrayList<>();
		try (PreparedStatement ps = con
					.prepareStatement(SQL_BUSCA_TODOS);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt(1));
				c.setNome(rs.getString(2));
				c.setTelefone(rs.getString(3));
				lista.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	/* (non-Javadoc)
	 * @see br.univel.ContatoDaoIF#insere(br.univel.Contato)
	 */
	@Override
	public void insere(Contato c) {
		
	}
	
	/* (non-Javadoc)
	 * @see br.univel.ContatoDaoIF#atualiza(int, br.univel.Contato)
	 */
	@Override
	public void atualiza(int id, Contato c) {
		
	}
	
	/* (non-Javadoc)
	 * @see br.univel.ContatoDaoIF#exclui(int)
	 */
	@Override
	public void exclui(int id) {
		
	}
	
}
