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
		assertTrue(caTest.esMenor("entornos", "ento") == "entornos".compareTo("ento")>0);
	}

}
