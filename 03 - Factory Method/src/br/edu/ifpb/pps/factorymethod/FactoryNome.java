package br.edu.ifpb.pps.factorymethod;

public class FactoryNome {
	public static Nome getNome(String nome){
		if(nome.contains(",")){
			return new NomeA(nome);
		}else{
			return new NomeB(nome);
		}
	}
}
