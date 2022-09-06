package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Usuario;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {
	
	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura= 800;
		
		Usuario tabuada = new Usuario();
		tabuada.multiplicador = 101;
		tabuada.maxMulti = 10;
		tabuada.minMulti = 5;
		
		String[] resultado = tabuada.getTabuada();
		
		int i = 0;
		
		while(i < resultado.length ){
			System.out.println(resultado[i]);
			i++;
		}
		
	
		
	}

}
