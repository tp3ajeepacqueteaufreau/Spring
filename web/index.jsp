<%--
  Created by IntelliJ IDEA.
  User: sebastien
  Date: 04/03/19
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Gillet jaune : TP Spring</h1>

  <br />
  <form>
    <select name="list" >
      <!-- Methode William -->
      <option<%if("France".equals(request.getParameter("list"))){out.print(" selected");}%>>France</option>


      <!-- Methode Sebastien -->
      <%
        out.print("<option");
        if("Pologone".equals(request.getParameter("list"))){
          out.print(" selected");
        }
        out.println(">Pologone</option>");

        out.print("<option");
        if("Allemagne".equals(request.getParameter("list"))){
          out.print(" selected");
        }
        out.println(">Allemagne</option>");

      %>
    </select>
    <input type="submit" value="Valider !">
  </form>
  <br />
  <br />
  <br />
  <br />
  <%
    if(request.getParameter("list")!= null){
      out.print("Nombre de Gillet Jaune : ");
      int tmp = (new Random()).nextInt();
      out.println(String.valueOf((tmp<0)?tmp*(-1):tmp));
    }
  %>
  </body>
</html>
