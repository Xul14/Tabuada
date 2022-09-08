package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Usuario;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(largura,altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.getContentPane().setBackground(Color.WHITE);
		
		//Colocar container
		Container painel = tela.getContentPane();
		
		JLabel titulo = new JLabel();
		titulo.setText("Tabuada 1.0");
		titulo.setBounds(80, 30, 300, 30);
		titulo.setForeground(Color.RED);
		titulo.setFont(new Font ("arial", Font.BOLD,30));
		
		JLabel descricao = new JLabel();
		descricao.setText("Com a Tabuada 1.0 os seus problemas acabaram. Calcule");
		descricao.setBounds(80, 60, 550, 30);
		descricao.setFont(new Font ("arial", Font.BOLD,12));
		descricao.setForeground(Color.GRAY);
		
		JLabel descricaoContinuacao = new JLabel();
		descricaoContinuacao.setText(" a tabuada que desejar em segundos!");
		descricaoContinuacao.setBounds(80, 75, 550, 30);
		descricaoContinuacao.setFont(new Font ("arial", Font.BOLD,12));
		descricaoContinuacao.setForeground(Color.GRAY);
		
		
		JLabel multiplicando = new JLabel();
		multiplicando.setText("Multiplicando: ");
		multiplicando.setBounds(90, 130, 200, 30);
		multiplicando.setFont(new Font ("arial", Font.BOLD, 16));
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(220, 130, 150, 30);
		textFieldMultiplicando.setFont(new Font ("arial", Font.BOLD, 16));
		
		JLabel minMult = new JLabel();
		minMult.setText("Mínimo Multiplicador: ");
		minMult.setBounds(45, 180, 200, 30);
		minMult.setFont(new Font("arial", Font.BOLD,16));
		
		JTextField textFieldMin = new JTextField();
		textFieldMin.setBounds(220, 180, 150, 30);
		textFieldMin.setFont(new Font ("arial", Font.BOLD, 16));
		
		JLabel maxMult = new JLabel();
		maxMult.setText("Máximo Multiplicador: ");
		maxMult.setBounds(40, 230, 200, 30);
		maxMult.setFont(new Font("arial", Font.BOLD,16));
		
		JTextField textFieldMax = new JTextField();
		textFieldMax.setBounds(220, 230, 150, 30);
		textFieldMax.setFont(new Font ("arial", Font.BOLD, 16));
		
		//Botões
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(40, 280, 190, 40);
		buttonCalcular.setFont(new Font("arial", Font.BOLD,14));
		buttonCalcular.setBackground(new Color(124,175,9));
		buttonCalcular.setForeground(Color.WHITE);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(240, 280, 128, 40);
		buttonLimpar.setFont(new Font("arial", Font.BOLD,14));
		buttonLimpar.setBackground(new Color(246,196,14));
		buttonLimpar.setForeground(Color.WHITE);
		
		
		JLabel resultado = new JLabel();
		resultado.setText("Resultado: ");
		resultado.setBounds(40, 340, 150, 30);
		resultado.setFont(new Font("arial", Font.BOLD,16));
		
		//Jlist
		JList<String> lista = new JList<>();
		lista.setBounds(40, 370, 330, 200);
		lista.setBackground(Color.red);
		lista.setFont(new Font("arial", Font.BOLD, 14));
		lista.setBorder(new LineBorder(Color.BLACK));
		lista.setBackground(new Color(252,238,188));
		lista.setForeground(new Color(124,175,9));
		
		//imagem
		ImageIcon icone = new ImageIcon(("src/br/senai/sp/jandira/imagens/calculadora.png"));
		JLabel icon = new JLabel();
		icon.setIcon(icone);
		icon.setBounds(10, 20, 100, 100);
		
		
		//Adicionar componentes no container
		painel.add(titulo);
		painel.add(descricao);
		painel.add(descricaoContinuacao);
		painel.add(multiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(minMult);
		painel.add(textFieldMin);
		painel.add(maxMult);
		painel.add(textFieldMax);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(resultado);
		painel.add(lista);
		painel.add(icon);
		
		tela.setVisible(true);
		
		//Botões com ação
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Usuario tabuada = new Usuario();
				tabuada.multiplicador = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minMulti = Integer.parseInt(textFieldMin.getText());
				tabuada.maxMulti = Integer.parseInt(textFieldMax.getText());
				
				lista.setListData(tabuada.getTabuada());
//				scroll.getViewpot().add(lista);
				
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == buttonLimpar) {
					
					textFieldMultiplicando.setText(" ");
					textFieldMin.setText(" ");
					textFieldMax.setText(" ");
				}
				
			}
		});
		
		
		
		
		
		
	}
	
	
	
	

}
