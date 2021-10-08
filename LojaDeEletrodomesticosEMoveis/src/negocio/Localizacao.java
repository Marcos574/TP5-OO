package negocio;

/**
* Classe referente às informações da Localizacao
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe Localizacao
public class Localizacao {
	
	/**
	 * Atributos da classe Localizacao
	 */
	//Atributos da classe Localizacao
	private int CEP;
	private int numCasa;
	
	/**
	 * Variáveis referentes à classe Localizacao
	 * @param cep CEP do cliente/vendedor
	 * @param nc Numero da casa do cliente/vendedor
	 */
	//Construtor da classe Localizacao
	public Localizacao(int cep, int nc) {
		CEP = cep;
		numCasa = nc;
	}
	
	public Localizacao() {
		
	}
	
	//Gets e sets da classe Localizacao
	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	
	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public int getNumcasa() {
		return numCasa;
	}

	public void setNumcasa(int numcasa) {
		this.numCasa = numcasa;
	}

	/**
	 * Caso soliciado, essa é a saída para teste da classe
	 */
	//Sobrecarga da classe Localizacao
	@Override
	public String toString() {
		return  "Reside no CEP: " + CEP + ", casa: " + numCasa ;
	}
	
	
}
