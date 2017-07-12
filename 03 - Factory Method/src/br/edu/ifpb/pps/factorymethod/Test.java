package br.edu.ifpb.pps.factorymethod;

public class Test {
	public static void main(String[] args) {
		Nome nome1 = FactoryNome.getNome("McNealy, Scott");
		Nome nome2 = FactoryNome.getNome("James Gosling");
		Nome nome3 = FactoryNome.getNome("Naughton, Patrick");
		
		System.out.println(nome1.getNome());
		System.out.println(nome2.getNome());
		System.out.println(nome3.getNome());
	}
}