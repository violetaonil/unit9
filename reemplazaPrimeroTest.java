package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class reemplazaPrimeroTest {

	@Test
	public void reemplazaPrimerotest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.reemplazaPrimero("aaaa bbbb cccc aaaa", "aaaa", "dddd");
		String resultado_esperado = "dddd bbbb cccc aaaa";
		assertEquals(resultado_esperado, resultado_real);
	}
}
