package unit9.unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class empiezaConTest {

	@Test
	public void empiezaContest() {
		CadenasAlumno caTest = new CadenasAlumno();
		boolean resultado_real = caTest.empiezaCon("entornos", "nos");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}

}
