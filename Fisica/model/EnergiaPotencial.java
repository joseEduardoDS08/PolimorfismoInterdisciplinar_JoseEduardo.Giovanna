package model;

import util.Utilitarios;

public class EnergiaPotencial extends Calculo {
    private double massa, gravidade, altura;

    public EnergiaPotencial(double massa, double gravidade, double altura) {
        this.massa = massa;
        this.gravidade = gravidade;
        this.altura = altura;
    }

    @Override
    public void calcular() {
        double resultado = massa * gravidade * altura;
        Utilitarios.exibirResultado("Energia Potencial Gravitacional", resultado);
    }
}
