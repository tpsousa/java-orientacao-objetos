public class Conta {
    private int numeroConta;
    private double saldo;
    public String titular;

    // Getter for saldo
    public double getSaldo(){
       return saldo;
    }

    // Setter for saldo
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Method to withdraw money
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true; // Indicating success
        } else {
            System.out.println("Saldo insuficiente");
            return false; // Indicating failure
        }
    }

    // Getter for numeroConta
    public int getNumeroConta(){
        return numeroConta;
    }

    // Setter for numeroConta
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
}

/* class Animal {
    void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
} */