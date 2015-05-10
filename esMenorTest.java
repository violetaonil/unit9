package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Violeta Feliciano
 *
 */

public class esMenorTest {

	@Test
	public void esMenortest() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.esMenor("ENTORNOS", "ento");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}

}
