//Classe ContaBancaria
//
//Atributos: número, titular, saldo.
//
//Métodos: depositar, sacar, mostrarSaldo.
//
//Teste criando 2 contas e fazendo transferências.
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, "Osvaldo", 123.45F);
        ContaBancaria conta2 = new ContaBancaria(2, "Gabriel", 987.65F);

        conta1.depositar(100);
        conta1.sacar(600);
        conta1.mostrarSaldo();

        conta2.depositar(1000);
        conta2.sacar(470);
        conta2.mostrarSaldo();
    }
}