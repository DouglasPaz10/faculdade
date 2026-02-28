public class Conta {
    // 1. ATRIBUTOS (Onde os dados moram na memória RAM)
    private int numero;
    private double saldo;

    // 2. CONSTRUTOR PADRÃO (Vazio)
    // Permite criar a conta "zerada" para preencher depois
    public Conta() {
    }

 
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;   
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
}