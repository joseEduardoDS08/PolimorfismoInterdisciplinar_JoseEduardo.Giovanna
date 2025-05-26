public abstract class Mapa {
    protected String nome;
    protected Escala escala;

    public Mapa(String nome, Escala escala) {
        this.nome = nome;
        this.escala = escala;
    }

    public abstract void exibirDetalhes();
}