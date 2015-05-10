package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Violeta Feliciano
 *
 */

public class esMayorTest {

	@Test
	public void esMayortest() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.esMayor("ENTORNOS", "ento");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}

}
