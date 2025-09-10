public class ContaBancaria {
    private int numero;
    private String titular;
    private float saldo;

    public ContaBancaria(){

    }

    public ContaBancaria(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar (float valor) {
        saldo += valor;
    }

    public void sacar (float valor) {
        if (valor < saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo () {
        System.out.println("Saldo: " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
