public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Livro livro=new Livro("Chapeuzinho Vermelho "," Roberto Carlos ", 1954 , 275 ," April ");
		 System.out.println(livro.exibirDetalhes());
		 
		 
		 Revista revista = new Revista("Chapeuzinho Vermelho","Roberto Carlos",1954,333,"março");
		 System.out.println(revista.exibirDetalhes());
	}

}
