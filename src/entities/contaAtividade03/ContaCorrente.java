package entities.contaAtividade03;

public class ContaCorrente extends Conta{

	
	public ContaCorrente(double saldo) {
		super(saldo);
	}



	@Override
	public double atualizarConta(double percentual) {
		double taxa = percentual / 100;
		super.atualizarConta(taxa * 2);
		return super.getSaldo();
	}
	
}
