import java.util.Scanner;

public class CalculadoraFinanceira {

    public static double calcularValorFuturo(double valorPresente, double taxaJuros, int anos) {
        return valorPresente * Math.pow(1 + taxaJuros, anos);
    }

    public static double calcularValorPresente(double valorFuturo, double taxaJuros, int anos) {
        return valorFuturo / Math.pow(1 + taxaJuros, anos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Financeira ===");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Calcular Valor Futuro");
        System.out.println("2. Calcular Valor Presente");

        System.out.print("Digite o número da operação escolhida: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("\nCalcular Valor Futuro");
            System.out.print("Digite o valor presente (VP): ");
            double valorPresente = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (em %): ");
            double taxaJuros = scanner.nextDouble() / 100;

            System.out.print("Digite o número de anos: ");
            int anos = scanner.nextInt();

            double resultado = calcularValorFuturo(valorPresente, taxaJuros, anos);
            System.out.printf("O valor futuro é: R$%.2f%n", resultado);

        } else if (opcao == 2) {
            System.out.println("\nCalcular Valor Presente");
            System.out.print("Digite o valor futuro (VF): ");
            double valorFuturo = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (em %):");
            double taxaJuros = scanner.nextDouble() / 100;

            System.out.print("Digite o número de anos: ");
            int anos = scanner.nextInt();

            double resultado = calcularValorPresente(valorFuturo, taxaJuros, anos);
            System.out.printf("O valor presente é: R$%.2f%n", resultado);

        } else {
            System.out.println("Opção inválida. Reinicie o programa.");
        }

        scanner.close();
    }
}
