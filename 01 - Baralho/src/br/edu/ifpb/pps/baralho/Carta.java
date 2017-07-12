package br.edu.ifpb.pps.baralho;

public class Carta {
	private String naipe;
	private String numero;
	
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Carta(String naipe, String numero) {
		super();
		this.naipe = naipe;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Carta [Naipe: " + naipe + ", Número: " + numero + "]";
	}
	
	public int valorCarta(Carta carta){
		int x=0, y=0;
		
		if(carta.naipe.equals("ouro")){
			x = 4;
		}else if(carta.naipe.equals("copas")){
			x = 3;
		}else if(carta.naipe.equals("espadas")){
			x = 2;
		}else{
			x = 1;
		}
		
		if(carta.numero.equals("A")){
			y = 13;
		}else if(carta.numero.equals("2")){
			y = 12;
		}else if(carta.numero.equals("3")){
			y = 11;
		}else if(carta.numero.equals("4")){
			y = 10;
		}else if(carta.numero.equals("5")){
			y = 9;
		}else if(carta.numero.equals("6")){
			y = 8;
		}else if(carta.numero.equals("7")){
			y = 7;
		}else if(carta.numero.equals("8")){
			y = 6;
		}else if(carta.numero.equals("9")){
			y = 5;
		}else if(carta.numero.equals("10")){
			y = 4;
		}else if(carta.numero.equals("J")){
			y = 3;
		}else if(carta.numero.equals("Q")){
			y = 2;
		}else{
			y = 1;
		}
		
		return x*y;
	}
}