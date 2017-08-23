package br.edu.ifpb.pps.listeners;

import br.edu.ifpb.pps.eventos.EventoPressao;
import br.edu.ifpb.pps.eventos.EventoTemperatura;
import br.edu.ifpb.pps.eventos.EventoUmidade;
import br.edu.ifpb.pps.pojos.ClimaData;

public class AgenciadeClimaListener extends ClimaAdapter{
	
	@Override
	public void temperaturaMudou(EventoTemperatura e){
		System.out.print("Agencia Clima: Temperatura atual: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getTemperatura()));
	}
	
	@Override
	public void umidadeMudou(EventoUmidade e){
		System.out.print("Agencia Clima: Umidade atual: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getUmidade()));
	}
	
	@Override
	public void pressaoMudou(EventoPressao e){
		System.out.print("Agencia Clima: dePressão atual: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getPressao()));
	}
	
	
}
