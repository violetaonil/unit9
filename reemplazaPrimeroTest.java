package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class reemplazaPrimeroTest {

	@Test
	public void reemplazaPrimerotest() {
		CadenasAlumno caTest = new CadenasAlumno();
		assertTrue(caTest.reemplazaPrimero("aaaa bbbb cccc aaaa", "aaaa", "dddd") == "aaaa bbbb cccc aaaa".replaceAll("aaaa", "dddd"));
	}
}
