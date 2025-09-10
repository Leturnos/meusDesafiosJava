//Média de Notas
//
//Receba várias notas (até o usuário digitar um número negativo) e calcule a média.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;
        int resultado = 0;
        int qtd = 0;

        while (true) {
            System.out.println("Notas:");
            nota = ler.nextInt();
            if (nota < 0) {
                break;
            } else {
                resultado += nota;
                qtd += 1;
            }
        }
        System.out.println("média das notas:" + resultado/qtd);
    }
}