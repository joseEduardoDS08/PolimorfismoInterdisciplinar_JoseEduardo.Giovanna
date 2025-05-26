package model;

import util.Utilitarios;

public class AceleracaoMedia extends Calculo {
    private double velocidadeFinal, velocidadeInicial, tempo;

    public AceleracaoMedia(double velocidadeFinal, double velocidadeInicial, double tempo) {
        this.velocidadeFinal = velocidadeFinal;
        this.velocidadeInicial = velocidadeInicial;
        this.tempo = tempo;
    }

    @Override
    public void calcular() {
        double resultado = (velocidadeFinal - velocidadeInicial) / tempo;
        Utilitarios.exibirResultado("Aceleração Média", resultado);
    }
}
