import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DepositoCombustibleEstaVaciotest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testEstaVacio() {
		DepositoCombustible dep= new DepositoCombustible (55.00, 22.00);
		dep.consumir (22.00);
		assertTrue (dep.estaVacio());
	}

	void testEstaVacio2() {
		DepositoCombustible dep= new DepositoCombustible (55.00, 22.00);
		dep.fill (15.00);
		assertFalse (dep.estaVacio());
	}
}
