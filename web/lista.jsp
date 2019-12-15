<%-- 
    Document   : lista
    Created on : Dec 14, 2019, 11:19:18 PM
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <title>RPG Manager</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
        <body>
            <h1> Contas cadastradas </h1>
            <h3><%= request.getAttribute("status") %></h3>
            <table>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Usuário</th>
                        <th>Nome</th>
                        <th>Editar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>
                <tbody>
    
                    
    
                </tbody>
            </table>
        </body>
</html>
