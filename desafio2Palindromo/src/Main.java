//Verificador de Palíndromo
//
//Leia uma palavra e diga se ela é um palíndromo (ex: arara, ovo).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String input;
        String rev = "";

        System.out.println("Verificador de palíndromo");
        System.out.println("Digite a palavra a ser analisada:");
        input = ler.nextLine();

        for (int i = input.length() - 1; i >=0 ; i--) {
            rev += input.charAt(i);
        }

        if (input.equals(rev)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}