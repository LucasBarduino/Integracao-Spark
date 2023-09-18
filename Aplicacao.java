package app;



import service.TextoService;

public class Aplicacao {
		
		private static TextoService textoService = new TextoService();
		
		public static void main(String[] args) {
			
			
			get("/texto", (request, response) -> produtoService.add(request, response));
		}
		
}