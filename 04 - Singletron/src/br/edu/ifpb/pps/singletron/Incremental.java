package br.edu.ifpb.pps.singletron;

public class Incremental {
	private static Incremental instance = null;
	
	/*private static int count = 0;
	private int numero;
	
	public String toString(){
		return "Incremental "+numero;	
	}
	*/
	Incremental(){
		//numero = ++count;
	}
		
	public static Incremental getInstance(){
		if(instance == null)
			instance = new Incremental();
		return instance;
	}
}
