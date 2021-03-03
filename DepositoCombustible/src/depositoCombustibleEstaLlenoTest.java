import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class depositoCombustibleEstaLlenoTest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testEstaVacio() {
		DepositoCombustible dep= new DepositoCombustible (55.00, 15.50);
		dep.fill (39.50);
		assertTrue (dep.estaLleno());
	}

	void testEstaVacio2() {
		DepositoCombustible dep= new DepositoCombustible (55.00, 45.00);
		dep.consumir (30.00);
		assertFalse (dep.estaLleno());
	}
}
