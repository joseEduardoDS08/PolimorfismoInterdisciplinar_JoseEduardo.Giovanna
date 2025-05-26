public abstract class Escala {
    protected double dimensaoReal;
    protected double dimensaoNoMapa;

    public Escala(double dimensaoReal, double dimensaoNoMapa) {
        this.dimensaoReal = dimensaoReal;
        this.dimensaoNoMapa = dimensaoNoMapa;
    }

    public abstract double calcularEscala();

    public void exibirInformacoes() {
        System.out.println("Dimensão real: " + dimensaoReal + " km");
        System.out.println("Dimensão no mapa: " + dimensaoNoMapa + " cm");
        System.out.println("Escala: 1:" + calcularEscala());
    }
}