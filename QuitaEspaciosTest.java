package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuitaEspaciosTest {

	@Test
	public void QuitaEspaciostest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.quitaEspacios("   hola cara cola   ");
		String resultado_esperado = "hola cara cola";
		assertEquals(resultado_real, resultado_esperado);
	}

}
