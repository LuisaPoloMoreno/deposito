import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

class DepositoCombustibleFillTest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testfill() {
		DepositoCombustible dep= new DepositoCombustible (40.00, 10.00);
		dep.fill(18.00);
		assertEquals (28.00, dep.getDepositoNivel());
		assertNotSame (28.00, dep.getDepositoMax());
		
	}

}
