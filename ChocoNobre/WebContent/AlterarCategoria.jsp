<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Choco Nobre</title>
</head>
<body>
    <form action="CategoriaController.do" method="post">
    <br>
    <h2>Alterar Categoria</h2>
    <br>
        <fieldset>
            <div>
                <label for="nome">Nome: </label> <input type="text" name="Nome" value="<%=request.getParameter("nome")%>" />
                <label for="id"></label> <input type="hidden" name="id" value="<%=request.getParameter("id")%>" />
            </div>
            <div>
                <input type="submit" value="Salvar" />
            </div>
        </fieldset>
    </form>
</body>
</html>