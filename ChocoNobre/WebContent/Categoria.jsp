<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>Adicionar Categoria</title>
</head>
<body>
    <form action="CategoriaController.do" method="post">
    <br>
    <h2>Adicionar Categoria</h2>
    <br>
        <fieldset>
            <div>
                <label for="nome">Nome</label> <input type="text" name="Nome" value="<%=request.getAttribute("nome")%>" />
                <label for="id">Nome</label> <input type="hidden" name="id" value="<%=request.getAttribute("id")%>" />
            </div>
            <div>
                <input type="submit" value="Salvar" />
            </div>
        </fieldset>
    </form>
</body>
</html>