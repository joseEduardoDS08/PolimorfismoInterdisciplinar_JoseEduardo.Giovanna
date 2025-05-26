public class EscalaNumerica extends Escala {
    public EscalaNumerica(double dimensaoReal, double dimensaoNoMapa) {
        super(dimensaoReal, dimensaoNoMapa);
    }

    @Override
    public double calcularEscala() {
        return dimensaoReal / dimensaoNoMapa;
    }
}
