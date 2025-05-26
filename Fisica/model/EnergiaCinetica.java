package model;

import util.Utilitarios;

public class EnergiaCinetica extends Calculo {
    private double massa, velocidade;

    public EnergiaCinetica(double massa, double velocidade) {
        this.massa = massa;
        this.velocidade = velocidade;
    }

    @Override
    public void calcular() {
        double resultado = 0.5 * massa * Math.pow(velocidade, 2);
        Utilitarios.exibirResultado("Energia Cinética", resultado);
    }
}
