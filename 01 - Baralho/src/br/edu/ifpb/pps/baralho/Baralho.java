package br.edu.ifpb.pps.baralho;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
	ArrayList <Carta> Cartas = new ArrayList<Carta>();

	public ArrayList<Carta> getCartas() {
		return Cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		Cartas = cartas;
	}

	public Baralho() {
		super();
	}
	
	public void addCarta(Carta carta){
		this.Cartas.add(carta);
	}
	
	public Carta pegarCarta(int a){
		Carta c = this.Cartas.get(a);
		if (c != null){
			return c;
		}
		return null;
	}
	
	public Carta localizarCarta(String naipe, String numero){
		for(Carta carta : Cartas){
			if(carta.getNaipe().equals(naipe) && carta.getNumero().equals(numero)){
				return carta;
			} 
		}
		return null;
	}
	
	public void removeCarta(Carta carta){
		
		this.Cartas.remove(carta);
	}

	public void embaralhar(){
		Collections.shuffle(Cartas);
		System.out.println("embaralhou");
	}
	
	@Override
	public String toString() {
		return "Baralho [Cartas: " + Cartas + "]";
	}	
}