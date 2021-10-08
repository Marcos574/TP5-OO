package negocio;

/**
 * Classe referente às informações do Cliente
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

//Definindo a classe Vendedor puxando a herança da classe Pessoa
public class Vendedor extends Pessoa {
	
	/**
	 * Atributos da classe Vendedor
	 */
	//Atributos da classe Vendedor
	private int qtdVendas;
	
	/**
	 * Variáveis da classe Vendedor
	 * @param n nome do vendedor
	 * @param nt numero do telefone do vendedor
	 * @param cpf CPF do vendedor
	 * @param lo Localizacao do vendedor
	 * @param qv quantidade de vendas do vendedor
	 */
	//Contrutor da classe Vendedor
	public Vendedor(String n, int nt, int cpf, Localizacao lo, int qv) {
		this.nome = n;
		this.numTelefone = nt;
		this.CPF = cpf;
		this.local = lo;
		qtdVendas = qv;
	}
	
	//Gets e sets da classe Vendedor
	public String toString() {	
		return "Nome do vendedor: " + nome + "quantidade de vendas: " + qtdVendas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(int numTelefone) {
		this.numTelefone = numTelefone;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	public Localizacao getLocal() {
		return local;
	}

	public void setLocal(Localizacao local) {
		this.local = local;
	}
	
	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}
