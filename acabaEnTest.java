package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class acabaEnTest {

	@Test
	public void acabaEntest() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.acabaEn("entornos", "nos");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}

}
