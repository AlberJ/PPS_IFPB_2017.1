package br.edu.ifpb.pps;

import br.edu.ifpb.pps.listeners.AgenciadeClimaListener;
import br.edu.ifpb.pps.listeners.ClimaListener;
import br.edu.ifpb.pps.listeners.CuriosoListener;
import br.edu.ifpb.pps.pojos.ClimaData;

public class Teste {
	
	public static void main(String[] args){
		ClimaData c = new ClimaData();
		
		c.setPressao(10.0);
		c.setTemperatura(29.8);
		c.setUmidade(87);

		ClimaListener l1 = new AgenciadeClimaListener();
		ClimaListener l2 = new CuriosoListener();

		c.addListener(l1); 
		c.Mudancas();
				
		c.addListener(l2);
		c.Mudancas();
		
		c.removeListener(l1);
		c.Mudancas();
	}

}
