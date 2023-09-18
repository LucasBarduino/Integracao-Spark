package model;

import java.io.Serializable;
import java.time.LocalDate;


public class Texto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String conteudo;
	private String titulo;
	private LocalDate dataPublicacao;
	
	public Texto() {
		id = -1;
		conteudo = "...";
		titulo = "titulo";
		dataPublicacao = LocalDate.now();
		
	}
	
	public Texto(int id, String conteudo,String titulo,LocalDate dataPublicacao) {
		setId(id);
		setConteudo(conteudo);
		setTitulo(titulo);
		setDataPublicacao(dataPublicacao);
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		if(conteudo.length() > 20)
		this.conteudo = conteudo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	@Override
	public String toString() {
		return "Texto: " + conteudo + "Titulo: "+ titulo
				+ "Data de Publicacao: " + dataPublicacao;
	}
	
	
}

