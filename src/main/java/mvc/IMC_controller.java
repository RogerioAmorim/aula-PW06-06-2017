package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/calculo-imc")
public class IMC_controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execu��o.
		String Alturastr = request.getParameter("altura");
	    String Pesostr= request.getParameter("peso");
	    String sexo= request.getParameter("sexo");    
	    Alturastr = Alturastr == null ? "0" : Alturastr;
	    Pesostr = Pesostr == null ? "0" : Pesostr;
	    double altura = Double.parseDouble(Alturastr);
	    double peso = Double.parseDouble(Pesostr);
		
		//Executa "regras de neg�cio".
		IMC_model imc = new IMC_model(altura, peso, sexo);
	    String resultado = imc.resultado_imc();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("resultado", resultado);
		//Chama p�gina JSP.
		request.getRequestDispatcher("index.jsp").
			forward(request, response);

	}
	
} 
