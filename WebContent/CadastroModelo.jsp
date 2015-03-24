<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="css-includes.jsp" />	
        <jsp:include page="js-includes.jsp" />
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" /> 
 
  <div class="container">
     
        <div class="row-fluid">
           <div class="span12">
              &nbsp;
           </div>
      </div>
    

    <div class="row" id="main-content">
    <div class="well" align="center">
    <div class="span4" id="sidebar">
    <h1 class="text-primary">Cadastro de Usuários</h1>

    
  <div id="box">
    <form action="CadastroModelo" id="cadastraModelo" method="POST">    
    <fieldset>
        <legend></legend>

            <input type="text" name="modelo" id="modelo" placeholder="Modelo Veiculo" class="form-control">
            <input type="text" name="marca" id="marca" placeholder="Marca" class="form-control">
    
            <select name="tipo" class="form-control">
            	<option value="1">moto</option>
            	<option value="2">carro</option>
            	<option value="3">camionete</option>
            	<option value="4">caminhão</option>
            
            </select>
             <br>
            <input type="submit" id="enviar" onclick=" return validacao()" class="btn btn-primary" value="Salvar">&nbsp;&nbsp;&nbsp;
            <input type="reset" class="btn btn-primary" value="Limpar">&nbsp;&nbsp;&nbsp;
            
            <a href="#">Voltar</a>
    </fieldset>
    </form>

   </div> 
    </div>
    </div>
    </div>
    </div>
        
</body>
</html>