package br.senai.sp.jandira.app;

//IMPORTADO AS CLASSES PARA O PASSO A PASSO DA CLASSE
import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

//CRIADO A CLASSE: APP 
public class App {

	//MÉTODO PARA GERAR O PROGRAMA 
	public static void main(String[] args) {
		
		//Criar uma Agencia
		Agencia agencia = new Agencia();
		agencia.setCidade("Jandira");
		agencia.setGerente("Celso");
		agencia.setNumero("4214-9");
		agencia.setTelefone("(11) 95687-4531");
	
		//Criar o cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria@terra.com.br");
		clienteMaria.setSalario(2000);
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500); 
		contaMaria.setTipo(TipoConta.CORRENTE); 
		
		System.out.println("===>" + contaMaria.getTipo());
		
		//Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@ig.com.br");
		clientePedro.setSalario(1500);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.depositar(400);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		
		System.out.println("===>" + contaPedro.getTipo());
		
		//Criar o cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("Anagomes@gmail.com");
		clienteAna.setSalario(3000);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setTitular(clienteAna); 
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO); 
		contaAna.setAgencia(agencia);
		
		System.out.println("===>" + contaAna.getTipo());
			
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
