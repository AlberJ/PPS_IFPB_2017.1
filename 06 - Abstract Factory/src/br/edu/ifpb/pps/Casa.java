package br.edu.ifpb.pps;

public abstract class Casa {
	String piso;
	String parede;
	String porta;
	String tinta;
	String metais;
	String loucas;
	
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getParede() {
		return parede;
	}
	public void setParede(String parede) {
		this.parede = parede;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getTinta() {
		return tinta;
	}
	public void setTinta(String tinta) {
		this.tinta = tinta;
	}
	public String getMetais() {
		return metais;
	}
	public void setMetais(String metais) {
		this.metais = metais;
	}
	public String getLoucas() {
		return loucas;
	}
	public void setLoucas(String loucas) {
		this.loucas = loucas;
	}
	@Override
	public String toString() {
		return "Casa [piso=" + piso + ", parede=" + parede + ", porta=" + porta + ", tinta=" + tinta + ", metais="
				+ metais + ", louças=" + loucas + "]";
	}
	
	
}
