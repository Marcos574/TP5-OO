package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe referente às informações da TelaPessoa
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class TelaPessoa implements ActionListener, ListSelectionListener {
	
	//Declaração de variáveis
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroVendedor;
	private JButton refreshVendedor;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaVendedoresCadastrados;
	private String[] listaNomes = new String[50];
	
	/**
	 * Metodo para mostrar as pessoas cadastradas
	 * @param d Puxando os dados necessários da classe ControleDados
	 * @param op Opcao do menu escolhida pelo usuario
	 */
	//Puxando o método para mostrar os dados das pessoas cadastradas
	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de clientes cadastrados (JList)
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Busca Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 100, 30);
			refreshCliente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(refreshCliente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;
		case 2:// Mostrar dados de vendedores cadastrados (JList)
			listaNomes = new ControleVendedor(dados).getNomeVendedor();
			listaVendedoresCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Vendedores");
			titulo = new JLabel("Busca Vendedores Cadastrados");
			cadastroVendedor = new JButton("Cadastrar");
			refreshVendedor = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(90, 10, 250, 30);
			listaVendedoresCadastrados.setBounds(20, 50, 350, 120);
			listaVendedoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVendedoresCadastrados.setVisibleRowCount(10);


			cadastroVendedor.setBounds(70, 177, 100, 30);
			refreshVendedor.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaVendedoresCadastrados);
			janela.add(cadastroVendedor);
			janela.add(refreshVendedor);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroVendedor.addActionListener(this);
			refreshVendedor.addActionListener(this);
			listaVendedoresCadastrados.addListSelectionListener(this);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}
	/**
	 * Captura eventos relacionados aos botoes da interface
	 */
	//Captura eventos relacionados aos botões da interface
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			//Cadastro de novo cliente
			if(src == cadastroCliente)
				new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

			//Cadastro de novo vendedor
			if(src == cadastroVendedor)
				new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

			// Atualiza a lista de nomes de clientes mostrada no JList
			if(src == refreshCliente) {
				listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
				listaClientesCadastrados.updateUI();
			}

			// Atualiza a lista de nomes de vendedores mostrada no JList
			if(src == refreshVendedor) {
				listaVendedoresCadastrados.setListData(new ControleVendedor(dados).getNomeVendedor());
				listaVendedoresCadastrados.updateUI();
			}

		}
		
		/**
		 * Captura eventos relacionados ao Jlist
		 */
		//Captura eventos relacionados ao JList
		public void valueChanged(ListSelectionEvent e) {
			Object src = e.getSource();

			if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
				new TelaDetalhePessoa().inserirEditar(3, dados, this, 
						listaClientesCadastrados.getSelectedIndex());
			}

			if(e.getValueIsAdjusting() && src == listaVendedoresCadastrados) {
				new TelaDetalhePessoa().inserirEditar(4, dados, this, 
						listaVendedoresCadastrados.getSelectedIndex());
			}
		}

	}
