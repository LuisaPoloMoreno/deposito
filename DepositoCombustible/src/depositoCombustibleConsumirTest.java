import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

class depositoCombustibleConsumirTest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testconsumir() {
		DepositoCombustible dep= new DepositoCombustible (40.00, 10.00);
		dep.consumir(7.00);
		assertEquals (3.00, dep.getDepositoNivel());
		assertNotSame (3.00, dep.getDepositoMax());
		
	}

}
