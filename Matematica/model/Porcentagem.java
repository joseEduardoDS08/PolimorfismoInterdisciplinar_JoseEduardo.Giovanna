package model;

import model.util.Utilitarios;

public class Porcentagem extends Calculo {
    private double valor, percentual;

    public Porcentagem(double valor, double percentual) {
        this.valor = valor;
        this.percentual = percentual;
    }

    @Override
    public void calcular() {
        double resultado = (valor * percentual) / 100;
        Utilitarios.exibirResultado("Valor da porcentagem", resultado);
    }
}
