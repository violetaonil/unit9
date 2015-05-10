package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class convertirMayusculasTest {

	@Test
	public void convertirMayusculastest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.convertirMayusculas("entornos");
		String resultado_esperado = "ENTORNOS";
		assertEquals(resultado_esperado, resultado_real);
	}

}
