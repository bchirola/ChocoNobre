package com.choco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.choco.model.Categoria;

import com.choco.dao.ConnectionFactory;

public class CategoriaDAOImpl implements CategoriaDAO {

	/* (non-Javadoc)
	 * @see com.choco.dao.CategoriaDAO#inserir(com.choco.model.Categoria)
	 */
	@Override
	public int inserir(Categoria categoria) {

		try {

			String sql = "insert into tbl_categoria (nome) " + "values (?)";
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			con.setAutoCommit(true);
			stmt.setString(1, categoria.getNome());
			stmt.executeUpdate();
			stmt.close();
			con.close();
			return 0;

		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
			System.out.println(ex.getMessage());
		}
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.choco.dao.CategoriaDAO#apagar(com.choco.model.Categoria)
	 */
	@Override
	public void apagar(Categoria categoria) {

		try {

			String sql = "delete from tbl_categoria where id_categoria = ? ";
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			
			con.setAutoCommit(true);
			stmt.setInt(1, categoria.getId());
			stmt.executeUpdate();
			stmt.close();
			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		}

	}

	/* (non-Javadoc)
	 * @see com.choco.dao.CategoriaDAO#atualizar(com.choco.model.Categoria)
	 */
	@Override
	public void atualizar(Categoria categoria) {

		try {

			String sql = "update tbl_categoria set nome = ? where id_categoria = ? ";
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			con.setAutoCommit(true);
			stmt.setString(1, categoria.getNome());
			stmt.setInt(2, categoria.getId());
			stmt.executeUpdate();
			stmt.close();
			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		}

	}
	
	/* (non-Javadoc)
	 * @see com.choco.dao.CategoriaDAO#listarTodas()
	 */
	@Override
	public List<Categoria> listar() {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement("select id_categoria, nome from tbl_categoria");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{		
				Categoria categoria = new Categoria();
				categoria.setId(rs.getInt("id_categoria"));
				categoria.setNome(rs.getString("nome"));

				categorias.add(categoria);
			}
			stmt.close();
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getStackTrace());
		}

		return categorias;
	}

}
