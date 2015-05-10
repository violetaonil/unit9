package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Violeta Feliciano
 *
 */

public class ComparaIgnorandoMayusculasTest {

	@Test
	public void ComparaIgnorandoMayustest() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.comparaIgnorandoMayusculas("ENTORNOS", "entornos");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}

}
