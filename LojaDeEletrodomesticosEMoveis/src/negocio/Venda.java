package negocio;

/**
* Classe referente às informações da Venda
* @author Marcos Vinícius / João Henrique
* @version 1.0 (Out 2021)
*/
//Definindo a classe Venda
public class Venda {
	
	/**
	 * Atributos da classe Venda
	 */
	//Atributos da classe Venda
	private String eletroComprados;
	private String movelComprados;
	private String vendedor;
	private String cliente;
	private int idVenda;

	/**
	 * Variáveis da classe Venda
	 * @param iv variavel referente ao Id da venda
	 * @param c variavel referente ao nome do cliente da venda
	 * @param v variavel referente ao nome do vendedor da venda
	 * @param el variavel referente ao nome do eletrodomestico da venda
	 * @param mo variavel referente ao nome do movel da venda
	 */
	//Construtores da classe Venda
	public Venda(int iv, String c, String v, String el, String mo) {
		idVenda = iv;
		cliente = c;
		vendedor = v;
		eletroComprados = el;
		movelComprados = mo;

	}
	
	//gets e sets da classe Venda
	
	public int getIdVenda() {
		return idVenda;
	}

	
	public String getEletroComprados() {
		return eletroComprados;
	}

	public void setEletroComprados(String eletroComprados) {
		this.eletroComprados = eletroComprados;
	}

	public String getMovelComprados() {
		return movelComprados;
	}

	public void setMovelComprados(String movelComprados) {
		this.movelComprados = movelComprados;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	
	/**
	 * Método para mostrar a última venda de eletrodomesticos
	 * @return saida nome do ultimo eletrodomestico comprado
	 */
	//Método para mostrar a última venda de eletrodomesticos
	public String consultareletroComprados() {
		String saida = "***** Lista de eletrodomesticos vendidos ***** " ;
		saida = saida + "\n"+ eletroComprados.toString();
		return saida;
	}	
	
	/**
	 * Método para mostrar a última venda de movel
	 * @return saida nome do ultimo movel comprado
	 */
	//Método para mostrar a ultima venda de moveis
	public String consultarmovelComprados() {
		String saida2 = "***** Lista de moveis vendidos ***** " ;
		saida2 = saida2 + "\n"+ movelComprados.toString();
		return saida2;
	}
	
	/**
	 * Caso soliciado, essa é a saída para teste da classe
	 */
	//Sobrecarga da classe Venda
	@Override
	public String toString() {
		return "Vendas -> " + vendedor + "| " + cliente + "\n idVenda: "
				+ idVenda +" -> " + eletroComprados+ " | "+ movelComprados;
	}	
	
	
}
