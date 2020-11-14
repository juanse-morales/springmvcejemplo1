<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/style.css">
</head>
<body>
  Hola ${param.nombreAlumno}, bienvenido al curso de Spring.
  
  <p> <br> 
    
    Atención a todos ${mensajeClaro}
  
  </p>
  <img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/romanos.png">
</body>
</html>