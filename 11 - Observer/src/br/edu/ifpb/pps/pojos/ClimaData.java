package br.edu.ifpb.pps.pojos;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.eventos.EventoPressao;
import br.edu.ifpb.pps.eventos.EventoTemperatura;
import br.edu.ifpb.pps.eventos.EventoUmidade;
import br.edu.ifpb.pps.listeners.ClimaListener;

public class ClimaData {
	private double temperatura;
	private double umidade;
	private double pressao;
	private List<ClimaListener> listeners = new ArrayList<ClimaListener>();
	
	public void addListener(ClimaListener listener){
		if(!this.listeners.contains(listener))
			this.listeners.add(listener);
	}
	
	public void removeListener(ClimaListener listener){
		if(this.listeners.contains(listener))
			this.listeners.remove(listener);
	}
	
	public void Mudancas(){
		EventoPressao p = new EventoPressao(this);
		EventoTemperatura t = new EventoTemperatura(this);
		EventoUmidade u = new EventoUmidade(this);
		
		for(ClimaListener l : listeners){
			l.pressaoMudou(p);
			l.temperaturaMudou(t);
			l.umidadeMudou(u);
		}
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}
	public double getPressao() {
		return pressao;
	}
	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
}
