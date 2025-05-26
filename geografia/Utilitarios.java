import java.util.Scanner;

public class Utilitarios {
    public static double obterDouble(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Double.parseDouble(scanner.nextLine());
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
    }
}