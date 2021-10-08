package negocio;

/**
 * Verificar se os dados fornecidos est�o no formato esperado
 * @author Marcos Vin�cius / Jo�o Henrique
 * @version 1.0 (Out 2021)
 */

public class Validador {
	
	/**
	 * Verificar se o nome fornecido est� no formato correto
	 * @param nome uma string que cont�m o nome a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o nome � valido
	 */

	public boolean validaNome (String nome) {
		if(nome.matches("[0-9]+")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	/**
	 * Verificar se o CPF fornecido est� no formato correto
	 * @param CPF uma string que cont�m o CPF a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o CPF � valido
	 */

	public boolean validaCPF (String CPF) {
		if(CPF.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Verificar se o numero de telefone fornecido est� no formato correto
	 * @param numTelefone uma string que cont�m o numero de telefone a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o numero de telefone � valido
	 */

	public boolean validaNumTelefone (String numTelefone) {
		if(numTelefone.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verificar se o Id da venda fornecido est� no formato correto
	 * @param IdVenda uma string que cont�m o IdVenda a ser verificado
	 * @return verdadeiro ou falso, indicamndo se o Id da venda � valido
	 */
	
	public boolean validaIdVenda (String IdVenda) {
		if(IdVenda.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verificar se a quantidade de vendas fornecida est� no formato correto
	 * @param QtdVendas uma string que cont�m a quantidade de vendas a ser verificado
	 * @return verdadeiro ou falso, indicamndo se a quantidade de vendas � valida
	 */

	public boolean validaQtdVendas (String QtdVendas) {
		if(QtdVendas.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}

}
