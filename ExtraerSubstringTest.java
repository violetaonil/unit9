package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtraerSubstringTest {

	@Test
	public void ExtraerSubstringtest1() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.extraerSubstring("ENTORNOS", 2);
		String resultado_esperado = "TORNOS";
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void ExtraerSubstringtest2() {
		CadenasAlumno caTest = new CadenasAlumno();
		String resultado_real = caTest.extraerSubstring("ENTORNOS", 2, 5);
		String resultado_esperado = "TOR";
		assertEquals(resultado_esperado, resultado_real);
	}
}
