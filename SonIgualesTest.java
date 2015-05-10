package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Violeta Feliciano
 *
 */
public class SonIgualesTest {

	@Test
	public void SonIgualesTest1() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.sonIguales("entornos", "ento");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	public void SonIgualesTest2() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.sonIguales("ento", "entornos");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	public void SonIgualesTest3() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.sonIguales("entornos", "sonrotne");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	public void SonIgualesTest4() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.sonIguales("entornos", "entornos");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}

}
