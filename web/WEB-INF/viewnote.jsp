<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 2:40:43 PM
    Author     : 807785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>View Note</h2><br>
        <h3>Title: </h3>${note.title}
        <h3>Contents:</h3>
        <p>${note.contents}</p>
        <a>Edit</a>
    </body>
</html>
