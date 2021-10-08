package negocio;

/**
 * Classe referente �s informa��es do Cliente
 * @author Marcos Vin�cius / Jo�o Henrique
 * @version 1.0 (Out 2021)
 */

//Definindo a classe cliente puxando por uma heran�a da classe abstract Pessoa
public class Cliente extends Pessoa {
	
	/**
	 * Atributos da classe Cliente
	 */
	//Atributos da classe Cliente
	private String dataNascimento;
	
	public Cliente(){
		super();
	}
	
	/**
	 * Vari�veis referentes � classe Cliente
	 * @param n referente ao nome do cliente
	 * @param nt referente ao n�mero de telefone do cliente
	 * @param cpf referente ao CPF do cliente
	 * @param lo referente � localiza��o do cliente
	 * @param dn referente � data de nascimento do cliente
	 */
	//Construtor da classe Cliente
	public Cliente(String n, int nt, int cpf, Localizacao lo, String dn) {
		this.nome = n;
		this.numTelefone = nt;
		this.CPF = cpf;
		this.local = lo;
		dataNascimento = dn;
	}
	
	//Gets e Sets da classe cliente
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * Caso soliciado, essa � a sa�da para teste da classe
	 */
	//Sobrecarga da classe Cliente
	@Override
	public String toString() {
		return "Cliente: " + nome  + " | "+ local + ", nascido no dia : " + dataNascimento;
	}

}
