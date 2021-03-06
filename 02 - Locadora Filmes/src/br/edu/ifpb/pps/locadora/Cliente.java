package br.edu.ifpb.pps.locadora;

import java.util.*;
public class Cliente {
	
  private String nome;
  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
  private int pontosDeAlugadorFrequente;
  private double valorTotal = 0.0;
  
  public Cliente(String nome) {
    this.nome = nome;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void adicionaAluguel(Aluguel aluguel) {
    fitasAlugadas.add(aluguel);
  }
  
  public String extrato() {
    String resultado = "Registro de Alugueis do cliente: " + this.nome + "\n";
    
    resultado += calcularCusto();
    
    resultado += "Valor total: " + this.valorTotal + "\n";
    resultado += this.nome +" você acumulou " + this.pontosDeAlugadorFrequente +
              " pontos de alugador frequente.";
    return resultado;
  }
  
  public String calcularCusto(){
	  Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
	  String total = "";
	  
	  while(alugueis.hasNext()) {
	      double valorCorrente = 0.0;
	      Aluguel cada = (Aluguel)alugueis.next();
	      switch(cada.getFita().getCódigoDePreço()) {
	      case Fita.NORMAL:
	        valorCorrente += 2;
	        if(cada.getDiasAlugada() > 2) {
	          valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
	        }
	        break;
	      case Fita.LANÇAMENTO:
	        valorCorrente += cada.getDiasAlugada() * 3;
	        break;
	      case Fita.INFANTIL:
	        valorCorrente += 1.5;
	        if(cada.getDiasAlugada() > 3) {
	          valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
	        }
	        break;
	      }
	      
	      pontosAlugadorFrequente(cada.getFita(),cada.getDiasAlugada());
	      
	      total += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente + "\n";
	      this.valorTotal += valorCorrente;
	    }	  
	  return total;
  }
  
  public void pontosAlugadorFrequente(Fita fita, int dias){
	  if(fita.getCódigoDePreço() == Fita.LANÇAMENTO && dias > 1) {
		  this.pontosDeAlugadorFrequente++;
	  }
	  this.pontosDeAlugadorFrequente++;
  }  
}