package view;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Classe referente às informações que irão aparecer da tela do usuário
 * ao selecionar Movel/Eletrodomestico
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class TelaDetalheProduto implements ActionListener {
	
	/**
	 * Declaração das variáveis da classe TelaDetalheProduto
	 */
	//Declaração de variáveis
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEspecificacao = new JLabel("Especificações : ");
	private JLabel labelPeso = new JLabel("Peso : ");
	private JTextField valorPeso;
	private JLabel labelCor = new JLabel("Cor : ");
	private JTextField valorCor;
	private JLabel labelLargura = new JLabel("Largura : ");
	private JTextField valorLargura;
	private JLabel labelAltura = new JLabel("Altura : ");
	private JTextField valorAltura;
	private JLabel labelNumCadastro = new JLabel("Número de cadastro: ");
	private JTextField valorNumCadastro;
	private JLabel labelPrecoVenda = new JLabel("Preço de venda: ");
	private JTextField valorPrecoVenda;
	private JLabel labelCustoAquis = new JLabel("Custo de aquisição: ");
	private JTextField valorCustoAquis;
	private JLabel labelSetor = new JLabel("Setor: ");
	private JTextField valorSetor;
	private JLabel labelQtdEstoque = new JLabel("Estoque: ");
	private JTextField valorQtdEstoque;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	private JLabel labelVoltagem = new JLabel("Voltagem: ");
	private JTextField valorVoltagem;
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[12];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Método para inserir ou editar produtos
	 * @param op opcao escolhida pelo usuário
	 * @param d Dados referentes aos produtos ja existentes
	 * @param p Dados necessarios da classe ControleDados
	 * @param pos Posição do produto
	 */
	//Puxando o metodo para inserir ou editar os produtos
	public void inserirEditarP(int op, ControleDados d, 
			TelaProduto p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;
		
		if (op == 1) s = "Cadastro de Movel";
		if (op == 2) s = "Cadastro de Eletrodomestico";
		if (op == 3) s = "Detalhe de Movel";
		if (op == 4) s = "Detalhe de Eletrodomestico";

		janela = new JFrame(s);
		
		
		//Preenche dados com dados do movel clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getMoveis()[pos].getNome(), 200);
			valorPeso = new JTextField(String.valueOf(dados.getMoveis()[pos].getEspecificacao().getPeso()),200);
			valorCor = new JTextField(dados.getMoveis()[pos].getEspecificacao().getCor(), 200);
			valorLargura = new JTextField(String.valueOf(dados.getMoveis()[pos].getEspecificacao().getLargura()), 200);
			valorAltura= new JTextField(String.valueOf(dados.getMoveis()[pos].getEspecificacao().getAltura()), 200);
			valorNumCadastro = new JTextField(String.valueOf(dados.getMoveis()[pos].getNumCadastro()), 200);
			valorPrecoVenda = new JTextField(String.valueOf(dados.getMoveis()[pos].getPrecoVenda()), 200);
			valorCustoAquis = new JTextField(String.valueOf(dados.getMoveis()[pos].getCustoAquis()), 200);
			valorSetor = new JTextField(dados.getMoveis()[pos].getSetor(), 200);
			valorQtdEstoque = new JTextField(String.valueOf(dados.getMoveis()[pos].getQtdEstoque()), 200);
			valorMaterial = new JTextField(dados.getMoveis()[pos].getMaterial(), 200);
			valorVoltagem = new JTextField(200);
			
			
		} else if (op == 4) { //Preenche dados com dados do eletrodomestico clicado 
			valorNome = new JTextField(dados.getEletrodomesticos()[pos].getNome(), 200);
			valorPeso = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getEspecificacao().getPeso()),200);
			valorCor = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getEspecificacao().getCor()),200);
			valorLargura = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getEspecificacao().getPeso()),200);
			valorAltura = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getEspecificacao().getPeso()),200);
			valorNumCadastro = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getNumCadastro()), 200);
			valorPrecoVenda = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getPrecoVenda()), 200);
			valorCustoAquis = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getNumCadastro()), 200);
			valorSetor = new JTextField(dados.getEletrodomesticos()[pos].getSetor(), 200);
			valorQtdEstoque = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getQtdEstoque()), 200);
			valorVoltagem = new JTextField(String.valueOf(dados.getEletrodomesticos()[pos].getVoltagem()), 200);
			valorMaterial = new JTextField(200);
			
			
			
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorPeso = new JTextField(200);
			valorCor = new JTextField(200);
			valorLargura = new JTextField(200);
			valorAltura = new JTextField(200);
			valorNumCadastro = new JTextField(100);
			valorPrecoVenda = new JTextField(2000);
			valorCustoAquis = new JTextField(200);
			valorSetor = new JTextField(200);
			valorQtdEstoque = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorVoltagem = new JTextField(200);

			botaoSalvar.setBounds(245, 420, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEspecificacao.setBounds(30, 50, 150, 25);
		labelPeso.setBounds(30, 80, 150, 25);
		valorPeso.setBounds(180, 80, 180, 25);
		labelCor.setBounds(30, 110, 150, 25);
		valorCor.setBounds(180, 110, 180, 25);
		labelLargura.setBounds(30, 140, 150, 25);
		valorLargura.setBounds(180, 140, 180, 25);
		labelAltura.setBounds(30, 170, 150, 25);
		valorAltura.setBounds(180, 170, 180, 25);
		labelNumCadastro.setBounds(30, 200, 150, 25);
		valorNumCadastro.setBounds(180, 200, 180, 25);		
		labelPrecoVenda.setBounds(30, 230, 150, 25);
		valorPrecoVenda.setBounds(180, 230, 180, 25);
		labelCustoAquis.setBounds(30, 260, 150, 25);
		valorCustoAquis.setBounds(180, 260, 180, 25);
		labelSetor.setBounds(30, 290, 150, 25);
		valorSetor.setBounds(180, 290, 180, 25);
		labelQtdEstoque.setBounds(30, 320, 150, 25);
		valorQtdEstoque.setBounds(180, 320, 180, 25);
		labelMaterial.setBounds(30, 350, 150, 25);
		valorMaterial.setBounds(180, 350, 180, 25);
		labelVoltagem.setBounds(30, 380, 150, 25);
		valorVoltagem.setBounds(180, 380, 180, 25);
		
		
		
		//Coloca os campos relacionados ao material do movel
		if (op == 1 || op == 3 ) {
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);

		}
		
		
		//Coloca campos relacionados a voltagem do eletrodomestico
		if (op == 2 || op == 4) {

			this.janela.add(labelVoltagem);
			this.janela.add(valorVoltagem);
		}
		
		
		//Coloca botao salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 420, 115, 30);
			
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEspecificacao);
		this.janela.add(labelPeso);
		this.janela.add(valorPeso);
		this.janela.add(labelCor);
		this.janela.add(valorCor);
		this.janela.add(labelLargura);
		this.janela.add(valorLargura);
		this.janela.add(labelAltura);
		this.janela.add(valorAltura);
		this.janela.add(labelNumCadastro);
		this.janela.add(valorNumCadastro);
		this.janela.add(labelPrecoVenda);
		this.janela.add(valorPrecoVenda);
		this.janela.add(labelCustoAquis);
		this.janela.add(valorCustoAquis);
		this.janela.add(labelSetor);
		this.janela.add(valorSetor);
		this.janela.add(labelQtdEstoque);
		this.janela.add(valorQtdEstoque);
		
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(500, 500);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
	}

	/**
	 * Insere os valores digitados pelo usuário nos moveis ou eletrodomesticos
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo movel
					novoDado[0] = Integer.toString(dados.getQtdMoveis());
				else if (opcao == 2) // cadastro de novo eletrodomestico
					novoDado[0] = Integer.toString(dados.getQtdEletrodomesticos());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorPeso.getText();
				novoDado[3] =  valorCor.getText();
				novoDado[4] =  valorLargura.getText();
				novoDado[5] =  valorAltura.getText();
				novoDado[6] =  valorNumCadastro.getText();
				novoDado[7] =  valorPrecoVenda.getText();
				novoDado[8] =  valorCustoAquis.getText();
				novoDado[9] =  valorSetor.getText();
				novoDado[10] =  valorQtdEstoque.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[11] =  valorMaterial.getText();
					res = dados.inserirEditarMovel(novoDado);
				} else {
					novoDado[11] =  valorVoltagem.getText();
					res = dados.inserirEditarEletrodomestico(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} 
		}

	}
	
	/**
	 * Mensagem indicando que o cadastro do produto foi um sucesso
	 */
	//Mensagens de erro ou sucesso nas ações possíveis
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem indicando que o cadastro do produto fracassou 
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Peso, largura, altura, numero de cadastro, "
				+ "preço de venda, custo de aquisição e quantidade em estoque não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}


}