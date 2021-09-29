package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7845-8";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500); 
		contaMaria.tipo = "Corrente";
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Cabral";
		contaPedro.numero = "6547-6";
		contaPedro.depositar(400);
		contaPedro.tipo = "Poupança";
		contaPedro.numeroAgencia = "4214-9";
		
		// Criação da conta da Ana
		Conta contaAna = new Conta();
		contaAna.titular = "Ana Gomes";
		contaAna.numero = "23145-9";
		contaAna.depositar(2000);
		contaAna.tipo = "Corrente";
		contaAna.numeroAgencia = "4214-9";
			
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		//Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		//Sacar 300 reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		//Depositar -200 na conta do Pedro (erro)
		System.out.println();
		contaPedro.depositar(-200);
		contaPedro.exibirDetalhes();
		
		//Sacar -100 da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		//Transferir 100 reais da conta do Pedro 
		//para a Maria
		
		
		
		contaPedro.transferir(contaMaria, 1000);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
	}
}
