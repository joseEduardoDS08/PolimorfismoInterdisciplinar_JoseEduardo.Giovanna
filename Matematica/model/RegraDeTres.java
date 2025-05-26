package model;

import model.util.Utilitarios;

public class RegraDeTres extends Calculo {
    private double valor1, referencia1, referencia2;

    public RegraDeTres(double valor1, double referencia1, double referencia2) {
        this.valor1 = valor1;
        this.referencia1 = referencia1;
        this.referencia2 = referencia2;
    }

    @Override
    public void calcular() {
        double resultado = (valor1 * referencia2) / referencia1;
        Utilitarios.exibirResultado("Resultado da Regra de Três", resultado);
    }
}

