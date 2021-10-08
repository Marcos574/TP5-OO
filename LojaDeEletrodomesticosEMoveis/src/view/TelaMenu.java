package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente às informações da TelaMenu
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
public class TelaMenu implements ActionListener {
	
	//Declarando as variáveis
	private static JFrame janela = new JFrame("Controle de Venda");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton venda = new JButton("Venda");
	private static JButton vendedor = new JButton("Vendedor");
	private static JButton movel = new JButton("Movel");
	private static JButton eletrodomestico = new JButton("Eletrodomestico");
	public static ControleDados dados = new ControleDados();
	
	/**
	 * Metodo para mostrar o menu principal do software
	 */
	public TelaMenu() {
		
		//Setando a posição dos botões do menu
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 5, 150, 30);
		venda.setBounds(120, 50, 140, 30);
		vendedor.setBounds(120, 75, 140, 30);
		cliente.setBounds(120, 100, 140, 30);
		movel.setBounds(120, 125, 140, 30);
		eletrodomestico.setBounds(120, 150, 140, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(venda);
		janela.add(vendedor);
		janela.add(movel);
		janela.add(eletrodomestico);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	/**
	 * Metodo para criar os botoes presentes no menu
	 * @param args 
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		vendedor.addActionListener(menu);
		venda.addActionListener(menu);
		movel.addActionListener(menu);
		eletrodomestico.addActionListener(menu);
	}
	
	/**
	 * Um if para cada opcao do menu, para que se o cliente
	 * escolha alguma opcao, o metodo chame outro metodo responsavel por 
	 * aquela opcao
	 */
	//Usando um if para escolher qual ação deve ser tomada a partir do botão que o usuário selecionar
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cliente)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == vendedor)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == movel)
			new TelaProduto().mostrarDados(dados, 1);
		
		if(src == eletrodomestico)
			new TelaProduto().mostrarDados(dados, 2);
		
		if(src == venda)
			new TelaVenda().mostrarDados(dados, 1);
	}
}
