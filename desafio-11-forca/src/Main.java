//Jogo da Forca
//
//O programa escolhe uma palavra secreta e o jogador vai tentando adivinhar letra por letra.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> abecedario = new ArrayList<>(Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        ));
        ArrayList<String> letrasMarcadas = new ArrayList<>();

        String[] palavrasSecreta = {"livro", "arvore", "computador"};
        Random random = new Random();
        int indice = random.nextInt(3);
        String palavraSecreta = palavrasSecreta[indice];

        // variáveis de controle
        int quantidadeLetras = palavraSecreta.length();
        int chances = 7;

        System.out.println("Bem vindo ao jogo da forca");
        System.out.println("Você terá 7 chances de acertar a palavra secreta, boa sorte!");
        while (true) {
            System.out.println("chances: "+ chances);
            // imprime os campos
            for (int i=0; i < palavraSecreta.length(); i++) {
                char c = palavraSecreta.charAt(i);
                if (letrasMarcadas.contains(String.valueOf(c))){
                    System.out.println(c);
                }
                else {
                    System.out.println("_");
                }
            }

            if (chances == 0) {
                System.out.println("Enforcado");
                break;
            }

            if (quantidadeLetras <= 3) {
                System.out.println("Deseja chutar a palavra? (s/n)");
                String optChute = scanner.nextLine().toLowerCase();
                if (optChute.equals("s")) {
                    System.out.println("Digite a palavra:");
                    String chuteUsuario = scanner.nextLine().toLowerCase();
                    if (chuteUsuario.matches(palavraSecreta)) {
                        System.out.println("Você acertou, parabéns!");
                        break;
                    } else {
                        System.out.println("Você errou...");
                        chances--;
                    }
                }
            }

            System.out.println("Digite uma letra:");
            String inputUsuario = scanner.nextLine().toLowerCase();

            if (inputUsuario.length() != 1) {
                System.out.println("Digite apenas uma letra...");
            }
            else if (!abecedario.contains(inputUsuario)) {
                System.out.println("Por favor digite uma letra válida(a-z)");
            }
            else if (letrasMarcadas.contains(inputUsuario)) {
                System.out.println("Essa letra já foi marcada...");
            }
            else {
                boolean flag = false;
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    char c = palavraSecreta.charAt(i);
                    if (inputUsuario.equals(String.valueOf(c))) {
                        letrasMarcadas.add(String.valueOf(c));
                        flag = true;
                        System.out.println("Letra acertada");
                        quantidadeLetras--;
                    }
                }
                if (!flag) {
                    System.out.println("Que pena, não há essa letra na palavra");
                    chances--;
                }
            }
        }
        System.out.println("saindo...");
    }
}