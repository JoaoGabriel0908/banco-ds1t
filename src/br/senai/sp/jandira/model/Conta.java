package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	//Método construtor
	public Conta (String numeroConta) {
		numero = numeroConta;
	}
	//Métodos retornos SET e GET
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	//Depositar
	public void depositar(double valorDeposito) {
		
		System.out.println("Efetuando Depósito...");
		
		if (valorDeposito > 0) {
			saldo += valorDeposito;
			
			System.out.println();
			System.out.println("Foi depositado " + valorDeposito + " na conta do(a)" + titular);
		} else 
			System.out.println("Não é possível depositar um valor negativo");
	
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
			System.out.println("Não foi possível sacar");
		return false;
	}
	
	//Transferir
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		}else {
			System.out.println("Não foi possível realizar a transferência");
		}
		
	}
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
