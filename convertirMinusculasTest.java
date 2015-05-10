package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class convertirMinusculasTest {

	@Test
	public void convertirMinusculastest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.convertirMinusculas("ENTORNOS");
		String resultado_esperado = "entornos";
		assertEquals(resultado_esperado, resultado_real);
	}

}
