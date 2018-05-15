<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="../ConsultarSala" method="POST">
		<input type="text" name="nome"><br /> <br /> 
		<input type="radio" name="curso" value="1">Técnico em informática <br /><br /> 
		<input type="radio" name="curso" value="2">Técnico em alimentos <br /> <br />
	    <input type="radio" name="curso" value="3">Técnico em agropecuária <br /> <br /> 
	    <input type="submit" value="Consultar"><br />
		<br />
	</form>
	
	A sua sala é ${resultado}
	
	

</body>
</html>