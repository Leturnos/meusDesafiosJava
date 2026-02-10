//Jogo da Velha
//
//Dois jogadores alternadamente marcam uma posição no tabuleiro ("O" ou "X")
//A cada jogada, deve-se mostrar o tabuleiro
//O programa deve terminar automaticamente quando alguem ganhar ou empatar
//Não é para criar outras classes fora a principal

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];

        System.out.println("//Jogo da velha//");
        System.out.println("jogador 1 -> O");
        System.out.println("jogador 2 -> X");

        // decide quem começa
        boolean vez = new Random().nextBoolean();
        boolean jogador1;
        boolean jogador2;
        if (vez) {
            jogador1 = true;
            jogador2 = false;
            System.out.println("Jogador 1 começa");
        } else {
            jogador1 = false;
            jogador2 = true;
            System.out.println("Jogador 2 começa");
        }

        int qtdJogadas = 0;
        boolean ganhou = false;
        while (!ganhou) {
            if (qtdJogadas < 9) {
                while (jogador1) {
                    System.out.println("jogador 1, digite a linha(1,2,3)");
                    int j1linha = scanner.nextInt();
                    System.out.println("jogador 1, digite a coluna(1,2,3)");
                    int j1coluna = scanner.nextInt();

                    if (j1linha > 0 && j1linha <= 3 && j1coluna > 0 && j1coluna <= 3) {
                        j1linha--;
                        j1coluna--;
                        if (tabuleiro[j1linha][j1coluna] == null) {
                            tabuleiro[j1linha][j1coluna] = "O";
                            qtdJogadas++;
                            jogador1 = false; // fez a jogada
                            if (verificarGanhador(tabuleiro))
                                ganhou = true;
                        } else {
                            System.out.println("A casa já é dominada pelo jogador 2");
                            continue;
                        }

                        imprimirTabuleiro(tabuleiro);
                        if (qtdJogadas == 9){

                        }
                        if (!ganhou && qtdJogadas < 9)
                            jogador2 = true;

                    } else {
                        System.out.println("casa inválida, digite apenas 1,2 ou 3");
                    }
                }
                while (jogador2) {
                    System.out.println("jogador 2, digite a linha(1,2,3)");
                    int j2linha = scanner.nextInt();
                    System.out.println("jogador 2, digite a coluna(1,2,3)");
                    int j2coluna = scanner.nextInt();

                    if (j2linha > 0 && j2linha <= 3 && j2coluna > 0 && j2coluna <= 3) {
                        j2linha--;
                        j2coluna--;
                        if (tabuleiro[j2linha][j2coluna] == null) {
                            tabuleiro[j2linha][j2coluna] = "X";
                            qtdJogadas++;
                            jogador2 = false; // fez a jogada
                            if (verificarGanhador(tabuleiro))
                                ganhou = true;
                        } else {
                            System.out.println("A casa já é dominada pelo jogador 1");
                            continue;
                        }

                        imprimirTabuleiro(tabuleiro);
                        if (!ganhou && qtdJogadas < 9)
                            jogador1 = true;

                    } else {
                        System.out.println("casa inválida, digite apenas 1,2 ou 3");
                    }
                }
            } else {
                System.out.println("Empatou!");
                break;
            }
        }
    }

    public static boolean verificarGanhador(String[][] tabuleiro){
        if ("O".equals(tabuleiro[0][0]) && "O".equals(tabuleiro[0][1]) && "O".equals(tabuleiro[0][2]) // linha1
                || "O".equals(tabuleiro[1][0]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[1][2]) // linha2
                || "O".equals(tabuleiro[2][0]) && "O".equals(tabuleiro[2][1]) && "O".equals(tabuleiro[2][2]) // linha3
                || "O".equals(tabuleiro[0][0]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[2][2])
                || "O".equals(tabuleiro[0][2]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[2][0])
                || "O".equals(tabuleiro[0][0]) && "O".equals(tabuleiro[1][0]) && "O".equals(tabuleiro[2][0]) // coluna1
                || "O".equals(tabuleiro[0][1]) && "O".equals(tabuleiro[1][1]) && "O".equals(tabuleiro[2][1]) // coluna2
                || "O".equals(tabuleiro[0][2]) && "O".equals(tabuleiro[1][2]) && "O".equals(tabuleiro[2][2])) { // coluna3
            System.out.println("Vitoria do jogador 1");
            return true;
        } else if ("X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[0][2])
                || "X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[1][2])
                || "X".equals(tabuleiro[2][0]) && "X".equals(tabuleiro[2][1]) && "X".equals(tabuleiro[2][2])
                || "X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][2])
                || "X".equals(tabuleiro[0][2]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][0])
                || "X".equals(tabuleiro[0][0]) && "X".equals(tabuleiro[1][0]) && "X".equals(tabuleiro[2][0])
                || "X".equals(tabuleiro[0][1]) && "X".equals(tabuleiro[1][1]) && "X".equals(tabuleiro[2][1])
                || "X".equals(tabuleiro[0][2]) && "X".equals(tabuleiro[1][2]) && "X".equals(tabuleiro[2][2])) {
            System.out.println("Vitoria do jogador 2");
            return true;
        }
        else {
            return false;
        }
    }

    public static void imprimirTabuleiro(String[][] tabuleiro) {
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                // Se a casa for nula, imprime um espaço, senão imprime o "O" ou "X"
                System.out.print(" " + (tabuleiro[i][j] == null ? " " : tabuleiro[i][j]) + " ");
                if (j < 2) {
                    System.out.print("|"); // barra vertical entre as colunas
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----------"); // linha horizontal entre as linhas
            }
        }
        System.out.println();
    }
}
