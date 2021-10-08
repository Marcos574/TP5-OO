package negocio;

/**
 * Verificar se os dados fornecidos estão no formato esperado
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class Validador {
	
	/**
	 * Verificar se o nome fornecido está no formato correto
	 * @param nome uma string que contém o nome a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o nome é valido
	 */

	public boolean validaNome (String nome) {
		if(nome.matches("[0-9]+")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	/**
	 * Verificar se o CPF fornecido está no formato correto
	 * @param CPF uma string que contém o CPF a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o CPF é valido
	 */

	public boolean validaCPF (String CPF) {
		if(CPF.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Verificar se o numero de telefone fornecido está no formato correto
	 * @param numTelefone uma string que contém o numero de telefone a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o numero de telefone é valido
	 */

	public boolean validaNumTelefone (String numTelefone) {
		if(numTelefone.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verificar se o Id da venda fornecido está no formato correto
	 * @param IdVenda uma string que contém o IdVenda a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o Id da venda é valido
	 */
	
	public boolean validaIdVenda (String IdVenda) {
		if(IdVenda.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verificar se a quantidade de vendas fornecida está no formato correto
	 * @param QtdVendas uma string que contém a quantidade de vendas a ser verificado
	 * @return verdadeiro ou falso, indicamndo se a quantidade de vendas é valida
	 */

	public boolean validaQtdVendas (String QtdVendas) {
		if(QtdVendas.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}

}
