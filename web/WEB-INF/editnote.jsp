<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 2:40:58 PM
    Author     : 807785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form>
            <h1>Simple Note Keeper</h1><br>
            <h2>Edit Note</h2><br>
            Title: <input type="text" name="title" value="${title}"><br>
            Contents: <input typ="textarea" name="contents" value="${contents}"><br?
            <input type=""submit" value="Submit">            
        </form>
    </body>
</html>
