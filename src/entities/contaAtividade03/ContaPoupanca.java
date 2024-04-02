package entities.contaAtividade03;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	@Override
	public double atualizarConta(double percentual) {
		double taxa = percentual / 100;
		super.atualizarConta(taxa * 3);
		return super.getSaldo();
	}
	
}
