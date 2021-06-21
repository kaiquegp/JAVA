<html>
<%@page import="jdk.jfr.Timespan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta Agendada</title>
</head>
<body>

<%@include file="includes/header.jsp" %>

<%
String nome=request.getParameter("nome");
String animal=request.getParameter("animal");
String data=request.getParameter("dataConsuta");


session.setAttribute("nome",nome);
session.setAttribute("animal", animal);
session.setAttribute("dataConsuta", data);

%>
  <h1>Consuta agendada com sucesso</h1>
 <p>Ola <%=nome%>  ,Sua consuta com seu <%=animal%> foi agendada para o dia <%=data%>.</p>
 

 <button><a href="index.jsp">Nova Consulta</a></button>
 
 <%@include file="includes/footer.jsp" %>

</body>
</html>