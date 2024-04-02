package entities.contaAtividade03;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void depositaSaldo(double valor) {
		this.saldo += valor;
	}
	public void sacaSaldo(double valor) {
		this.saldo -= valor;
	}
	
	public double atualizarConta(double percentual) {
		double taxa = percentual / 100;
		this.saldo += (saldo  *taxa );
		return this.saldo;
	}
	
}
