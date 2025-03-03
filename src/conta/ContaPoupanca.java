package src.conta;

import src.cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}