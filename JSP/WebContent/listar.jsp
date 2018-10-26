<%@page import="java.util.Set"%>												
<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem do arquivo props.jsp</title>
</head>
<body>
<%! 
Properties props = new Properties();
%>

<%
InputStream is = application.getResourceAsStream("/WEB-INF/props.txt");																											
props.load(is);	
is.close();
Set<Object> keys = props.keySet();								
%>

<table border="1" width="100%">
    <tr>
         <td> <Strong>Nome</Strong></td>
         <td><strong>Valor</strong></td>c</tr> </table>
          
     <% for (Object k : keys)  { %>
 <tr> 	
     <td><%=k %></td>
     <td><%=props.getProperty((String)k) %></td> </tr>
     <% } %>
</body>
</html>