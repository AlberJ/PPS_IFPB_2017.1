package br.edu.ifpb.pps.singletron;

public class TesteIncremental {
	public static void main(String[] args){
		for(int i = 0; i<10; i++){
			Incremental incremental = new Incremental();
			System.out.println(incremental);
		}
	}
}
