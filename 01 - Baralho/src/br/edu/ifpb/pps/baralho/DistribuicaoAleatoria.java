package br.edu.ifpb.pps.baralho;

import java.util.Random;

public class DistribuicaoAleatoria implements AlgoritmoDistribuicao{
	
	public DistribuicaoAleatoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void retirarCarta(Baralho baralho, Jogador jogador){
		Baralho b = baralho;
		Random r = new Random();
		int i;
		for(i=1; i<3; i++){
			int a = b.Cartas.size();
			int n = r.nextInt(a) + 1;
			Carta carta = b.pegarCarta(n);
			jogador.addCarta(carta);
			b.removeCarta(carta);
			int x = carta.valorCarta(carta);
			jogador.addPonto(x);
		}
		
		
		
	}
}
