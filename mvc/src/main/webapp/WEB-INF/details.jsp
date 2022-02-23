<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*"%>
    
  <!--   <%@page isELIgnored="false" %>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  <%  
  
  List<String> list = ( List<String>)request.getAttribute("names");
  %>
  <% 
  for(String s: list){
	%>  
	 <h2>  <%= s %>  </h2> 
	  <% 
	   }
       %>
       
</body>
</html>