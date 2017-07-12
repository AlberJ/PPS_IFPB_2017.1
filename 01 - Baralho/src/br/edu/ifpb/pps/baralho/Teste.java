package br.edu.ifpb.pps.baralho;

public class Teste {

	public static void main(String[] args) {
		Jogador a = new Jogador("Manoel");
		Jogador b = new Jogador("Angelo");
		
		Baralho baralho = new Baralho();
		
		Jogo jogo = new Jogo(baralho);
		jogo.addJogador(a);
		jogo.addJogador(b);
		
		//DistribuicaoAleatoria algoritmo = new DistribuicaoAleatoria();
		AlgoritmoDistribuicao algoritmo = new DistribuicaoAleatoria(); //ai é só mudar aqui o danado 
		jogo.definirAlgoritmo(algoritmo);
		
		//cartas		
		//ouro
		Carta ouroA = new Carta("ouro", "A");
		Carta ouro2 = new Carta("ouro", "2");
		Carta ouro3 = new Carta("ouro", "3");
		Carta ouro4 = new Carta("ouro", "4");
		Carta ouro5 = new Carta("ouro", "5");
		Carta ouro6 = new Carta("ouro", "6");
		Carta ouro7 = new Carta("ouro", "7");
		Carta ouro8 = new Carta("ouro", "8");
		Carta ouro9 = new Carta("ouro", "9");
		Carta ouro10 = new Carta("ouro", "10");
		Carta ouroJ = new Carta("ouro", "J");
		Carta ouroQ = new Carta("ouro", "Q");
		Carta ouroK = new Carta("ouro", "K");
		baralho.addCarta(ouroA);
		baralho.addCarta(ouro2);
		baralho.addCarta(ouro3);
		baralho.addCarta(ouro4);
		baralho.addCarta(ouro5);
		baralho.addCarta(ouro6);
		baralho.addCarta(ouro7);
		baralho.addCarta(ouro8);
		baralho.addCarta(ouro9);
		baralho.addCarta(ouro10);
		baralho.addCarta(ouroJ);
		baralho.addCarta(ouroQ);
		baralho.addCarta(ouroK);
		
		//copas
		Carta prataA = new Carta("copas", "A");
		Carta prata2 = new Carta("copas", "2");
		Carta prata3 = new Carta("copas", "3");
		Carta prata4 = new Carta("copas", "4");
		Carta prata5 = new Carta("copas", "5");
		Carta prata6 = new Carta("copas", "6");
		Carta prata7 = new Carta("copas", "7");
		Carta prata8 = new Carta("copas", "8");
		Carta prata9 = new Carta("copas", "9");
		Carta prata10 = new Carta("copas", "10");
		Carta prataJ = new Carta("copas", "J");
		Carta prataQ = new Carta("copas", "Q");
		Carta prataK = new Carta("copas", "K");
		baralho.addCarta(prataA);
		baralho.addCarta(prata2);
		baralho.addCarta(prata3);
		baralho.addCarta(prata4);
		baralho.addCarta(prata5);
		baralho.addCarta(prata6);
		baralho.addCarta(prata7);
		baralho.addCarta(prata8);
		baralho.addCarta(prata9);
		baralho.addCarta(prata10);
		baralho.addCarta(prataJ);
		baralho.addCarta(prataQ);
		baralho.addCarta(prataK);
		
		//espadas
		Carta espadasA = new Carta("espadas", "A");
		Carta espadas2 = new Carta("espadas", "2");
		Carta espadas3 = new Carta("espadas", "3");
		Carta espadas4 = new Carta("espadas", "4");
		Carta espadas5 = new Carta("espadas", "5");
		Carta espadas6 = new Carta("espadas", "6");
		Carta espadas7 = new Carta("espadas", "7");
		Carta espadas8 = new Carta("espadas", "8");
		Carta espadas9 = new Carta("espadas", "9");
		Carta espadas10 = new Carta("espadas", "10");
		Carta espadasJ = new Carta("espadas", "J");
		Carta espadasQ = new Carta("espadas", "Q");
		Carta espadasK = new Carta("espadas", "K");
		baralho.addCarta(espadasA);
		baralho.addCarta(espadas2);
		baralho.addCarta(espadas3);
		baralho.addCarta(espadas4);
		baralho.addCarta(espadas5);
		baralho.addCarta(espadas6);
		baralho.addCarta(espadas7);
		baralho.addCarta(espadas8);
		baralho.addCarta(espadas9);
		baralho.addCarta(espadas10);
		baralho.addCarta(espadasJ);
		baralho.addCarta(espadasQ);
		baralho.addCarta(espadasK);
		
		//paus
		Carta pausA = new Carta("paus", "A");
		Carta paus2 = new Carta("paus", "2");
		Carta paus3 = new Carta("paus", "3");
		Carta paus4 = new Carta("paus", "4");
		Carta paus5 = new Carta("paus", "5");
		Carta paus6 = new Carta("paus", "6");
		Carta paus7 = new Carta("paus", "7");
		Carta paus8 = new Carta("paus", "8");
		Carta paus9 = new Carta("paus", "9");
		Carta paus10 = new Carta("paus", "10");
		Carta pausJ = new Carta("paus", "J");
		Carta pausQ = new Carta("paus", "Q");
		Carta pausK = new Carta("paus", "K");
		baralho.addCarta(pausA);
		baralho.addCarta(paus2);
		baralho.addCarta(paus3);
		baralho.addCarta(paus4);
		baralho.addCarta(paus5);
		baralho.addCarta(paus6);
		baralho.addCarta(paus7);
		baralho.addCarta(paus8);
		baralho.addCarta(paus9);
		baralho.addCarta(paus10);
		baralho.addCarta(pausJ);
		baralho.addCarta(pausQ);
		baralho.addCarta(pausK);
		
		baralho.embaralhar();
	
		//tirar as cartas e verificar vencedor
		
		System.out.println(baralho.toString());
		
		//jogador 1 tirando carta
		AlgoritmoDistribuicao.retirarCarta(baralho, a);
		
		//jogador 2 tirando carta
		AlgoritmoDistribuicao.retirarCarta(baralho, b);
		
		System.out.println(baralho.toString());
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		
		
	}
}
