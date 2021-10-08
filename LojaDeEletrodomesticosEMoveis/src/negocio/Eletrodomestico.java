package negocio;

/**
* Classe referente �s informa��es do Eletrodomestico
* @author Marcos Vin�cius / Jo�o Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe Eletrodomestico puxando por uma heran�a da classe abstract Produto
public class Eletrodomestico extends Produto {
	
	/**
	 * Atributos da classe Eletrodomestico
	 */
	//Atributos da classe Eletrodomestico
	private int voltagem;	
	
	/**
	 * Vari�veis referentes � classe Eletrodomestico
	 * @param n nome do eletrodomestico
	 * @param es especifica��es do eletrodomestico
	 * @param nc numero de cadastro do eletrodom�stico
	 * @param pv pre�o de venda do eletrodom�stico
	 * @param ca custo de aquisi��o do eletrodom�stico
	 * @param s setor do eletrodom�stico
	 * @param qe quantidade em estoque do eletrodom�stico
	 * @param v voltagem do eletrodom�stico
	 */
	//Construtor da classe Eletrodomestico
	public Eletrodomestico(String n, Especificacao es, int nc, double pv, double ca, String s, int qe, int v) {
		this.nome = n;
		this.especificacao = es;
		this.numCadastro = nc;
		this.precoVenda = pv;
		this.custoAquis = ca;
		this.setor = s;
		this.qtdEstoque = qe;
		this.voltagem = v;
	}

	//Gets e Sets da classe Eletrodomestico
	public Especificacao getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(Especificacao especificacao) {
		this.especificacao = especificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCadastro() {
		return numCadastro;
	}

	public void setNumCadastro(int numCadastro) {
		this.numCadastro = numCadastro;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getCustoAquis() {
		return custoAquis;
	}

	public void setCustoAquis(double custoAquis) {
		this.custoAquis = custoAquis;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}


	public int getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	/**
	 * Caso soliciado, essa � a sa�da para teste da classe
	 */
	//Sobrecarga da classe Eletrodomestico
	@Override
	public String toString() {
		return "Produto : " + nome + " no valor de R$:" + precoVenda;
	}
	

}
