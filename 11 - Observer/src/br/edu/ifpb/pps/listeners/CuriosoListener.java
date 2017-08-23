package br.edu.ifpb.pps.listeners;

import br.edu.ifpb.pps.eventos.EventoPressao;
import br.edu.ifpb.pps.pojos.ClimaData;

public class CuriosoListener extends ClimaAdapter {
	
	@Override
	public void pressaoMudou(EventoPressao e) {
		System.out.print("CuriosoListener: pressão mudou! Agora é: ");
		System.out.println(Double.toString(((ClimaData) e.getSource()).getPressao()));
	}
}
