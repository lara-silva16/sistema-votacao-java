import java.util.Scanner;

class CalculadoraEstruturada {

    // PROCEDIMENTO: Apenas exibe o menu textual na tela
    public static void exibirMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Potência");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // FUNÇÃO: Calcula e retorna a soma de dois números
    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    // FUNÇÃO: Calcula e retorna a subtração de dois números
    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    // FUNÇÃO: Calcula e retorna a multiplicação de dois números
    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    // FUNÇÃO: Calcula e retorna a divisão (validação feita no procedimento)
    public static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    // FUNÇÃO: Calcula e retorna a potência de uma base por um expoente
    public static double potenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // PROCEDIMENTO: Gerencia a execução das operações com base na escolha
    public static void executarOperacao(int opcao, Scanner scanner) {
        System.out.print("Digite o 1º número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o 2º número: ");
        double num2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + somar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + dividir(num1, num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 5:
                System.out.println("Resultado da potência: " + potenciar(num1, num2));
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            exibirMenu(); // Chamada do procedimento do menu
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            if (opcao >= 1 && opcao <= 5) {
                executarOperacao(opcao, scanner); // Chamada do procedimento que gerencia os cases
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
