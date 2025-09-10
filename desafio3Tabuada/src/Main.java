//Tabuada
//
//Peça um número e mostre a tabuada de 1 a 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int input;

        System.out.println("Digite um número:");
        input = ler.nextInt();

        for (int i = 1; i < 11; i++) {
                System.out.println(input+ "*" + i + ":" + input*i);
        }
    }
}
