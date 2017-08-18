package br.dao.hb;

import java.util.List;

import org.hibernate.Session;

import br.univel.Contato;
import br.univel.dao.ContatoDaoIF;

public class ContatoDaoHibernate implements ContatoDaoIF {

	Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public List<Contato> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insere(Contato c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualiza(int id, Contato c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exclui(int id) {
		// TODO Auto-generated method stub

	}

}
