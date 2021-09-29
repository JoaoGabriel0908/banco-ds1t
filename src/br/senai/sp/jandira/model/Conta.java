package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	public String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	public void depositar(double valorDeposito) {
		
		System.out.println("Efetuando Dep�sito...");

	//Depositar
		if (valorDeposito > 0) {
			saldo += valorDeposito;
			
			System.out.println();
			System.out.println("Foi depositado " + valorDeposito + " na conta do(a)" + titular);
		} else 
			System.out.println("N�o � poss�vel depositar um valor negativo");
	
	//Sacar
	}
	public boolean sacar(double valorSaque) {
	
		System.out.println();
		System.out.println("Efetuando saque...");
		
		if (valorSaque > 0 && valorSaque <= saldo) {
			
			saldo -= valorSaque;
			System.out.println("Foi realizado um saque de " + valorSaque + " restou " + saldo + " na sua conta ");
		return true;
			
		} else 
			System.out.println("N�o foi poss�vel sacar");
		return false;
	}
	//Transferir
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		}else {
			System.out.println("N�o foi poss�vel realizar a transfer�ncia");
		}
			
	}
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
