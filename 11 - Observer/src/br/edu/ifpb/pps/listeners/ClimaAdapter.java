package br.edu.ifpb.pps.listeners;

import br.edu.ifpb.pps.eventos.EventoPressao;
import br.edu.ifpb.pps.eventos.EventoTemperatura;
import br.edu.ifpb.pps.eventos.EventoUmidade;
import br.edu.ifpb.pps.pojos.ClimaData;

public class ClimaAdapter implements ClimaListener{

	@Override
	public void temperaturaMudou(EventoTemperatura e) {
		System.out.print("ClimaAdapter (default): temperatura mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getTemperatura()));
	}

	@Override
	public void pressaoMudou(EventoPressao e) {
		System.out.print("ClimaAdapter (default): pressão mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getPressao()));
	}

	@Override
	public void umidadeMudou(EventoUmidade e) {
		System.out.print("ClimaAdapter (default): umidade mudou: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getUmidade()));
	}
	
}
