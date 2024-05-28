
public class Main {
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.setAnoPubli(1954);
		livro.setAutor("Roberto Carlos");
		livro.setEditora("April");
		livro.setNumeroPaginas(275);
		livro.setTitulo("Chapeuzinho Vermelho");
		
		System.out.println(livro.getAnoPubli()+" /"+ livro.getAutor()+" /"+ livro.getEditora()+" /"+livro.getNumeroPaginas()+" /"+ livro.getTitulo());
		
		Revista revista = new Revista();
		
		revista.setAnoPubli(1954);
		revista.setAutor("Roberto Carlos");
		revista.setTitulo("Chapeuzinho Vermelho");
		revista.setNumeroEdicao(333);
		revista.setMesPublicacao("Março");
		
		System.out.println(revista.getAnoPubli()+" /"+revista.getAutor()+" /"+revista.getTitulo()+" /"+revista.getNumeroEdicao()+" /"+revista.getMesPublicacao());
		

		
	}

}
