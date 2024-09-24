import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conteudo> catalogo = new ArrayList<>();

        catalogo.add(new Filme("Filme", "Homem Formiga", 140));
        catalogo.add(new Filme("Filme", "A Incr�vel Hulk", 112));
        catalogo.add(new Serie("S�rie", "Breaking Bad", 47, 62, 5));
        catalogo.add(new Serie("S�rie", "Stranger Things", 50, 25, 4));
        catalogo.add(new Filme("Filme", "Guardi�es da Gal�xia", 121));
        catalogo.add(new Filme("Filme", "Vingadores", 143));
        catalogo.add(new Serie("S�rie", "Game of Thrones", 57, 73, 8));
        catalogo.add(new Serie("S�rie", "The Witcher", 60, 16, 2));
        catalogo.add(new Filme("Filme", "Thor", 115));
        catalogo.add(new Filme("Filme", "Pantera Negra", 134));

        for (Conteudo conteudo : catalogo) {
            conteudo.descricao();
            System.out.println();
        }
    }
}