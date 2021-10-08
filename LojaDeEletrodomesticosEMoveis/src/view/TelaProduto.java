package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleDados;
import controle.ControleEletrodomestico;
import controle.ControleMovel;

/**
 * Classe referente às informações da TelaProduto
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
public class TelaProduto implements ActionListener, ListSelectionListener {
	
	//Declaração de variáveis
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroMovel;
	private JButton refreshMovel;
	private JButton cadastroEletro;
	private JButton refreshEletro;
	private static ControleDados dados;
	private JList<String> listaMoveisCadastrados;
	private JList<String> listaEletrodomesticosCadastrados;
	private String[] listaNomes = new String[50];
	
	/**
	 * Metodo para mostrar os produtos cadastrados
	 * @param d Puxando os dados necessários da classe ControleDados
	 * @param op Opcao do menu escolhida pelo usuario
	 */
	//Puxando o método para mostrar os produtos cadastrados
	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de moveis cadastrados (JList)
			listaNomes = new ControleMovel(dados).getNomeMovel();
			listaMoveisCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Moveis");
			titulo = new JLabel("Busca Moveis Cadastrados");
			cadastroMovel = new JButton("Cadastrar");
			refreshMovel = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(90, 10, 250, 30);
			listaMoveisCadastrados.setBounds(20, 50, 350, 120);
			listaMoveisCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMoveisCadastrados.setVisibleRowCount(10);


			cadastroMovel.setBounds(70, 177, 100, 30);
			refreshMovel.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaMoveisCadastrados);
			janela.add(cadastroMovel);
			janela.add(refreshMovel);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroMovel.addActionListener(this);
			refreshMovel.addActionListener(this);
			listaMoveisCadastrados.addListSelectionListener(this);
			break;
		case 2:// Mostrar dados de eletrodomesticos cadastrados (JList)
			listaNomes = new ControleEletrodomestico(dados).getNomeEletrodomestico();
			listaEletrodomesticosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Eletrodomestico");
			titulo = new JLabel("Busca Eletrodomesticos Cadastrados");
			cadastroEletro = new JButton("Cadastrar");
			refreshEletro = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 13));
			titulo.setBounds(90, 10, 250, 30);
			listaEletrodomesticosCadastrados.setBounds(20, 50, 350, 120);
			listaEletrodomesticosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEletrodomesticosCadastrados.setVisibleRowCount(10);


			cadastroEletro.setBounds(70, 177, 100, 30);
			refreshEletro.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaEletrodomesticosCadastrados);
			janela.add(cadastroEletro);
			janela.add(refreshEletro);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroEletro.addActionListener(this);
			refreshEletro.addActionListener(this);
			listaEletrodomesticosCadastrados.addListSelectionListener(this);
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
			
			//Cadastro de novo movel
			if(src == cadastroMovel)
				new TelaDetalheProduto().inserirEditarP(1, dados, this, 0);

			//Cadastro de novo eletrodomestico
			if(src == cadastroEletro)
				new TelaDetalheProduto().inserirEditarP(2, dados, this, 0);

			// Atualiza a lista de nomes de moveis mostrada no JList
			if(src == refreshMovel) {
				listaMoveisCadastrados.setListData(new ControleMovel(dados).getNomeMovel());			
				listaMoveisCadastrados.updateUI();
			}

			// Atualiza a lista de nomes de eletrodomesticos mostrada no JList
			if(src == refreshEletro) {
				listaEletrodomesticosCadastrados.setListData(new ControleEletrodomestico(dados).getNomeEletrodomestico());
				listaEletrodomesticosCadastrados.updateUI();
			}

		}
		
		/**
		 * Captura eventos relacionados ao Jlist
		 */
		//Captura eventos relacionados ao JList
		public void valueChanged(ListSelectionEvent e) {
			Object src = e.getSource();

			if(e.getValueIsAdjusting() && src == listaMoveisCadastrados) {
				new TelaDetalheProduto().inserirEditarP(3, dados, this, 
						listaMoveisCadastrados.getSelectedIndex());
			}

			if(e.getValueIsAdjusting() && src == listaEletrodomesticosCadastrados) {
				new TelaDetalheProduto().inserirEditarP(4, dados, this, 
						listaEletrodomesticosCadastrados.getSelectedIndex());
			}
		}

	}
