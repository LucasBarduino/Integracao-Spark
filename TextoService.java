package service;
import Texto.java;
import java.io.IOException;

public class TextoService {
	
	private TextoDAO textoDAO;
	
	public TextoService() {
		try {
			textoDAO = new TextoDAO("texto.dat");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
		
	public Object add(Request request, Response response) {
		
		String conteudo = request.queryParams("conteudo");
		String titulo = request.queryParams("titulo");
		LocalDate dataPublicacao = request.queryParams("dataPublicacao");
		
		int id = textoDAO.getMaxId() + 1;
		
		Texto texto = nesx
	}
	
	
}