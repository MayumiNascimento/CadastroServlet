package com.projeto;

public class Aluno {
	private int ra; 
	private String nome; 
	private String curso;
	private String periodo; // d=diurno, v=vespertino, n=noturno 
	

	
	public Aluno(int ra, String nome, String curso, String periodo) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
	}

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
	
	public String getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(String periodo) { 
		this.periodo = periodo;
	}
	
	public int getRa() {
		return ra;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
}
