package negocio;

/**
* Classe referente às informações do Movel
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe Movel puxando por uma herança da classe abstract Produto
public class Movel extends Produto {
	
	/**
	 * Atributos da classe Movel
	 */
	//Atributos da classe Movel
	private String material;
	
	/**
	 * Variáveis referentes à classe Movel
	 * @param n nome do movel
	 * @param es especificações do movel
	 * @param nc numero de cadastro do movel
	 * @param pv preço de venda do movel
	 * @param ca custo de aquisicao do movel
	 * @param s setor do movel
	 * @param qe quantidade em estoque do movel
	 * @param m material do movel
	 */
	//Construtor da classe Movel
	public Movel(String n, Especificacao es, int nc, double pv, double ca, String s, int qe, String m) {
		this.nome = n;
		this.especificacao = es;
		this.numCadastro = nc;
		this.precoVenda = pv;
		this.custoAquis = ca;
		this.setor = s;
		this.qtdEstoque = qe;
		this.material = m;
	}
	
	//Gets e Sets da classe Movel
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	/**
	 * Caso soliciado, essa é a saída para teste da classe
	 */
	//Sobrecarga da classe Movel
	@Override
	public String toString() {
		return "Produto : " + nome + " no valor de R$" + precoVenda;
	}
	
}
