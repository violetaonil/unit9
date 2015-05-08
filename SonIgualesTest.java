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
		assertTrue(caTest.sonIguales("entornos", "ento") == "entornos".equals("ento"));
	}
	
	public void SonIgualesTest2() {
		CadenasAlumno caTest = new CadenasAlumno();
		assertTrue(caTest.sonIguales("ento", "entornos") == "ento".equals("entornos"));
	}
	
	public void SonIgualesTest3() {
		CadenasAlumno caTest = new CadenasAlumno();
		assertTrue(caTest.sonIguales("entornos", "sonrotne") == "entornos".equals("sonrotne"));
	}
	
	public void SonIgualesTest4() {
		CadenasAlumno caTest = new CadenasAlumno();
		assertTrue(caTest.sonIguales("entornos", "entornos") == "entornos".equals("entornos"));
	}

}
