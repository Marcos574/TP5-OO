package controle;
import negocio.*;

/**
 * Controlar as informações ligadas ao Cliente
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class ControleCliente {
	/**
	 * Variáveis da classe ControleCliente
	 */
	//Variáveis da classe ControleCliente
	private Cliente [] c;
	private int qtdClientes;
	
	/**
	 * Puxando as informações do Cliente para a classe do controle das mesmas
	 * @param d puxando os valores da classe ControleDados
	 */
	//Construção do método ControleCliente
	public ControleCliente(ControleDados d) {
		c = d.getClientes();
		qtdClientes = d.getQtdClientes();
	}
	
	
	/**
	 * Método para listar o nome dos clientes cadastrados
	 * @return s nome do cliente desejado
	 */
	//Método para listagem de nome dos clientes
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			s[i] = c[i].getNome();
		}
		
		return s;
	}
	
	
	//Gets e Sets do ControleCliente
	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}

	public String getNome(int i) {		
		return c[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(c[i].getCPF());
		return numCPF;
	}
	
	public int getNumTelefone(int i) {		
		return c[i].getNumTelefone();
	}
	
	public String getDataNascimento(int i) {		
		return c[i].getDataNascimento();
	}
	
	public Localizacao getLocal(int i) {		
		return c[i].getLocal();
	}
	
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	

}
