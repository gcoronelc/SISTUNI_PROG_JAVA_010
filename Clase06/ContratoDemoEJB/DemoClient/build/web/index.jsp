<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>SUMAR</h1>
    <form method="post" action="SumarController">
      <div>
        <label>Número 1:</label>
        <input type="text" name="num1"/>
      </div>
      <div>
        <label>Número 2:</label>
        <input type="text" name="num2"/>
      </div>
      <div>
        <input type="submit" value="Procesar"/>
      </div>
    </form>
    <h1>RESULTADO</h1>
    <p>Número 1: ${requestScope.n1}</p>
    <p>Número 2: ${requestScope.n2}</p>
    <p>Suma: ${requestScope.suma}</p>
  </body>
</html>
