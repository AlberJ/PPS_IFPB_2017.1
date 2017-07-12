package br.edu.ifpb.pps;

public abstract class Treinos {
	final void treioDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	abstract void preparoFisico();
	abstract void jogoTreino();
	
	final void treinoTatico() {
		System.out.println("Treino tatico");
	}
}
