public class Main {
        public static void main(String[] args) {
            Filme filme1 = new Filme(" Os Vingadores", 142);
            filme1.exibirDuracaoEmHoras();

            Filme filme2 = new Filme(" Hotel Transilvânia", 93);
            filme2.exibirDuracaoEmHoras();

            System.out.println("");
            
            System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());
            
            System.out.println("");
            
            Filme filme3 = new Filme(" Venom", 112);
            filme3.exibirDuracaoEmHoras();
            
            
            Filme filme4 = new Filme(" Vida de Inseto", 86);
            filme4.exibirDuracaoEmHoras();
            
            
            Filme filme5 = new Filme(" Coraline", 100);
            filme5.exibirDuracaoEmHoras();
            
            
            Filme filme6 = new Filme(" Batman", 176);
            filme6.exibirDuracaoEmHoras();
            
            
            Filme filme7 = new Filme(" Jurassic Word", 124);
            filme7.exibirDuracaoEmHoras();
            
            
            System.out.println("");
            
            System.out.println("Os filmes em cartaz são " + filme3.getTitulo() + ", " + filme4.getTitulo() + " e " + filme5.getTitulo());
        }
}