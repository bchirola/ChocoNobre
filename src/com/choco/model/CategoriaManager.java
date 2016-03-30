package com.choco.model;

import java.util.ArrayList;
import java.util.List;

import com.choco.dao.CategoriaDAO;
import com.choco.dao.CategoriaDAOImpl;

public class CategoriaManager {

	public static String criarCategoria(String nome) {

		if (nome.isEmpty()) {
			return "Erro na criação da Categoria.<br> Favor preencher o campo Nome!";
		}

		Categoria categoria = new Categoria();
		categoria.setNome(nome);
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		int Err = categoriaDAO.inserir(categoria);
		if (Err == 0) {
			return "Sucesso";
		} else {
			return "Erro ao criar categoria no BD";
		}
	}

	public static String apagarCategoria(int id) {

		if (id == 0) {
			return "Erro ao apagar Categoria.<br>!";
		}

		Categoria categoria = new Categoria();
		categoria.setId(id);
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		categoriaDAO.apagar(categoria);

		return "Sucesso";
	}

	public static String alterarCategoria(int id, String nome) {

		if (id == 0) {
			return "Erro ao atualizar Categoria.<br>!";
		}

		Categoria categoria = new Categoria();
		categoria.setId(id);
		categoria.setNome(nome);
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		categoriaDAO.atualizar(categoria);

		return "Sucesso";
	}

	public static List<Categoria> listarTodas() {

		List<Categoria> categorias = new ArrayList<Categoria>();

		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		categorias = categoriaDAO.listar();

		return categorias;
	}

}
