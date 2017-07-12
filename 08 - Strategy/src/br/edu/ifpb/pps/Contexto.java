package br.edu.ifpb.pps;

public class Contexto {
	private Treinos TipoTreino;
	
	public Contexto(Treinos TipoTreino) {
		this.TipoTreino = TipoTreino;
	}

	void treioDiario() {
		this.TipoTreino.preparoFisico();
		this.TipoTreino.jogoTreino();
		treinoTatico();
	}
	
	void treinoTatico() {
		System.out.println("Treino tatico");
	}
}
