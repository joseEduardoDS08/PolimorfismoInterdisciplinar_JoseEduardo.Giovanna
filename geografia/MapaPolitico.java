public class MapaPolitico extends Mapa {
    public MapaPolitico(String nome, Escala escala) {
        super(nome, escala);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mapa Político: " + nome);
        escala.exibirInformacoes();
    }
}