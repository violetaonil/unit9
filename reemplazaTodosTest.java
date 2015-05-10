package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class reemplazaTodosTest {

	@Test
	public void reemplazaTodostest() {
		CadenasAlumno caTest = new CadenasAlumno();
		assertTrue(caTest.reemplazaTodos("aaaa bbbb cccc aaaa", "aaaa", "dddd") == "aaaa bbbb cccc aaaa".replaceAll("aaaa", "dddd"));
	}

}
