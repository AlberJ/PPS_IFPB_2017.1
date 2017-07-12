package br.edu.ifpb.pps.baralho;

import java.util.ArrayList;
import java.util.Collections;

public class Jogo {
	ArrayList <Jogador> jogadores = new ArrayList<Jogador>();
	private Baralho baralho;
	private int rodada;
	private AlgoritmoDistribuicao algoritmo;
	
	public AlgoritmoDistribuicao getAlgoritmo() {
		return algoritmo;
	}

	public void setAlgoritmo(AlgoritmoDistribuicao algoritmo) {
		this.algoritmo = algoritmo;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public Jogo(Baralho baralho) {
		super();
		this.baralho = baralho;
	}
	
	public void definirAlgoritmo(AlgoritmoDistribuicao danado){
		this.algoritmo = danado;
	}
	
	@Override
	public String toString() {
		return "Jogo [jogadores=" + jogadores + ", baralho=" + baralho + ", rodada=" + rodada + "]";
	}

	public void addJogador(Jogador jogador){
		this.jogadores.add(jogador);
	}
	
	public void verificarVencedor(){
		if(rodada >= 10 || baralho.Cartas.size()==0){
			Collections.sort(jogadores);
			jogadores.toString();
		}
	}
	
	public void addRodada(){
		this.rodada = this.rodada + 1;
	}
}
