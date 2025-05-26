package main;

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
            System.out.println("1 - Calcular Velocidade Média");
            System.out.println("2 - Calcular Aceleração Média");
            System.out.println("3 - Calcular Energia Potencial");
            System.out.println("4 - Calcular Energia Cinética");
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
                        System.out.print("Digite a distância (m): ");
                        double distancia = scanner.nextDouble();
                        System.out.print("Digite o tempo (s): ");
                        double tempo = scanner.nextDouble();
                        calculos.add(new VelocidadeMedia(distancia, tempo));
                        break;

                    case 2:
                        System.out.print("Digite a velocidade inicial (m/s): ");
                        double vInicial = scanner.nextDouble();
                        System.out.print("Digite a velocidade final (m/s): ");
                        double vFinal = scanner.nextDouble();
                        System.out.print("Digite o tempo (s): ");
                        double tempoA = scanner.nextDouble();
                        calculos.add(new AceleracaoMedia(vFinal, vInicial, tempoA));
                        break;

                    case 3:
                        System.out.print("Digite a massa (kg): ");
                        double massaP = scanner.nextDouble();
                        System.out.print("Digite a gravidade (m/s²): ");
                        double gravidade = scanner.nextDouble();
                        System.out.print("Digite a altura (m): ");
                        double altura = scanner.nextDouble();
                        calculos.add(new EnergiaPotencial(massaP, gravidade, altura));
                        break;

                    case 4:
                        System.out.print("Digite a massa (kg): ");
                        double massaC = scanner.nextDouble();
                        System.out.print("Digite a velocidade (m/s): ");
                        double velocidade = scanner.nextDouble();
                        calculos.add(new EnergiaCinetica(massaC, velocidade));
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
