import java.util.ArrayList;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(){

    }

    public void adicionarProduto (String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void removerProduto (ArrayList<Produto> lista, int indice) {
        if (lista.contains(indice)) {
            lista.remove(indice);
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }

    public static void mostrarEstoque (ArrayList<Produto> lista) {
        if (lista.isEmpty()){
            System.out.println("Não há produtos no estoque...");
        }
        else {
            for (int i = 0; i < lista.size(); i++) {
                Produto produto = lista.get(i);
                System.out.println(i + "-> nome: " + produto.nome + " | preço: " + produto.preco + " | Quantidade: " + produto.quantidade);
            }
        }
    }

    public static void valorTotalEstoque(ArrayList<Produto> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há produtos no estoque...");
        } else {
            float valorEstoque = 0;
            for (Produto produto : lista) {
                valorEstoque += (produto.preco * produto.quantidade);
            }
            System.out.println("Total de R$ em estoque: " + valorEstoque);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}


