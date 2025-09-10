//Calculadora Simples
//
//Faça um programa que leia dois números e uma operação (+ - * /) e mostre o resultado.
//
//Extra: trate divisão por zero.

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float input1;
        float input2;
        String operacao;
        String retorno;

        while (true) {
            System.out.println("Digite um número:");
            try {
                input1 = Float.parseFloat(ler.nextLine());
            } catch(Exception e) {
                System.out.println("Isso não parece um número...");
                continue;
            }

            System.out.println("Digite outro número:");
            try {
                input2 = Float.parseFloat(ler.nextLine());
            } catch(Exception e) {
                System.out.println("Isso não parece um número...");
                continue;
            }

            System.out.println("Qual operação? (+ - * /)");
            operacao = ler.nextLine();

            if (operacao.equals("+")) {
                float resultado = input1 + input2;
                System.out.println(resultado);
            } else if (operacao.equals("-")) {
                float resultado = input1 - input2;
                System.out.println(resultado);
            } else if (operacao.equals("*")) {
                float resultado = input1 * input2;
                System.out.println(resultado);
            } else if (operacao.equals("/")) {
                if (input2 == 0) {
                    System.out.println(0.0);
                } else {
                    float resultado = input1 / input2;
                    System.out.println(resultado);
                }
            } else {
                System.out.println("Operação inválida, tente novamente...");
                continue;
            }

            System.out.println("Deseja outro calculo? (s/S)");
            retorno = ler.nextLine();

            if (retorno.equals("s") || retorno.equals("S")) {
                continue;
            } else {
                break;
            }
        }
    }
}
