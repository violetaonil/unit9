package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class reemplazaTodosTest {

	@Test
	public void reemplazaTodostest() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.reemplazaTodos("aaaa bbbb cccc aaaa", "aaaa", "dddd");
		String resultado_esperado = "dddd bbbb cccc dddd";
		assertEquals(resultado_esperado, resultado_real);
	}

}
