class Serie extends Conteudo {
    private int duracao;
    private int quantEpisodios;
    private int quantTemporadas;

    public Serie(String categoria, String titulo, int duracao, int quantEpisodios, int quantTemporadas) {
        super(categoria, titulo);
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemporadas = quantTemporadas;
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.println("Duração: " + duracao + " minutos, Episódios: " + quantEpisodios + ", Temporadas: " + quantTemporadas);
    }
}
