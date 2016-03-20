package com.choco.dao;

import java.util.List;

import com.choco.model.Categoria;

public interface CategoriaDAO {

	int inserir(Categoria categoria);

	void apagar(Categoria categoria);

	void atualizar(Categoria categoria);

	List<Categoria> listar();

}