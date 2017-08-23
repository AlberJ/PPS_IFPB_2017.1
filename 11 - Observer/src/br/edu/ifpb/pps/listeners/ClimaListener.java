package br.edu.ifpb.pps.listeners;

import java.util.EventListener;

import br.edu.ifpb.pps.eventos.EventoPressao;
import br.edu.ifpb.pps.eventos.EventoTemperatura;
import br.edu.ifpb.pps.eventos.EventoUmidade;

public interface ClimaListener extends EventListener{
	
	void temperaturaMudou(EventoTemperatura e);
	void pressaoMudou(EventoPressao e);
	void umidadeMudou(EventoUmidade e);
	
}
