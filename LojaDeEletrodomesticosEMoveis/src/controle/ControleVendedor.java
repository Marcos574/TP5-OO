package controle;
import negocio.*;

/**
 * Controlar as informações ligadas ao Vendedor
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class ControleVendedor {
	/**
	 * Variáveis da classe ControleVendedor
	 */
	//Declaração de variáveis da classe ControleVendedor
	private Vendedor [] v;
	private int qtdVendedores;
	
	/**
	 * Puxando as informações do Vendedor para a classe do controle das mesmas
	 * @param d puxando os valores da classe ControleDados
	 */
	//Contrutor da classe ControleVendedor
	public ControleVendedor(ControleDados d) {
		v = d.getVendedores();
		qtdVendedores = d.getQtdVendedores();
	}
	
	/**
	 * Método para listar o nome dos vendedores cadastrados
	 * @return s nome do vendedor desejado
	 */
	//Metodo para a listagem dos nomes dos vendedores
	public String[] getNomeVendedor() {
		String[] s = new String[qtdVendedores];
		for(int i = 0; i < qtdVendedores; i++) {
			s[i] = v[i].getNome();
		}
		
		return s;
	}
	
	//Gets e Sets da classe ControleVendedor
	public int getQtd() {
		return qtdVendedores;
	}

	public void setQtd(int qtd) {
		this.qtdVendedores = qtd;
	}

	public String getNome(int i) {		
		return v[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(v[i].getCPF());
		return numCPF;
	}
	
	public int getNumTelefone(int i) {		
		return v[i].getNumTelefone();
	}
	
	public int getQtdVendas(int i) {		
		return v[i].getQtdVendas();
	}
	
	public void setQtdVendedores(int qtdVendedores) {
		this.qtdVendedores = qtdVendedores;
	}
	

	
}
