package br.edu.ifpb.pps.baralho;

public class DistribuicaoPrimeiraEUltima implements AlgoritmoDistribuicao{
	
	
	public DistribuicaoPrimeiraEUltima() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void retirarCarta(Baralho baralho, Jogador jogador){
		Baralho b = baralho;

		Carta primeira = b.pegarCarta(0);
		int a = b.Cartas.size();
		Carta ultima = b.pegarCarta(a);
		
		jogador.addCarta(primeira);
		jogador.addCarta(ultima);
		
		b.removeCarta(primeira);
		b.removeCarta(ultima);
		
		int x = primeira.valorCarta(primeira);
		jogador.addPonto(x);
		int y = ultima.valorCarta(ultima);
		jogador.addPonto(y);
	}
}
