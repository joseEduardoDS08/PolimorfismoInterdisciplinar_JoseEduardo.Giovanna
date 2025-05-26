import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Mapa> mapas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Mapa Político");
            System.out.println("2. Adicionar Mapa Topográfico");
            System.out.println("3. Exibir Mapas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    String nomePolitico = obterString("Digite o nome do mapa político: ");
                    double dimensaoRealPolitico = Utilitarios.obterDouble("Digite a dimensão real (em km): ");
                    double dimensaoNoMapaPolitico = Utilitarios.obterDouble("Digite a dimensão no mapa (em cm): ");
                    Escala escalaPolitico = new EscalaNumerica(dimensaoRealPolitico, dimensaoNoMapaPolitico);
                    mapas.add(new MapaPolitico(nomePolitico, escalaPolitico));
                    break;
                case 2:
                    String nomeTopografico = obterString("Digite o nome do mapa topográfico: ");
                    double dimensaoRealTopografico = Utilitarios.obterDouble("Digite a dimensão real (em km): ");
                    double dimensaoNoMapaTopografico = Utilitarios.obterDouble("Digite a dimensão no mapa (em cm): ");
                    Escala escalaTopografico = new EscalaVerbal(dimensaoRealTopografico, dimensaoNoMapaTopografico);
                    mapas.add(new MapaTopografico(nomeTopografico, escalaTopografico));
                    break;
                case 3:
                    for (Mapa mapa : mapas) {
                        mapa.exibirDetalhes();
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static String obterString(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
