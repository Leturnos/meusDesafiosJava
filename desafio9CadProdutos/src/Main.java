import java.util.ArrayList;
import java.util.Scanner;

//Cadastro de Produtos
//
//Classe Produto: nome, preço, quantidade.
//
//Crie uma lista de produtos e permita:
//
//Adicionar produto
//
//Remover produto
//
//Mostrar estoque
//
//Calcular valor total em estoque
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        while (true) {
            System.out.println("== Gerindo Estoque ==");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto  ");
            System.out.println("3 - Listar produtos  ");
            System.out.println("4 - total em estoque ");
            System.out.println("5 - sair             ");
            System.out.println("O que deseja?        ");
            String input = ler.nextLine();

            if (input.equals("1")) {
                while (true) {
                    System.out.println("== Adicionar produto ==");
                    System.out.println("Digite o Nome do produto:");
                    String nome = ler.nextLine();
                    System.out.println("Digite o valor do produto:");
                    String temp = ler.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    String temp2 = ler.nextLine();

                    try {
                        float valor = Float.parseFloat(temp);
                        int qtd = Integer.parseInt(temp2);

                        Produto produto = new Produto();
                        produto.adicionarProduto(nome, valor, qtd);
                        produtos.add(produto);

                        break;
                    } catch (Exception e){
                        System.out.println("Que número mais estranho...");
                        continue;
                    }
                }
            }
            else if (input.equals("2")) {
                System.out.println("Digite o indice que deseja remover: ");
                String temp3 = ler.nextLine();
                try {
                    int indice = Integer.parseInt(temp3);
                    produtos.remove(indice);

                } catch (Exception e) {
                    System.out.println("Coloque apenas o numero inteiro correspondente...");
                }
            }

            else if (input.equals("3")) {
                Produto.mostrarEstoque(produtos);
            }
            else if (input.equals("4")) {
                Produto.valorTotalEstoque(produtos);
            }
            else if (input.equals("5")) {
                System.out.println("Encerrando sistema...");
                break;
            }
            else {
                System.out.println("Opção inválida, retornando...");
                continue;
            }
        }
    }
}