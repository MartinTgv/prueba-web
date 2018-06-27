<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">   		
     

<title>Insert title here</title>

</head>
<body>
<h1>Es el administrador</h1>
Desde el Modelo<c:out value="${martin}"></c:out><br/>
Variables desde el ambito de la session: <c:out value="${sessionScope.resultado}"/>
<!-- commadName = hace referencia a nuestra clase POJO que uso -->

<div class="container">
            <sf:form action="" method="post" commandName="martin" cssClass="form" >
               
                <div class="form-group">
                    <label for="nombre" class="control-label col-xs-4">Nombre:</label>
                    <sf:input path="nombre" id="nombre" cssClass="form-control" />                                   
 
                    <br></br>
                    <button type="submit" class="btn btn-primary">Guardar</button>

</div>

</sf:form>
</div>
</body>
</html>

 
    
        