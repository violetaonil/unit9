package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class posicionPrimeraCadenaTest {

	@Test
	public void posicionPrimeraCadenatest() {
		CadenasAlumno caTest = new CadenasAlumno();
		long resultado_real = caTest.posicionPrimeraCadena("ENTORNOS", "OR");
		long resultado_esperado = 3;
		assertEquals(resultado_esperado, resultado_real);
	}

}
