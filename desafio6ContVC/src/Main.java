//Contador de Vogais e Consoantes
//
//Peça uma frase e mostre quantas vogais e quantas consoantes ela tem.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a frase:");
        String frase = ler.nextLine();

        int contVogal = 0;
        int contCons = 0;
        for (int i = 0; i < frase.length(); i++)
            if ((frase.charAt(i) == 'A') || (frase.charAt(i) == 'a') ||
                (frase.charAt(i) == 'E') || (frase.charAt(i) == 'e') ||
                (frase.charAt(i) == 'I') || (frase.charAt(i) == 'i') ||
                (frase.charAt(i) == 'O') || (frase.charAt(i) == 'o') ||
                (frase.charAt(i) == 'U') || (frase.charAt(i) == 'u')) {
                contVogal += 1;
            } else {
                contCons += 1;
            }

        System.out.println("Na frase há " + contVogal + " vogais");
        System.out.println("Na frase há " + contCons + " consoantes");
    }
}