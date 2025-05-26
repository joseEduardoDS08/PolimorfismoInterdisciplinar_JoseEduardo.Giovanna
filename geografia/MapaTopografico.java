public class MapaTopografico extends Mapa {
    public MapaTopografico(String nome, Escala escala) {
        super(nome, escala);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mapa Topográfico: " + nome);
        escala.exibirInformacoes();
    }
}