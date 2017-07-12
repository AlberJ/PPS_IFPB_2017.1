package br.edu.ifpb.pps.baralho;

public class DistribuicaoDuasCartas implements AlgoritmoDistribuicao{
	
	public DistribuicaoDuasCartas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void retirarCarta(Baralho baralho, Jogador jogador){
		Baralho b = baralho;
		int i;
		for(i=1;i<3;i++){
			int a = b.Cartas.size();
			Carta carta = b.pegarCarta(a);		
			jogador.addCarta(carta);		
			b.removeCarta(carta);
			int x = carta.valorCarta(carta);
			jogador.addPonto(x);
		}
		
	}
}
