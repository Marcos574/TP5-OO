package negocio;

/**
* Classe referente às informações do Eletrodomestico
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe Eletrodomestico puxando por uma herança da classe abstract Produto
public class Eletrodomestico extends Produto {
	
	/**
	 * Atributos da classe Eletrodomestico
	 */
	//Atributos da classe Eletrodomestico
	private int voltagem;	
	
	/**
	 * Variáveis referentes à classe Eletrodomestico
	 * @param n nome do eletrodomestico
	 * @param es especificações do eletrodomestico
	 * @param nc numero de cadastro do eletrodoméstico
	 * @param pv preço de venda do eletrodoméstico
	 * @param ca custo de aquisição do eletrodoméstico
	 * @param s setor do eletrodoméstico
	 * @param qe quantidade em estoque do eletrodoméstico
	 * @param v voltagem do eletrodoméstico
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
	 * Caso soliciado, essa é a saída para teste da classe
	 */
	//Sobrecarga da classe Eletrodomestico
	@Override
	public String toString() {
		return "Produto : " + nome + " no valor de R$:" + precoVenda;
	}
	

}
