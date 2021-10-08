package negocio;

/**
* Classe abstract referente às informações do produto
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe abstract Produto
public abstract class Produto {
	
	/**
	 * Atributos referentes à classe abstract produto
	 */
	//Atributos da classe Produto
	protected Especificacao especificacao;
	protected String nome;
	protected int numCadastro;
	protected double precoVenda;
	protected double custoAquis;
	protected String setor;
	protected int qtdEstoque;

	
	//Gets e Sets da classe Produto
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
	
	
}
