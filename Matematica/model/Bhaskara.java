package model;

import model.util.Utilitarios;

public class Bhaskara extends Calculo {
    private double a, b, c;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calcular() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            Utilitarios.exibirResultado("Raiz x1", x1);
            Utilitarios.exibirResultado("Raiz x2", x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
