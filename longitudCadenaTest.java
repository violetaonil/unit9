package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class longitudCadenaTest {

	@Test
	public void longitudCadenatest() {
		CadenasAlumno caTest = new CadenasAlumno();
		long resultado_real = caTest.longitudCadena("ENTORNOS");
		long resultado_esperado = 8;
		assertEquals(resultado_esperado, resultado_real);
	}

}
