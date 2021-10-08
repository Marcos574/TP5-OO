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
import controle.ControleVenda;

/**
 * Classe referente às informações da TelaVenda
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

	public class TelaVenda implements ActionListener, ListSelectionListener {
		
		//Declaração de variáveis
		private JFrame janela;
		private JLabel titulo;
		private JButton cadastroVenda;
		private JButton refreshVenda;
		private static ControleDados dados;
		private JList<String> listaVendasCadastradas;
		private String[] listaIds = new String[50];
		
		/**
		 * Método para mostrar os produtos cadastrados
		 * @param d Puxando os dados necessários da classe ControleDados
		 * @param op Opcao do menu escolhida pelo usuario
		 */
		//Puxando o método para mostrar os produtos cadastrados
		public void mostrarDados(ControleDados d, int op){
			dados = d;

			switch (op) {
			case 1:// Mostrar dados de moveis cadastrados (JList)
				listaIds = new ControleVenda(dados).getIdVenda();
				listaVendasCadastradas = new JList<String>(listaIds);
				janela = new JFrame("Vendas");
				titulo = new JLabel("Busca Vendas Cadastradas");
				cadastroVenda = new JButton("Cadastrar");
				refreshVenda = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 15));
				titulo.setBounds(90, 10, 250, 30);
				listaVendasCadastradas.setBounds(20, 50, 350, 120);
				listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaVendasCadastradas.setVisibleRowCount(10);


				cadastroVenda.setBounds(70, 177, 100, 30);
				refreshVenda.setBounds(200, 177, 100, 30);

				janela.setLayout(null);

				janela.add(titulo);
				janela.add(listaVendasCadastradas);
				janela.add(cadastroVenda);
				janela.add(refreshVenda);

				janela.setSize(400, 250);
				janela.setVisible(true);

				cadastroVenda.addActionListener(this);
				refreshVenda.addActionListener(this);
				listaVendasCadastradas.addListSelectionListener(this);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
						JOptionPane.ERROR_MESSAGE);
				}

			}

		/**
		 * Captura de eventos relacionados aos botoes da interface
		 */
		//Captura eventos relacionados aos botões da interface
			public void actionPerformed(ActionEvent e) {
				Object src = e.getSource();
				
				//Cadastro de novo movel
				if(src == cadastroVenda)
					new TelaDetalheVenda().inserirEditar(1, dados, this, 0);

				// Atualiza a lista de nomes de moveis mostrada no JList
				if(src == refreshVenda) {
					listaVendasCadastradas.setListData(new ControleVenda(dados).getIdVenda());			
					listaVendasCadastradas.updateUI();
				}

			}

			//Captura eventos relacionados ao JList
			public void valueChanged(ListSelectionEvent e) {
				Object src = e.getSource();

				if(e.getValueIsAdjusting() && src == listaVendasCadastradas) {
					new TelaDetalheVenda().inserirEditar(2, dados, this, 
							listaVendasCadastradas.getSelectedIndex());
				}

			}
}
