package pe.egcc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.service.MateServiceRemote;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "SumarController", urlPatterns = {"/SumarController"})
public class SumarController extends HttpServlet {

  @EJB
  private MateServiceRemote mateService;


  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    // Datos
    int n1 = Integer.parseInt(request.getParameter("num1"));
    int n2 = Integer.parseInt(request.getParameter("num2"));
    // Procesar
    int suma = mateService.sumar(n1, n2);
    // Reporte
    request.setAttribute("n1", n1);
    request.setAttribute("n2", n2);
    request.setAttribute("suma", suma);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

  
  
}
