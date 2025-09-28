//Agenda de Contatos
//
//Classe Contato: nome, telefone, email.
//
//Use ArrayList para armazenar contatos.
//
//Permita pesquisar, adicionar e remover.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<Contato>();

        while (true) {
            System.out.println("== Agenda Contatos ==");
            System.out.println("1 - Pesquisar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Remover contato  ");
            System.out.println("4 - sair             ");
            System.out.println("O que deseja?        ");
            String input = ler.nextLine();

            if (input.equals("1")) {
                if (contatos.isEmpty()) {
                    System.out.println("Lista vazia");
                }
                else{
                    String inputPesquisa;
                    while (true) {
                        System.out.println("Pesquisar contatos: (0 - todos, 1 - busca, 2 - sair)");
                        inputPesquisa = ler.nextLine();
                        if (inputPesquisa.equals("0")){
                            for (Contato contato : contatos){
                                System.out.println(contato);
                                System.out.println();
                            }
                            break;
                        }
                        else if (inputPesquisa.equals("1")) {
                            System.out.println("Digite o nome do contato:");
                            String busca = ler.nextLine();
                            boolean flagEncontrado = false;
                            for (Contato contato : contatos){
                                if (contato.getNome().equals(busca)) {
                                    System.out.println(contato);
                                    System.out.println();
                                    flagEncontrado = true;
                                }
                            }
                            if (!flagEncontrado) {
                                System.out.println("contato não encontrado");
                            }
                            break;
                        }
                        else if (inputPesquisa.equals("2")) {
                            break;
                        }
                        else {
                            System.out.println("Opção inválida, retornando...");
                            continue;
                        }
                    }
                }
            }

            else if (input.equals("2")) {
                System.out.println("== Adicionar produto ==");
                System.out.println("Digite o Nome do contato:");
                String nome = ler.nextLine();
                System.out.println("Digite o telefone:");
                String tel = ler.nextLine();
                System.out.println("Digite a email:");
                String email = ler.nextLine();

                Contato adicionarContato = new Contato(nome, tel, email);
                contatos.add(adicionarContato);
            }
            else if (input.equals("3")) {
                if (contatos.isEmpty()) {
                    System.out.println("Lista vazia");
                }
                else {
                    System.out.println("Digite o Nome do contato a ser removido:");
                    String nomeRemocao = ler.nextLine();
                    boolean flagEncontrado = false;
                    for (int i = 0; contatos.size() > i; i++){
                        if (contatos.get(i).getNome().equals(nomeRemocao)) {
                            System.out.println(contatos.get(i) + " :removido");
                            contatos.remove(i);
                            flagEncontrado = true;
                        }
                    }
                    if (!flagEncontrado) {
                        System.out.println("contato não encontrado");
                    }
                }
            }
            else if (input.equals("4")) {
                System.out.println("Encerrando serviço...");
                break;
            }
            else {
                System.out.println("Opção inválida, retornando...");
                continue;
            }
        }
    }
}