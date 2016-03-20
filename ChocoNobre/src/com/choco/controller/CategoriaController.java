package com.choco.controller;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
//import com.choco.model.Categoria;
import com.choco.model.CategoriaManager;
 
//@WebServlet("/CategoriaController")
public class CategoriaController extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
    public static final String lISTAR = "/ListarCategoria.jsp";
    public static final String EDITAR = "/Categoria.jsp";
 
    public CategoriaController() {
       super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );
 
        if( action.equalsIgnoreCase( "apagar" ) ) {
    		   		
            forward = lISTAR;
            int id = Integer.parseInt( request.getParameter("id") );
      		String msg = CategoriaManager.apagarCategoria(id);
            request.setAttribute("categorias", CategoriaManager.listarTodas());
        }
        else if( action.equalsIgnoreCase( "editar" ) ) {
        	
            forward = EDITAR;
            String nome = request.getParameter("nome");
            int id = Integer.parseInt( request.getParameter("id") );
            //String msg = CategoriaManager.alterarCategoria(id,nome);
            request.setAttribute("nome", nome);	
            request.setAttribute("id", id);	
            
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = EDITAR;
        }
        else {
            forward = lISTAR;
            request.setAttribute("categorias", CategoriaManager.listarTodas() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String msg;
    	String nome = request.getParameter( "Nome" );
    	 
     	if (request.getParameter("id") == null ) {
    		msg = CategoriaManager.criarCategoria(nome);
        }
        else {
        	int id = Integer.parseInt( request.getParameter("id") );
    		msg = CategoriaManager.alterarCategoria(id,nome);
        }
    	
        RequestDispatcher view = request.getRequestDispatcher( lISTAR );
        request.setAttribute("categorias", CategoriaManager.listarTodas());
        view.forward(request, response);
    }
}