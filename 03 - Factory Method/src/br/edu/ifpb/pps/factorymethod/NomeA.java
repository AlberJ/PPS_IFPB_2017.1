package br.edu.ifpb.pps.factorymethod;

public class NomeA implements Nome{
	private String nome;
	
	public NomeA(String nome){
		this.setNome(nome);
	}
	public void setNome(String nome) {
		String[] a = nome.split(", ");
		String primeiroNome = a[1];
		String segundoNome = a[0];
		this.nome = primeiroNome + " " + segundoNome;		
	}
	public String getNome() {
		return this.nome;
	}
}