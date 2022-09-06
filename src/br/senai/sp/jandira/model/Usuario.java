package br.senai.sp.jandira.model;

public class Usuario {
	
	// Atributos
	public int multiplicador;
	public int minMulti;
	public int maxMulti;
	
	// Métodos
	
	public String[] getTabuada(){
		
		int tamanho = maxMulti - minMulti + 1;
		String[] tabuada = new String[tamanho];
		int i = 0;
		
		while (minMulti <= maxMulti) {
			
			int respostaMult = multiplicador * minMulti;
			String resultado = multiplicador + " X " + minMulti + " = " + respostaMult;
			tabuada[i] = resultado;
			
			i++;
			minMulti++;
		}
		return tabuada;
		
		
	
	}	
	

}
