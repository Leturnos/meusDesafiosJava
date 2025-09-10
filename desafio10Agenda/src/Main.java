//Agenda de Contatos
//
//Classe Contato: nome, telefone, email.
//
//Use ArrayList para armazenar contatos.
//
//Permita pesquisar, adicionar e remover.

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Objects> agenda = new ArrayList<Objects>();

        while (true) {
            System.out.println("== Agenda Contatos ==");
            System.out.println("1 - Pesquisar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Remover contato  ");
            System.out.println("4 - sair             ");
            System.out.println("O que deseja?        ");
            String input = ler.nextLine();

            if (input.equals("1")) {
                System.out.println("Pesquisar contatos:");
                String busca = ler.nextLine();
            }

            else if (input.equals("2")) {
                while (true) {
                    System.out.println("== Adicionar produto ==");
                    System.out.println("Digite o Nome do contato:");
                    String nome = ler.nextLine();
                    System.out.println("Digite o telefone:");
                    String tel = ler.nextLine();
                    System.out.println("Digite a email:");
                    String email = ler.nextLine();
                }
            }
            else if (input.equals("3")) {
                Contato.removerContato();
            }
            else if (input.equals("4")) {
                break;
            }
            else {
                System.out.println("Opção inválida, retornando...");
                continue;
            }
        }
    }
}