import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

    static char[][] tabuleiro = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        iniciarTabuleiro();

        char jogador = 'X';
        boolean jogo = true;

        while (jogo) {

            mostrarTabuleiro();

            if (jogador == 'X') {
                jogadaJogador();
            } else {
                jogadaComputador();
            }

            if (verificarVitoria(jogador)) {
                mostrarTabuleiro();

                if (jogador == 'X') {
                    System.out.println("Parabéns! Você venceu!");
                } else {
                    System.out.println("O computador venceu!");
                }
                jogo = false;

            } else if (tabuleiroCheio()) {

                mostrarTabuleiro();
                System.out.println("Empate!");
                jogo = false;

            } else {

                if (jogador == 'X') {
                    jogador = 'O';
                } else {
                    jogador = 'X';
                }
            }
        }

        sc.close();
    }

    // Inicializa o tabuleiro
    static void iniciarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Mostra o tabuleiro
    static void mostrarTabuleiro() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    // Jogada do jogador
    static void jogadaJogador() {

        int linha, coluna;

        do {

            System.out.print("Digite a linha (0 a 2): ");
            linha = sc.nextInt();

            System.out.print("Digite a coluna (0 a 2): ");
            coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição inválida! Tente novamente.");
            }

        } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = 'X';
    }

    // Jogada do computador
    static void jogadaComputador() {

        int linha, coluna;

        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = 'O';

        System.out.println("Computador jogou na posição: (" + linha + "," + coluna + ")");
    }

    // Verifica vitória
    static boolean verificarVitoria(char jogador) {

        // Linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador &&
                    tabuleiro[i][1] == jogador &&
                    tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador &&
                    tabuleiro[1][i] == jogador &&
                    tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        // Diagonal principal
        if (tabuleiro[0][0] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][2] == jogador) {
            return true;
        }

        // Diagonal secundária
        if (tabuleiro[0][2] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    // Verifica empate
    static boolean tabuleiroCheio() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}