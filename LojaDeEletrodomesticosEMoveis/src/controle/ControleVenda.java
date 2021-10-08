package controle;

import negocio.*;

/**
 * Controlar as informações ligadas à venda
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class ControleVenda  {
	
	/**
	 * Variáveis da classe ControleVenda
	 */
	//Declaração de variaveis da classe ControleVenda
	private Venda [] v;
	private int totalVendas;
	
	/**
	 * Puxando as informações da venda para a classe do controle das mesmas
	 * @param d puxando os valores da classe ControleDados
	 */
	//Construtor da classe ControleVenda
	public ControleVenda(ControleDados d) {
		v = d.getVendas();
		totalVendas = d.getTotalVendas();
	}
	
	/**
	 * Método para listar os Ids das vendas cadastradas
	 * @return s nome da venda desejada
	 */
	//Metodo para listagem dos IDs das vendas
	public String[] getIdVenda() {
		String[] s = new String[totalVendas];
		for(int i = 0; i < totalVendas; i++) {
			s[i] = String.valueOf(v[i].getIdVenda());
		}
		
		return s;
	}
	
	/**
	 * Método para calcular o lucro estimado da loja 
	 * @param d dados das vendas realizadas
	 * @return previsaoLucro a previsão do lucro da loja baseado em seu estoque
	 */
	//Metodo para calcular o lucro estimado da loja
	public double lucroEstimado (ControleDados d) {
		double previsaoLucro = 0;
		double custo = 0, venda = 0;
		
		for(int i = 0; i < d.getQtdMoveis(); i++) {
			custo = (d.getMoveis()[i].getCustoAquis()*d.getMoveis()[i].getQtdEstoque()) + custo;
			venda = (d.getMoveis()[i].getPrecoVenda()*d.getMoveis()[i].getQtdEstoque()) + venda;
		}
		
		
		for(int i = 0; i < d.getQtdEletrodomesticos(); i++) {
			custo = (d.getEletrodomesticos()[i].getCustoAquis()*d.getEletrodomesticos()[i].getQtdEstoque()) + custo;
			venda = (d.getEletrodomesticos()[i].getPrecoVenda()*d.getEletrodomesticos()[i].getQtdEstoque()) + venda;
		}
		
		previsaoLucro = venda - custo;
		
		return previsaoLucro;
	}
	
	
	
	//Gets e Sets da classe ControleVenda
	

	public int getTotalVendas() {
		return totalVendas;
	}

	public Venda[] getV() {
		return v;
	}

	public void setV(Venda[] v) {
		this.v = v;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
}
