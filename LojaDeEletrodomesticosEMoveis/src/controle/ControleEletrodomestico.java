package controle;

import negocio.Eletrodomestico;

/**
 * Controlar os dados ligados ao Eletrodomestico
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
public class ControleEletrodomestico {
	
	/**
	 * Variáveis da classe ControleEletrodomestico
	 */
	//Definindo as variáveis da classe ControleEletrodomestico
	private Eletrodomestico[] e;
	private int qtdEletrodomesticos;
	
	
	/**
	 * Puxando as informações do Eletrodomestico para a classe do controle das mesmas
	 * @param d puxando os valores da classe ControleDados
	 */
	//Construtor da classe ControleEletrodomestico
	public ControleEletrodomestico(ControleDados d) {
		e = d.getEletrodomesticos();
		qtdEletrodomesticos = d.getQtdEletrodomesticos();
	}
	
	/**
	 * Método para listar o nome dos eletrodomesticos cadastrados
	 * @return s nome do eletrodomestico desejado
	 */
	//Método para listagem dos nomes dos eletrodomesticos
	public String[] getNomeEletrodomestico() {
		String[] s = new String[qtdEletrodomesticos];
		for(int i = 0; i < qtdEletrodomesticos; i++) {
			s[i] = e[i].getNome();
		}
		return s;
	}
	
	//Gets e Sets da classe ControleEletrodomestico
	public int getQtd() {
		return qtdEletrodomesticos;
	}

	public void setQtd(int qtd) {
		this.qtdEletrodomesticos = qtd;
	}
	
	public String getNome(int i) {		
		return e[i].getNome();
	}
	
	public int getNumCadastro(int i) {		
		return e[i].getNumCadastro();
	}
	
	public double getPrecoVenda(int i) {		
		return e[i].getPrecoVenda();
	}
	
	public double getCustoAquis(int i) {		
		return e[i].getCustoAquis();
	}
	
	public String getSetor(int i) {
		String setor = String.valueOf(e[i].getSetor());
		return setor;
	}
	
	public int getQtdEstoque(int i) {		
		return e[i].getQtdEstoque();
	}
	
	public int getVoltagem(int i) {		
		return e[i].getVoltagem();
	}
	
	public void setQtdEletrodomesticos(int qtdEletrodomesticos) {
		this.qtdEletrodomesticos = qtdEletrodomesticos;
	}
	

}
