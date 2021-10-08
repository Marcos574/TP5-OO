package negocio;

/**
 * Classe referente às informações do Cliente
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
//Definindo a classe Especificacao
public class Especificacao {
	
	/**
	 * Atributos da classe Especificacao
	 */
	//Atributos da classe Especificacao
	private double peso;
	private String cor;
	private double largura;
	private double altura;
	
	/**
	 * Variáveis da classe Especificacao
	 * @param p peso do eletrodomestico/movel
	 * @param c cor do eletrodomestico/movel
	 * @param l largura do eletrodomestico/movel
	 * @param a altura do eletrodomestico/movel
	 */
	//Construtor da classe Especificacao
	public Especificacao(double p, String c, double l, double a) {
		peso = p;
		cor = c;
		largura = l;
		altura = a;
	}
	
	//Gets e Sets da classe Especificacao
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
