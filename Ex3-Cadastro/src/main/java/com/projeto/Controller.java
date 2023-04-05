package com.projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroAluno")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;      
	
    public Controller() {
        super();
    }  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();    	       

        String matricula = request.getParameter("ra");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String periodo = request.getParameter("periodos");
        
        String camposVazios = "";
        
        if (matricula == null || matricula.equals("")) {
        	camposVazios += "RA, ";
        }

        if (nome == null || nome.equals("")) {
        	camposVazios += "Nome, ";
        }

        if (periodo == null || periodo.equals("")) {
        	camposVazios += "Período, ";
        }

        // Se uma ou mais variáveis não foram preenchidas, redirecionar para outro servlet
        if (!camposVazios.equals("")) {
        	// Remover a última vírgula e espaço
        	camposVazios = camposVazios.substring(0, camposVazios.length() - 2); 
        	
            String mensagem = "Os seguintes campos não foram preenchidos: " + camposVazios;
  
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("DadosIncompleto").forward(request, response);
        }

        String msg = "<br>O aluno " + nome + " de RA " + matricula + " do curso: " + curso + "<br>";    	       

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
