<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.choco.model.Categoria"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choco Nobre</title>
</head>
<body>
    <br>
    <h2>Listar Categorias</h2>
    <br>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
        	<%  
            int i=0;
			    if (request.getAttribute("categorias") != null ) {
			    	List<Categoria> tarefas = (List<Categoria>) request.getAttribute("categorias");
					for (Iterator<Categoria> iterator = tarefas.iterator(); iterator.hasNext();) {
						Categoria c = (Categoria) iterator.next();
						i++;
						
				        %>
				  		<tr>
			            <td> <%=c.getId()%> </td>
			            <td> <%=c.getNome()%> </td>
			            
			            <td>	
						<a href="CategoriaController.do?action=alterar&id=<%=c.getId()%>&nome=<%=c.getNome()%>">Alterar </a>
						</td> 
			            <td>
			            <a href="CategoriaController.do?action=apagar&id=<%=c.getId()%>">Apagar </a>
			            </td> 			    
                <%
					}
                }  
                %>
        </tbody>
    </table>
    <br><br>
    
    <p>
        <a href="CategoriaController.do?action=inserir">Adicionar Categoria</a>
    </p>
</body>
</html>