package entities.conta;

public class ContaCorrente {

    protected double saldo;


    public double getSaldo(){
        return this.saldo;
    }

    public void depositaConta(double valor){
        this.saldo += valor;
    }

    public void sacarConta(double valor){
        this.saldo -= valor + (valor * 0.5);
    }

}

