package model;

import model.util.Utilitarios;

public class Area extends Calculo {
    private double base, altura;

    public Area(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcular() {
        double resultado = base * altura;
        Utilitarios.exibirResultado("Área calculada", resultado);
    }
}
