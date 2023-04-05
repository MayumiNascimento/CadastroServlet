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

        String matriculaString = request.getParameter("ra");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String periodo = request.getParameter("periodos");
        String camposVazios = "";
        int matricula = 0;
        
        if (matriculaString == null || matriculaString.isEmpty()) {
            camposVazios += "RA, ";
        } else {
        	//realiza a conversão para int
            matricula = Integer.parseInt(matriculaString);
        }
        
        if (nome == null || nome.equals("")) {
        	camposVazios += "Nome, ";
        }

        if (periodo == null || periodo.equals("")) {
        	camposVazios += "Período, ";
        }

        // Se uma ou mais variáveis não foram preenchidas, redirecionar para outro servlet
        if (!camposVazios.equals("")) {
        	
        	camposVazios = camposVazios.substring(0, camposVazios.length() - 2); 
        	
            String mensagem = "Os seguintes campos não foram preenchidos: " + camposVazios;
  
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("DadosIncompleto").forward(request, response);
        }

        Aluno a = new Aluno(matricula, nome, curso, periodo);
            	       
        request.setAttribute("aluno", a);
        request.getRequestDispatcher("AlunoCadastrado").forward(request, response);
	}
	
}
