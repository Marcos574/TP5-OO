package negocio;

/**
 * Classe referente aos dados gerais do código
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */

public class Dados {
	
	/**
	 * Atributos da classe Dados
	 */
	//Declaração das variáveis 
	private Cliente[] clientes = new Cliente[50];
	private int qtdClientes = 0;
	private Vendedor[] vendedores = new Vendedor[50];
	private int qtdVendedores = 0;
	private Movel[] moveis = new Movel[50];
	private int qtdMoveis = 0;
	private Eletrodomestico[] eletrodomesticos = new Eletrodomestico[50];
	private int qtdEletrodomesticos = 0;
	private Localizacao[] locals = new Localizacao[50];
	private int qtdLocals = 0;
	private Especificacao[] especificacoes = new Especificacao[50];
	private int qtdEspecificacoes = 0;
	private Venda[] vendas = new Venda[50];
	private int totalVendas = 0;
	
	/**
	 * Um método para pré-cadastro de 5 dados de cada uma das classes
	 */
	//Dados pré-cadastrados
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			especificacoes[i] = new Especificacao((i+1)*232, "cor"+i, (i+1)*135, (i+1)*246);
			locals[i] = new Localizacao((i+1)*23145231, (i+1)*52);
			clientes[i] = new Cliente("Cliente"+i, (i+1)*1000000, (i+1)*123456, locals[i], "20/10/2000"+i);
			vendedores[i] = new Vendedor("Vendedor"+i, (i+1)*3000000, (i+1)*1238756, locals[i], (i+1)*4);
			moveis[i] = new Movel("Movel"+i, especificacoes[i], (i+1)*100, (i+1)*654, (i+1)*332, "Setor"+i, (i+1)*4, "Material"+i);
			eletrodomesticos[i] = new Eletrodomestico("Eletrodomestico"+i, especificacoes[i], (i+1)*110, (i+1)*624, (i+1)*232, "Setor"+i, (i+1)*5, (i+1)*220);
			vendas[i] = new Venda((i+1)*23142, "Cliente"+i, "Vendedor"+i, "Eletrodomestico"+i, "Movel"+i);			
		}
		
		qtdClientes = 5;
		qtdVendedores = 5;
		qtdMoveis = 5;
		qtdEletrodomesticos = 5;
		qtdLocals = 5;
		qtdEspecificacoes = 5;
		totalVendas = 5;
	}

	//Gets e Sets
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	public void inserirEditarCliente(Cliente c, int pos) {
		this.clientes[pos] = c;
		if(pos == qtdClientes) qtdClientes++;
	}
	


	public Vendedor[] getVendedores() {
		return vendedores;
	}
	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}
	public int getQtdVendedores() {
		return qtdVendedores;
	}
	public void setQtdVendedores(int qtdVendedores) {
		this.qtdVendedores = qtdVendedores;
	}
	
	/**
	 * Método para inserir ou editar um vendedor
	 * @param v variável referente à classe vendedor
	 * @param pos variável para identificar se está editando um vendedor existente
	 *  ou adicionando um novo vendedor
	 */
	public void inserirEditarVendedor(Vendedor v, int pos) {
		this.vendedores[pos] = v;
		if(pos == qtdVendedores) qtdVendedores++;
	}
	


	public Movel[] getMoveis() {
		return moveis;
	}
	public void setMoveis(Movel[] moveis) {
		this.moveis = moveis;
	}
	public int getQtdMoveis() {
		return qtdMoveis;
	}
	public void setQtdMoveis(int qtdMoveis) {
		this.qtdMoveis = qtdMoveis;
	}
	
	/**
	 * Método para inserir ou editar um movel
	 * @param m variável referente à classe movel
	 * @param pos variável para identificar se está editando um movel existente
	 *  ou adicionando um novo movel
	 */
	public void inserirEditarMovel(Movel m, int pos) {
		this.moveis[pos] = m;
		if(pos == qtdMoveis) qtdMoveis++;
	}


	public Eletrodomestico[] getEletrodomesticos() {
		return eletrodomesticos;
	}
	public void setEletrodomesticos(Eletrodomestico[] eletrodomesticos) {
		this.eletrodomesticos = eletrodomesticos;
	}
	public int getQtdEletrodomesticos() {
		return qtdEletrodomesticos;
	}
	public void setQtdEletrodomesticos(int qtdEletrodomesticos) {
		this.qtdEletrodomesticos = qtdEletrodomesticos;
	}
	
	/**
	 * Método para inserir ou editar um eletrodoméstico
	 * @param e variável referente à classe Eletrodoméstico
	 * @param pos variável para identificar se está editando um eletrodoméstico existente
	 *  ou adicionando um novo eletrodoméstico
	 */
	public void inserirEditarEletrodomestico(Eletrodomestico e, int pos) {
		this.eletrodomesticos[pos] = e;
		if(pos == qtdEletrodomesticos) qtdEletrodomesticos++;
	}


	public Localizacao[] getLocals() {
		return locals;
	}
	public void setLocals(Localizacao[] locals) {
		this.locals = locals;
	}
	public int getQtdLocals() {
		return qtdLocals;
	}
	public void setQtdLocals(int qtdLocals) {
		this.qtdLocals = qtdLocals;
	}


	public Especificacao[] getEspecificacoes() {
		return especificacoes;
	}
	public void setEspecificacoes(Especificacao[] especificacoes) {
		this.especificacoes = especificacoes;
	}
	public int getQtdEspecificacoes() {
		return qtdEspecificacoes;
	}
	public void setQtdEspecificacoes(int qtdEspecificacoes) {
		this.qtdEspecificacoes = qtdEspecificacoes;
	}
	
	
	public Venda[] getVendas() {
		return vendas;
	}
	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}
	public int getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	/**
	 * Método para inserir ou editar uma venda
	 * @param vn variável referente à classe venda
	 * @param pos variável para identificar se está editando uma venda existente
	 *  ou adicionando uma nova venda
	 */
	public void inserirEditarVenda(Venda vn, int pos) {
		this.vendas[pos] = vn;
		if(pos == totalVendas) totalVendas++;
	}
	

}
