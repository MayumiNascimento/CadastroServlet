package com.projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlunoCadastrado")
public class AlunoCadastrado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlunoCadastrado() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();  
		
		Aluno a = (Aluno) request.getAttribute("aluno");
		String msg = "<br>O aluno " + a.getNome() + " de RA " + a.getRa() + " do curso: " + a.getCurso() + " do período " + a.getPeriodo() + "<br>";
		
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Exercício 3 - Cadastro Aluno</title>");
        out.println("</head>");
        out.println("<body><center>");
        out.println("<h1>Dados de cadastro do aluno</h1><br><br><hr>");
        out.println(msg);    	        
        out.println("Aluno cadastrado com sucesso ao sistema !<br><hr><br>");
     
        out.println("<a href='index.html'>Voltar</a>");
        out.println("</center></body>");
        out.println("</html>");   
        out.close();
	}


}
