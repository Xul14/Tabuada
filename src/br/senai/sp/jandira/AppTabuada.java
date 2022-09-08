package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Usuario;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {
	
	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 700;
		tela.largura= 450;
		tela.criarTela();
		
		Usuario tabuada = new Usuario();
		tabuada.multiplicador = 2 ;
		tabuada.maxMulti = 13;
		tabuada.minMulti = 12;
		
		String[] resultado = tabuada.getTabuada();
		
		int i = 0;
		
		while(i < resultado.length ){
			System.out.println(resultado[i]);
			i++;
		}
		
	
		
	}

}
