package model;

import util.Utilitarios;

public class VelocidadeMedia extends Calculo {
    private double distancia, tempo;

    public VelocidadeMedia(double distancia, double tempo) {
        this.distancia = distancia;
        this.tempo = tempo;
    }

    @Override
    public void calcular() {
        double resultado = distancia / tempo;
        Utilitarios.exibirResultado("Velocidade Média", resultado);
    }
}
