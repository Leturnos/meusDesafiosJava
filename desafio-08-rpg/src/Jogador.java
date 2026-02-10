public class Jogador {
    private String nome;
    private int nivel;
    private int pontosVida;

    public Jogador(String nome, int nivel, int pontosVida) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosVida = pontosVida;
    }

    public void atacar (Jogador alvo, int dano){
        dano = nivel * dano;
        if (dano > 5) {
            System.out.println(getNome() + " atacou " + alvo.nome);
            alvo.receberDano(dano);
        } else {
            alvo.curar(dano);
        }
    }

    public void receberDano (int danoRecebido) {
        System.out.println(nome + " recebeu " + danoRecebido + " de dano");
        this.pontosVida -= danoRecebido;

        if (this.pontosVida <= 0){
            System.out.println(nome + " morreu");
        } else {
            System.out.println(nome + " possui " + this.pontosVida + " de vida");
        }
    }

    public void curar (int valor) {
        this.pontosVida += valor;
        System.out.println(nome + " usou uma poção de cura");
        System.out.println(nome + " possui " + this.pontosVida + " de vida");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

}
