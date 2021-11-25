<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>User Management</h1>
        <h2>
         <a href="new">Add New User</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Users</a>
         
        </h2>
        
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>G�nero</th>
               
               
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${banda.idbanda}" /></td>
                    <td><c:out value="${banda.nome}" /></td>
                    <td><c:out value="${banda.genero}" /></td>
                    <td><c:out value="${user.country}" /></td>
                    <td>
                     <a href="edit?id=<c:out value='${banda.idbanda}' />">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<c:out value='${banda.idbanda}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>