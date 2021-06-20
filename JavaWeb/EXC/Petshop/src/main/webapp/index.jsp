
<!doctype html>
<html lang="pt-BR">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <title>Boas vindas</title>

 <body class="text-center">
  
  	<%@include file="includes/header.jsp" %>	
    
<main class="form-signin">
<form action="consulta.jsp" method='POST'>
    <div class="form-floating">
      <label for="floatingInput">Nome:</label>
      <input type="text" class="form-control" id="floatingInput" name='nome'> 
    </div>
    <div class="form-floating">
    	 <label for='animal'>Animal:</label>
             <input type="radio" name="animal" value="Cachorro" checked /> Cachorro
             <input type="radio" name="animal" value="Gato" /> Gato
    </div>
    <div class="form-floating">
     <label for='dataConsulta'>Data da consulta:</label>
       <input type='date' name='dataConsuta'/>
    </div>
            
    <div class="checkbox mb-3">
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Agendar</button>
  </form>
</main>

 <%@include file="includes/footer.jsp" %>

  </body>
</html>