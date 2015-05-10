package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatenaCadenasTest {

	@Test
	public void concatenaCadenastest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.concatenaCadenas("Violeta", "Feliciano");
		String resultado_esperado = "Violeta Feliciano";			
		assertEquals(resultado_esperado, resultado_real);
	}

}
