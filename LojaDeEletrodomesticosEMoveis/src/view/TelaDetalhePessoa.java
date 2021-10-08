package view;

import java.awt.event.ActionEvent;

/**
 * Classe referente às informações que irão aparecer da tela do usuário
 * ao selecionar Cliente/Vendedor
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhePessoa implements ActionListener {
	
	//Declaração de variáveis
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelQtdVendas = new JLabel("Quantidade de vendas: ");
	private JTextField valorQtdVendas;
	private JLabel labelNumTelefone = new JLabel("Telefone: ");
	private JTextField valorNumTelefone;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelLocalizacao = new JLabel("Localizacao");
	private JLabel labelCEP = new JLabel("CEP: ");
	private JTextField valorCEP;
	private JLabel labelNumCasa = new JLabel("Numero da casa: ");
	private JTextField valorNumCasa;
	private JLabel labelDataNascimento = new JLabel("Data de nascimento: ");
	private JTextField valorDataNascimento;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Metodo para inserir ou editar as pessoas
	 * @param op opcao selecionada pelo usuário
	 * @param d Dados referentes aos produtos ja existentes
	 * @param telaPessoa Dados necessários da classe ControleDados
	 * @param pos Posição da pessoa
	 */
	//Puxando o método inserirEditar para cadastro ou edição de pessoas
	public void inserirEditar(int op, ControleDados d, 
			TelaPessoa telaPessoa, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;
		
		/**
		 * Opções para seleção do menu
		 */
		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Cadastro de Vendedor";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Vendedor";

		janela = new JFrame(s);
		
		
		//Preenche dados com dados do cliente clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getClientes()[pos].getNome(), 200);
			valorNumTelefone = new JTextField(Integer.toString(dados.getClientes()[pos].getNumTelefone()),200);
			valorQtdVendas = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getClientes()[pos].getCPF()), 200);
			valorCEP = new JTextField(String.valueOf(dados.getClientes()[pos].getLocal().getCEP()), 200);
			valorNumCasa = new JTextField(String.valueOf(dados.getClientes()[pos].getLocal().getNumcasa()), 200);
			valorDataNascimento = new JTextField(String.valueOf(dados.getClientes()[pos].getDataNascimento()), 10);			
			
			
		} else if (op == 4) { //Preenche dados com dados do vendedor clicado 
			valorNome = new JTextField(dados.getVendedores()[pos].getNome(), 200);
			valorNumTelefone = new JTextField(Integer.toString(dados.getVendedores()[pos].getNumTelefone()),200);
			valorCPF = new JTextField(String.valueOf(dados.getVendedores()[pos].getCPF()), 200);
			valorQtdVendas = new JTextField(Integer.toString(dados.getVendedores()[pos].getQtdVendas()),200);
			valorCEP = new JTextField((String.valueOf(dados.getVendedores()[pos].getLocal().getCEP())),200);
			valorNumCasa = new JTextField((String.valueOf(dados.getVendedores()[pos].getLocal().getCEP())),200);
			valorDataNascimento = new JTextField(10);	
			
			
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorQtdVendas = new JTextField(200);
			valorNumTelefone = new JTextField(200);
			valorCPF = new JTextField(200);
			valorCEP = new JTextField(200);
			valorNumCasa = new JTextField(3);
			valorDataNascimento = new JTextField(10);

			botaoSalvar.setBounds(245, 240, 115, 30);
		}

		labelNome.setBounds(30, 25, 150, 25);
		valorNome.setBounds(180, 25, 180, 25);
		labelQtdVendas.setBounds(30, 50, 150, 25);
		valorQtdVendas.setBounds(180, 50, 180, 25);
		labelNumTelefone.setBounds(30, 75, 180, 25);
		valorNumTelefone.setBounds(180, 75, 180, 25);		
		labelCPF.setBounds(30, 100, 150, 25);
		valorCPF.setBounds(180, 100, 180, 25);
		labelLocalizacao.setBounds(30, 125, 150, 25);
		labelCEP.setBounds(30, 150, 150, 25);
		valorCEP.setBounds(180, 150, 180, 25);
		labelNumCasa.setBounds(30, 175, 150, 25);
		valorNumCasa.setBounds(180, 175, 180, 25);
		labelDataNascimento.setBounds(30, 200, 150, 25);
		valorDataNascimento.setBounds(180, 200, 180, 25);
		
		
		//Coloca os campos relacionados a data de nascimento do cliente
		if (op == 1 || op == 3 ) {
			this.janela.add(labelDataNascimento);
			this.janela.add(valorDataNascimento);

		}
		
		
		//Coloca campos relacionados a quantidade de vendas do vendedor
		if (op == 2 || op == 4) {

			this.janela.add(labelQtdVendas);
			this.janela.add(valorQtdVendas);
		}
		
		
		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 225, 115, 30);
			botaoExcluir.setBounds(245, 225, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelNumTelefone);
		this.janela.add(valorNumTelefone);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelLocalizacao);
		this.janela.add(labelCEP);
		this.janela.add(valorCEP);
		this.janela.add(labelNumCasa);
		this.janela.add(valorNumCasa);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Insere os valores digitados pelo usuário nos clientes e vendedores
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdClientes());
				else if (opcao == 2) // cadastro de novo vendedor
					novoDado[0] = Integer.toString(dados.getQtdVendedores());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorNumTelefone.getText();
				novoDado[3] =  valorCPF.getText();
				novoDado[4] =  valorCEP.getText();
				novoDado[5] =  valorNumCasa.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[6] =  valorDataNascimento.getText();
					res = dados.inserirEditarCliente(novoDado);
				} else {
					novoDado[6] =  valorQtdVendas.getText();
					res = dados.inserirEditarVendedor(novoDado);
				}

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

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui cliente
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
			}
				
			if (opcao == 4){ //exclui vendedor
				res = dados.removerVendedor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoVendedor(); 
			}


			
		}
	}
	
	/**
	 * Mensagem indicando que a exclusão da pessoa foi um sucesso
	 */
	//Mensagens de erro ou sucesso nas ações possíveis
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Mensagem indicando que o cadastro da pessoa foi um sucesso
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem indicando que o cadastro fracassou
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, CEP, Numero da casa e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Mensagem indicando que a exclusão do cliente fracassou
	 */
	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o cliente possui alguma compra.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Mensagem indicando a exclusão do vendedor fracassou
	 */
	public void mensagemErroExclusaoVendedor() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o vendedor possui alguma venda.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
