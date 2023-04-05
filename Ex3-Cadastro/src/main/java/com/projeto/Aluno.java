package com.projeto;

public class Aluno {
	private int ra; 
	private String nome; 
	private String curso;
	private char periodo; // d=diurno, v=vespertino, n=noturno 
	
	public Aluno() { }
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) { 
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(char periodo) { 
		this.periodo = periodo;
	}
	
	public int getRa() {
		return ra;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
}
