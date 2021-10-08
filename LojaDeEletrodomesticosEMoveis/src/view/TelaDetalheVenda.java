package view;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

import controle.ControleDados;

/**
 * Classe referente às informações que irão aparecer da tela do usuário
 * ao selecionar Venda
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
public class TelaDetalheVenda implements ActionListener {
	
	
	//Declaração de variáveis
		private JFrame janela;
		private JLabel labelIdVenda = new JLabel("Id da venda: ");
		private JTextField valorIdVenda;
		private JLabel labelNomeCliente = new JLabel("Nome do cliente: ");
		private JTextField valorNomeCliente;
		private JLabel labelNomeVendedor = new JLabel("Nome do vendedor: ");
		private JTextField valorNomeVendedor;
		private JLabel labelEletrodomesticoComprado = new JLabel("Eletrodomestico da compra: ");
		private JTextField valorEletrodomesticoComprado;
		private JLabel labelMovelComprado = new JLabel("Movel da compra: ");
		private JTextField valorMovelComprado;
		private JButton botaoSalvar = new JButton("Salvar");
		private String[] novoDado = new String[6];
		private static ControleDados dados;
		private int posicao;
		private int opcao;
		private String s;
		
		/**
		 * Metodo para inserir ou editar a venda
		 * @param op opcao escolhida pelo usuário
		 * @param d Dados referentes às vendas ja existentes
		 * @param telaVenda Dados necessarios da classe TelaVenda
		 * @param pos Posição da venda
		 */
		//Puxando o método inserirEditar para cadastro ou edição de pessoas
		public void inserirEditar(int op, ControleDados d, 
				TelaVenda telaVenda, int pos) {

			opcao = op;
			posicao = pos;
			dados = d;
			
			
			if (op == 1) s = "Cadastro de Venda";
			if (op == 2) s = "Detalhe de Venda";

			janela = new JFrame(s);
			
			
			//Preenche dados com dados do cliente clicado
			if (op == 2) {
				valorIdVenda = new JTextField(Integer.toString(dados.getVendas()[pos].getIdVenda(), 200));
				valorNomeCliente = new JTextField(dados.getVendas()[pos].getCliente(),200);
				valorNomeVendedor = new JTextField(dados.getVendas()[pos].getVendedor(),200);
				valorEletrodomesticoComprado = new JTextField(dados.getVendas()[pos].getEletroComprados(), 200);
				valorMovelComprado = new JTextField(dados.getVendas()[pos].getMovelComprados(), 200);
			
				
			}  else { //Não preenche com dados

				valorIdVenda = new JTextField(200);
				valorNomeCliente = new JTextField(200);
				valorNomeVendedor = new JTextField(200);
				valorEletrodomesticoComprado = new JTextField(200);
				valorMovelComprado = new JTextField(200);

				botaoSalvar.setBounds(245, 240, 115, 30);
			}

			labelIdVenda.setBounds(30, 25, 150, 25);
			valorIdVenda.setBounds(180, 25, 180, 25);
			labelNomeCliente.setBounds(30, 50, 150, 25);
			valorNomeCliente.setBounds(180, 50, 180, 25);
			labelNomeVendedor.setBounds(30, 75, 180, 25);
			valorNomeVendedor.setBounds(180, 75, 180, 25);		
			labelEletrodomesticoComprado.setBounds(30, 100, 150, 25);
			valorEletrodomesticoComprado.setBounds(180, 100, 180, 25);
			labelMovelComprado.setBounds(30, 125, 150, 25);
			valorMovelComprado.setBounds(180, 125, 180, 25);

		

			//Coloca botoes de excluir e salvar
			if (op == 2 ) {
				botaoSalvar.setBounds(120, 225, 115, 30);
			}

			this.janela.add(labelIdVenda);
			this.janela.add(valorIdVenda);
			this.janela.add(labelNomeCliente);
			this.janela.add(valorNomeCliente);
			this.janela.add(labelNomeVendedor);
			this.janela.add(valorNomeVendedor);
			this.janela.add(labelEletrodomesticoComprado);
			this.janela.add(valorEletrodomesticoComprado);
			this.janela.add(labelMovelComprado);
			this.janela.add(valorMovelComprado);
			this.janela.add(botaoSalvar);

			this.janela.setLayout(null);

			this.janela.setSize(400, 400);
			this.janela.setVisible(true);

			botaoSalvar.addActionListener(this);
	
		}

		/**
		 * Insere os valores digitados pelo usuário nas vendas
		 */
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == botaoSalvar) {
				try {
					boolean res;
					if(opcao == 1) //cadastro de novo cliente
						novoDado[0] = Integer.toString(dados.getTotalVendas());
					else // edicao de dado existente
						novoDado[0] = Integer.toString(posicao);

					novoDado[1] =  valorIdVenda.getText();
					novoDado[2] =  valorNomeCliente.getText();
					novoDado[3] =  valorNomeVendedor.getText();
					novoDado[4] =  valorEletrodomesticoComprado.getText();
					novoDado[5] =  valorMovelComprado.getText();
					res = dados.inserirEditarVenda(novoDado);
					

					if(res) {
						mensagemSucessoCadastro();
					}
					else mensagemErroCadastro();

				} catch (NullPointerException exc1) {
					mensagemErroCadastro();
				} catch (NumberFormatException exc2) {
					mensagemErroCadastro();
				}
			}

		}
		
		/**
		 * Mensagem indicando que o cadastro da venda foi um sucesso
		 */
		//Mensagens de erro ou sucesso nas ações possíveis
		public void mensagemSucessoCadastro() {
			JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem indicando que o cadastro da venda foi um erro
		 */
		public void mensagemErroCadastro() {
			JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
					+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
					+ "1. Nem todos os campos foram preenchidos \n"
					+ "2. CPF, CEP, Numero da casa e telefone não contém apenas números", null, 
					JOptionPane.ERROR_MESSAGE);
		}
}
