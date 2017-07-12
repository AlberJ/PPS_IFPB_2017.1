package br.edu.ifpb.pps.baralho;

import java.util.ArrayList;

public class Jogador implements Comparable<Jogador>{
	private String nome;
	private int pontos;
	ArrayList <Carta> Cartas = new ArrayList<Carta>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public ArrayList<Carta> getCartas() {
		return Cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		Cartas = cartas;
	}
	
	public void addCarta(Carta carta){
		this.Cartas.add(carta);
	}
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Jogador [Nome: " + nome + ", Pontos: " + pontos + ", Cartas: " + Cartas + "]";
	}
	
	public void addPonto(int pontosGanhos){
		this.pontos = this.pontos + pontosGanhos;
	}
	
	public int compareTo(Jogador jogador) {
		if (this.pontos > jogador.getPontos()) {
	          return -1;
	     }
	     if (this.pontos < jogador.getPontos()) {
	          return 1;
	     }
		return 0;
	}
	
	
}
