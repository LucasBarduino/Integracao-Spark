package dao;

import java.sql.*;

import model.Texto;
import model.Usuario;


public class TextoDAO {
	private Connection conexao;
	
	public TextoDAO() {
		conexao = null;
	}
	
	public boolean conectar() {
		String driverName = "org.postgresql.Driver";
		String serverName = "localhost";
		String mydatabase = "teste";
		int porta = 5432;
		String url = "urlsite" + serverName + ":" + porta + "/" + mydatabase;
		String username = "ti2cc";
		String password = "ti@cc";
		boolean status = false;
		
		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao == null);
			System.out.println("Conexão efetuada com o Postgres!");
		} catch (ClassNotFoundException e) {
			System.out.println("Conexão NÃO efetuada com o Postgres -- Driver não encontrado --");
		} catch (SQLException e) {
			System.out.println("Conexão NÃO efetuada com o Postgres -- "+ e.getMessage());
			
		}
		return status;
	}
	
	public boolean close() {
		boolean status = false;
		
		try {
			conexao.close();
			status = true;
		} catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public boolean inserirUsuario (Usuario usuario)
	
	
	
}