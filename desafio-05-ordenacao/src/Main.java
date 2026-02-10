//Ordenação de Array
//
//Peça 10 números e mostre a lista ordenada sem usar Arrays.sort().
//
//(Pode usar um algoritmo como bubble sort ou selection sort).

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> lista) {
        int tamanho = lista.size();

        for (int varredura = 0; varredura < tamanho - 1; varredura++){
            boolean troca = false;
            for (int i = 0; i < tamanho - 1; i++){
                if (lista.get(i) > lista.get(i+1)) {
                    troca = true;
                    Integer temp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, temp);
                }
            }
            if (!troca) {
                break;
            }
        }
        return lista;
    }

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<Integer>();
    int num;

    for (int i = 0; i < 10; i++) {
        System.out.println("Digite o " + i + " Número:");
        num = ler.nextInt();
        numeros.add(num);
    }

    System.out.println("Lista desordenada: " + numeros);
    ArrayList<Integer> ordenado = bubbleSort(numeros);
    System.out.println("Lista ordenada: " + ordenado);
    }
}
