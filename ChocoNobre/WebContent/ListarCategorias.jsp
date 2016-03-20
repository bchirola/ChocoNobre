<%@ page import="java.util.*,com.choco.model.Categoria"%>
<html>
<head>
<title>Choco Nobre</title>
</head/>

<body>

<div>
<br><br>
	<h2 align="center">Lista de Categorias</h2>

    <form name = "frm" method="post"  action="acao.jsp" >
	<table>
		
		<tr >
			<th>ID</th>
			<th>Nome</th>
		</tr>

			<%  
			    int i=0;
			    if (request.getAttribute("tarefas") != null ) {
			    	List<Categoria> tarefas = (List<Categoria>) request.getAttribute("tarefas");
					for (Iterator<Categoria> iterator = tarefas.iterator(); iterator.hasNext();) {
						Categoria c = (Categoria) iterator.next();
						i++;
				        %>
				  		<tr>
			            <td> <%=c.getId()%> </td>
			            <td> <%=c.getNome()%> </td>
							<td>
							      <input type="radio" name="linha" value="<%= i %>" checked="checked">
							      <input type="hidden" name="id<%= i %>"  value="<%= c.getId() %>" >
							      <input type="hidden" name="nome<%= i %>"  value="<%=c.getNome()%>" > 							      
							</td>
					    </tr>				    
                <%
					}
                }  
                %>

	</table>
	<br><br>
	<%
	if (i==0) {
		out.print("Nenhuma Categoria Encontrada");
	} else {

		// Somente se o filtro for de atividade Abertas, mosta o botão Resolver
    	%>
		<input type="SUBMIT" name="action" value="Resolver" >
		<input type="SUBMIT" name="action" value="Apagar" >
		<%
    }%>
	</form> 
	<br></br>
	</div>
	<a href="index.jsp">Página inicial</a>
	
</body>
</html>
