package br.edu.ifpb.pps.eventos;

import java.util.EventObject;

import br.edu.ifpb.pps.pojos.ClimaData;

public class EventoTemperatura extends EventObject {
	public EventoTemperatura(ClimaData source) {
		super(source);
	}

}
