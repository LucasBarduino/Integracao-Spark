

import java.io.Serializable;



public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int idade;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario() {
		id = -1;
		idade = 1;
		nome = "nome";
		email = "email@exemplo.com";
		senha = "senha";
		
	}
	
	public Usuario(int id, int idade, String nome, String email, String senha) {
		setId(id);
		setIdade(idade);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

	
	
}
