package controle;

import negocio.*;

/**
 * Controlar os dados que possuem alguma ligação entre si
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class ControleDados {
	
	private Dados d = new Dados(); 
	
	/**
	 * Preencher a variável d com os dados pré cadastrados
	 */
	//Preencehendo com 5 dados de pré cadastro
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	
	//Gets de sets da classe ControleDados
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Cliente[] getClientes() {
		return this.d.getClientes();
	}
	
	public int getQtdClientes() {
		return this.d.getQtdClientes();
	}
	
	
	public Vendedor[] getVendedores() {
		return this.d.getVendedores();
	}
	
	public int getQtdVendedores() {
		return this.d.getQtdVendedores();
	}
	
	public Movel[] getMoveis() {
		return this.d.getMoveis();
	}
	
	public int getQtdMoveis() {
		return this.d.getQtdMoveis();
	}
	
	public Eletrodomestico[] getEletrodomesticos() {
		return this.d.getEletrodomesticos();
	}
	
	public int getQtdEletrodomesticos() {
		return this.d.getQtdEletrodomesticos();
	}
	
	public Venda[] getVendas() {
		return this.d.getVendas();
	}
	
	public int getTotalVendas() {
		return this.d.getTotalVendas();
	}
	
	/**
	 * Método para inserir ou editar clientes e verificar se os dados estão no formato correto
	 * @param dadosClientes o cliente que foi inserido ou editado
	 * @return verdadeiro ou falso, dependendo se os dados inseridos estão corretos ou não
	 */
	//Verificando se o usuário preencheu todos os dados de "cliente" corretamente
	public boolean inserirEditarCliente(String[] dadosClientes) {
		if(!dadosClientes[2].matches("[0-9]+") || !dadosClientes[3].matches("[0-9]+") || !dadosClientes[4].matches("[0-9]+")) {
			return false;
		} else {
				Cliente c = new Cliente(dadosClientes[1], Integer.parseInt(dadosClientes[2]), 
						Integer.parseInt(dadosClientes[3]), new Localizacao(getClientes()[4].getLocal().getCEP(), getClientes()[4].getLocal().getNumcasa()),
						dadosClientes[5]);
				d.inserirEditarCliente(c, Integer.parseInt(dadosClientes[0]));
				return true;
		}
	}
	
	/**
	 * Método para inserir ou editar vendedores e verificar se os dados estão no formato correto
	 * @param dadosVendedores o vendedor que foi inserido ou editado
	 * @return verdadeiro ou falso, dependendo se os dados inseridos estão corretos ou não
	 */
	//Verificando se o usuário preencheu todos os dados de "vendedor" corretamente
	public boolean inserirEditarVendedor(String[] dadosVendedores) {
		if(!dadosVendedores[2].matches("[0-9]+") || !dadosVendedores[3].matches("[0-9]+") || !dadosVendedores[4].matches("[0-9]+")) {
			return false;
		} else {
				Vendedor v = new Vendedor(dadosVendedores[1], Integer.parseInt(dadosVendedores[2]), 
						Integer.parseInt(dadosVendedores[3]), new Localizacao(getVendedores()[4].getLocal().getCEP(),
								getVendedores()[4].getLocal().getNumcasa()),
						Integer.parseInt(dadosVendedores[5]));
				d.inserirEditarVendedor(v, Integer.parseInt(dadosVendedores[0]));
				return true;
		}
	}
	
	/**
	 * Método para inserir ou editar moveis e verificar se os dados estão no formato correto
	 * @param dadosMoveis o movel que foi inserido ou editado
	 * @return verdadeiro ou falso, dependendo se os dados inseridos estão corretos ou não
	 */
	//Verificando se o usuário preencheu todos os dados de "movel" corretamente
	public boolean inserirEditarMovel(String[] dadosMoveis) {
		if(!dadosMoveis[3].matches("[0-9]+")) {
	
			return false;
		} else {
				Movel m = new Movel(dadosMoveis[1], new Especificacao(getMoveis()[2].getEspecificacao().getPeso(),
						getMoveis()[2].getEspecificacao().getCor(), getMoveis()[2].getEspecificacao().getLargura(), 
						getMoveis()[2].getEspecificacao().getAltura()), Integer.parseInt(dadosMoveis[3]), 
						Integer.parseInt(dadosMoveis[4]), Integer.parseInt(dadosMoveis[5]),
						dadosMoveis[6], Integer.parseInt(dadosMoveis[7]), dadosMoveis[8]);
				d.inserirEditarMovel(m, Integer.parseInt(dadosMoveis[0]));
				return true;
		}
	}
	
	/**
	 * Método para inserir ou editar eletrodomesticos e verificar se os dados estão no formato correto
	 * @param dadosEletrodomesticos o eletrodomestico que foi inserido ou editado
	 * @return verdadeiro ou falso, dependendo se os dados inseridos estão corretos ou não
	 */
	//Verificando se o usuário preencheu todos os dados de "eletrodomestico" corretamente
	public boolean inserirEditarEletrodomestico(String[] dadosEletrodomesticos) {
		if(!dadosEletrodomesticos[3].matches("[0-9]+") || !dadosEletrodomesticos[4].matches("[0-9]+") || !dadosEletrodomesticos[5].matches("[0-9]+") 
		|| !dadosEletrodomesticos[7].matches("[0-9]+") || !dadosEletrodomesticos[8].matches("[0-9]+")) {
			return false;
		} else {
				Eletrodomestico e = new Eletrodomestico(dadosEletrodomesticos[1],new Especificacao(getEletrodomesticos()[2].getEspecificacao().getPeso(),
						getEletrodomesticos()[2].getEspecificacao().getCor(), getEletrodomesticos()[2].getEspecificacao().getLargura(), 
						getEletrodomesticos()[2].getEspecificacao().getAltura()) ,Integer.parseInt(dadosEletrodomesticos[3]), 
						Integer.parseInt(dadosEletrodomesticos[4]), Integer.parseInt(dadosEletrodomesticos[5]),
						dadosEletrodomesticos[6], Integer.parseInt(dadosEletrodomesticos[7]), Integer.parseInt(dadosEletrodomesticos[8]));
				d.inserirEditarEletrodomestico(e, Integer.parseInt(dadosEletrodomesticos[0]));
				return true;
		}
	}
	
	/**
	 * Método para inserir ou editar vendas e verificar se os dados estão no formato correto
	 * @param dadosVendas a venda que foi inserida ou editada
	 * @return verdadeiro ou falso, dependendo se os dados inseridos estão corretos ou não
	 */
	public boolean inserirEditarVenda(String[] dadosVendas) {
		
		if(!dadosVendas[1].matches("[0-9]+")) {
			return false;
		} else {
				Venda vn = new Venda(Integer.parseInt(dadosVendas[1]), dadosVendas[2], dadosVendas[3],
				dadosVendas[4], dadosVendas[5]);
				d.inserirEditarVenda(vn, Integer.parseInt(dadosVendas[0]));
				return true;
		}
	}
	
	/**
	 * Método para remover clientes 
	 * @param i o cliente que foi removido
	 * @return verdadeiro ou falso, dependendo se a remoção foi um sucesso ou não
	 */
	//Função para remover cliente
	public boolean removerCliente(int i) {
		int qtdVen = d.getTotalVendas();
		String clienteRemovido = d.getClientes()[i].getNome();
		String aux;
		for (int j = 0; j < qtdVen; j++) { 
			aux = d.getClientes()[j].getNome();
			if(clienteRemovido.compareTo(aux) == 0) 
				return false; //não é possível remover o cliente, pois ele já possui alguma compra cadastrada
		}
		
		if(i == (d.getQtdClientes() - 1)) { // O cliente a ser removido está no final do array
			d.setQtdClientes(d.getQtdClientes() - 1);
			d.getClientes()[d.getQtdClientes()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getClientes()[cont].getNome().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdClientes() - 1; j++) {
				d.getClientes()[j] = null;
				d.getClientes()[j] = d.getClientes()[j+1];
			}
			d.getClientes()[d.getQtdClientes()] = null;
			d.setQtdClientes(d.getQtdClientes() - 1);
			return true;
		}
	}
	
	/**
	 * Método para remover vendedores 
	 * @param i o vendedor que foi removido
	 * @return verdadeiro ou falso, dependendo se a remoção foi um sucesso ou não
	 */
	//Função para remover vendedor
	public boolean removerVendedor(int i) {
		int qtdVen = d.getTotalVendas();
		String vendedorRemovido = d.getVendedores()[i].getNome();
		String aux;
		for (int j = 0; j < qtdVen; j++) { 
			aux = d.getVendedores()[j].getNome();
			if(vendedorRemovido.compareTo(aux) == 0) 
				return false; //não é possível remover o vendedor, pois ele já possui alguma venda cadastrada
		}
		
		if(i == (d.getQtdVendedores() - 1)) { // O vendedor a ser removido está no final do array
			d.setQtdVendedores(d.getQtdVendedores() - 1);
			d.getVendedores()[d.getQtdVendedores()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getVendedores()[cont].getNome().compareTo(vendedorRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdVendedores() - 1; j++) {
				d.getVendedores()[j] = null;
				d.getVendedores()[j] = d.getVendedores()[j+1];
			}
			d.getVendedores()[d.getQtdVendedores()] = null;
			d.setQtdVendedores(d.getQtdVendedores() - 1);
			return true;
		}
	}
	
}
