package negocio;

/**
* Classe abstract referente às informações da pessoa
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe abstract Pessoa
public abstract class Pessoa {
	
	/**
	 * Atributos da classe abstract Pessoa
	 */
	//Atributos da classe Pessoa
	protected String nome;
	protected int numTelefone;
	protected int CPF;
	protected Localizacao local;
	
	//Gets de sets da classe Pessoa
	public Pessoa() {
		super();
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
	


}
