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
		assertTrue(caTest.esMayor("ENTORNOS", "entornos") == "ENTORNOS".equalsIgnoreCase("entornos"));
	}

}
