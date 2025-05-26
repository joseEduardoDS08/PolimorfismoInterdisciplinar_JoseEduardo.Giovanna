package model.Main;

import model.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Calculo> calculos = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU DE OPERAÇÕES:");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Bhaskara");
            System.out.println("3 - Calcular Regra de Três");
            System.out.println("4 - Calcular Porcentagem");
            System.out.println("5 - Exibir Cálculos Realizados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }

            if (opcao == 0) break;

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = scanner.nextDouble();
                        calculos.add(new Area(base, altura));
                        break;

                    case 2:
                        System.out.print("Digite o coeficiente a: ");
                        double a = scanner.nextDouble();
                        System.out.print("Digite o coeficiente b: ");
                        double b = scanner.nextDouble();
                        System.out.print("Digite o coeficiente c: ");
                        double c = scanner.nextDouble();
                        calculos.add(new Bhaskara(a, b, c));
                        break;

                    case 3:
                        System.out.print("Digite o valor: ");
                        double valor1 = scanner.nextDouble();
                        System.out.print("Digite a referência 1: ");
                        double ref1 = scanner.nextDouble();
                        System.out.print("Digite a referência 2: ");
                        double ref2 = scanner.nextDouble();
                        calculos.add(new RegraDeTres(valor1, ref1, ref2));
                        break;

                    case 4:
                        System.out.print("Digite o valor: ");
                        double valor2 = scanner.nextDouble();
                        System.out.print("Digite a porcentagem: ");
                        double percentual = scanner.nextDouble();
                        calculos.add(new Porcentagem(valor2, percentual));
                        break;

                    case 5:
                        if (calculos.isEmpty()) {
                            System.out.println("Nenhum cálculo foi realizado ainda.");
                        } else {
                            System.out.println("\nCÁLCULOS REALIZADOS:");
                            for (Calculo calculo : calculos) {
                                calculo.calcular();
                            }
                        }
                        break;

                    default:
                        System.out.println("Opção inválida! Escolha um número válido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar números corretamente.");
                scanner.next();
            }
        }

        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}
