package br.senai.sp.jandira.model;

public class Agencia {
	
	private String numero;
	private String gerente;
	private String telefone;
	private String cidade;
	
	//SET = DEFINIR O NUMERO
	public void setNumero (String numero) {
		this.numero = numero;
	}
	//GET = PEGAR O NUMERO
	public String getNumero() {
		return numero;
	}
	//SET
	public void setGerente (String gerente) {
		this.gerente = gerente;
	}
	//GET
	public String getGerente () {
		return gerente;
	}
	//SET
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	//GET
	public String getTelefone () {
		return telefone;
	}
	//SET
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	//GET
	public String getCidade () {
		return cidade;
	}

}
