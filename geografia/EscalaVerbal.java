public class EscalaVerbal extends Escala {
    public EscalaVerbal(double dimensaoReal, double dimensaoNoMapa) {
        super(dimensaoReal, dimensaoNoMapa);
    }

    @Override
    public double calcularEscala() {
        return dimensaoReal / dimensaoNoMapa;
    }
}