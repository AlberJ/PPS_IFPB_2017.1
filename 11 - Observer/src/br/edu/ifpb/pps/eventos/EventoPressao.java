package br.edu.ifpb.pps.eventos;

import java.util.EventObject;

import br.edu.ifpb.pps.pojos.ClimaData;

public class EventoPressao extends EventObject{
	public EventoPressao(ClimaData source){
		super(source);
	}
}
