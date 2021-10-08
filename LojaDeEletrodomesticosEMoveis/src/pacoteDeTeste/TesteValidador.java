package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import negocio.*;

import org.junit.jupiter.api.Test;

/**
 * Testar os métodos da classe validador
 * @author Marcos Vinícius / João Henrique
 * @version 1.0 (Out 2021)
 */
class TesteValidador {
	Validador v = new Validador();
	

/**
 * Testar o método validaNome	
 */
	@Test
	void testValidaNome() {
		assertTrue(v.validaNome("Roger"));
		assertFalse(v.validaNome("142315"));
	}
	
/**
* Testar o método validaCPF	
 */	
	@Test
	void testValidaCPF() {
		assertFalse(v.validaCPF("Claudio"));
		assertTrue(v.validaCPF("2463263"));
	}

	/**
	 * Testar o método validaNumTelefone	
	 */
	@Test
	void testValidaNumTelefone() {
		assertFalse(v.validaCPF("g3wghrw"));
		assertTrue(v.validaCPF("2463265243"));
	}
	
	/**
	 * Testar o método validaIdVenda	
	 */
	@Test
	void testValidaIdVenda() {
		assertFalse(v.validaIdVenda("wrhethyq"));
		assertTrue(v.validaIdVenda("24612413"));
	}
	
	/**
	 * Testar o método validaQtdVendas	
	 */
	@Test
	void testValidaQtdVendas() {
		assertFalse(v.validaIdVenda("sghrwhrw"));
		assertTrue(v.validaIdVenda("24624646"));
	}

}
