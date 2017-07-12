package br.edu.ifpb.pps.factorymethod;

public class NomeB implements Nome{
	private String nome;
	
	public String getNome() {
		return this.nome;
	}
	public NomeB(String nome){
		this.setNome(nome);
	}
	public void setNome(String nome){
		this.nome = nome;
	}	
}