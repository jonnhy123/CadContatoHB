package br.univel.dao;

import java.util.List;

import br.univel.Contato;

public interface ContatoDaoIF {

	List<Contato> getTodos();

	void insere(Contato c);

	void atualiza(int id, Contato c);

	void exclui(int id);

}