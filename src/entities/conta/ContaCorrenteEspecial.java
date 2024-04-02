package entities.conta;

public class ContaCorrenteEspecial extends ContaCorrente{

    

    @Override
    public void sacarConta(double valor){
        super.saldo -= valor + (valor * 0.1);
    }

}
