package br.edu.ifpb.pps.eventos;

import java.util.EventObject;

import br.edu.ifpb.pps.pojos.ClimaData;

public class EventoUmidade extends EventObject{
	public EventoUmidade(ClimaData source){
		super(source);
	}

}
