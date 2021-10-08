package controle;
import negocio.*;

/**
 * Controlar os dados ligados ao Movel
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class ControleMovel {
	
	/**
	 * Variáveis da classe ControleMovel
	 */
	//Definindo as variáveis da classe ControleMovel
	private Movel[] m;
	private int qtdMoveis;

	/**
	 * Puxando as informações do Movel para a classe do controle das mesmas
	 * @param d puxando os valores da classe ControleDados
	 */
	//Construtor da classe ControleMovel
	public ControleMovel(ControleDados d) {
		m = d.getMoveis();
		qtdMoveis = d.getQtdMoveis();
	}
	
	/**
	 * Método para listar o nome dos moveis cadastrados
	 * @return s nome do eletrodomestico desejado
	 */
	//Metodo para listagem dos nomes dos moveis
	public String[] getNomeMovel() {
		String[] s = new String[qtdMoveis];
		for(int i = 0; i < qtdMoveis; i++) {
			s[i] = m[i].getNome();
		}
		return s;
	}
	
	//Gets e Sets da classe ControleMovel
	public int getQtd() {
		return qtdMoveis;
	}

	public void setQtd(int qtd) {
		this.qtdMoveis = qtd;
	}
	
	public String getNome(int i) {		
		return m[i].getNome();
	}
	
	public int getNumCadastro(int i) {		
		return m[i].getNumCadastro();
	}
	
	public Especificacao getEspecificacao(int i) {		
		return m[i].getEspecificacao();
	}
	
	public double getPrecoVenda(int i) {		
		return m[i].getPrecoVenda();
	}
	
	public double getCustoAquis(int i) {		
		return m[i].getCustoAquis();
	}
	
	public String getSetor(int i) {
		String setor = String.valueOf(m[i].getSetor());
		return setor;
	}
	
	public int getQtdEstoque(int i) {		
		return m[i].getQtdEstoque();
	}
	
	public String getMaterial(int i) {
		return m[i].getMaterial();
	}
	
	public void setQtdMoveis(int qtdMoveis) {
		this.qtdMoveis = qtdMoveis;
	}
	
	

}
