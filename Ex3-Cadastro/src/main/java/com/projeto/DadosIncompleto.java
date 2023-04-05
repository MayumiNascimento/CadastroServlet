package com.projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DadosIncompleto
 */
@WebServlet("/DadosIncompleto")
public class DadosIncompleto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DadosIncompleto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); 
		
		String msg = (String) request.getAttribute("mensagem");
		
		 out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Exercício 3 - Cadastro Aluno</title>");
	        out.println("</head>");
	        out.println("<body><center>");
	        out.println("<h1>Dados Incompletos</h1><br><br><hr>");
	        out.println(msg);
	        out.print("<br>");
	        out.println("<a href='index.html'>Voltar ao formulário</a>");
	        out.println("</center></body>");
	        out.println("</html>");   
		

//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
}
