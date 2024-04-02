package aulaPauloAtv4;

import entities.contaAtividade03.ContaPoupanca;

public class testeContaPC {

	public static void main(String[] args) {
		ContaPoupanca contaP = new ContaPoupanca(2000);

		System.out.println(contaP.getSaldo());
		contaP.atualizarConta(10);
		System.out.println(contaP.getSaldo());
		
		
	}

}
