package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import negocio.*;

import org.junit.jupiter.api.Test;

/**
 * Testar os m�todos da classe validador
 * @author Marcos Vin�cius / Jo�o Henrique
 * @version 1.0 (Out 2021)
 */
class TesteValidador {
	Validador v = new Validador();
	

/**
 * Testar o m�todo validaNome	
 */
	@Test
	void testValidaNome() {
		assertTrue(v.validaNome("Roger"));
		assertFalse(v.validaNome("142315"));
	}
	
/**
* Testar o m�todo validaCPF	
 */	
	@Test
	void testValidaCPF() {
		assertFalse(v.validaCPF("Claudio"));
		assertTrue(v.validaCPF("2463263"));
	}

	/**
	 * Testar o m�todo validaNumTelefone	
	 */
	@Test
	void testValidaNumTelefone() {
		assertFalse(v.validaCPF("g3wghrw"));
		assertTrue(v.validaCPF("2463265243"));
	}
	
	/**
	 * Testar o m�todo validaIdVenda	
	 */
	@Test
	void testValidaIdVenda() {
		assertFalse(v.validaIdVenda("wrhethyq"));
		assertTrue(v.validaIdVenda("24612413"));
	}
	
	/**
	 * Testar o m�todo validaQtdVendas	
	 */
	@Test
	void testValidaQtdVendas() {
		assertFalse(v.validaIdVenda("sghrwhrw"));
		assertTrue(v.validaIdVenda("24624646"));
	}

}
