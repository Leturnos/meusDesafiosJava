//Classe Jogador (pode ser de RPG ou futebol)
//
//Atributos: nome, nível, pontos de vida.
//
//Métodos: atacar outro jogador, receber dano, curar.
//
//Extra: simule uma batalha entre dois jogadores.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Robson", 10, 1000 );

        Jogador player2 = new Jogador("Juriscreide", 12, 1300 );

        Random random = new Random();

        while (player1.getPontosVida() > 0 && player2.getPontosVida() > 0) {
            boolean vez = random.nextBoolean();
            int dano = random.nextInt(20);
            if (vez) {
                player1.atacar(player2, dano);
            }
            else {
                player2.atacar(player1, dano);
            }
        }
    }
}