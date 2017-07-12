package br.edu.ifpb.pps;

public class Main {
	public static void main(String[] args) {
		Contexto c1 = new Contexto(new TreinoNoMeioDaTemporada());
		c1.treioDiario();
		c1.treinoTatico();
		
		Contexto c2 = new Contexto(new TreinoNoInicioDaTemporada());
		c2.treioDiario();
		c2.treinoTatico();
	}
}