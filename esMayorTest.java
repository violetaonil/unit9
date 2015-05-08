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
		assertTrue(caTest.esMayor("entornos", "ento") == "ento".compareTo("entornos")>0);
	}

}
