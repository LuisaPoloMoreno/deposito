import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class depositoCombustibleMaxTest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testGetDepositoMax() {
		DepositoCombustible dep= new DepositoCombustible (40.0, 10.0);
		double max= dep.getDepositoMax();
		assertEquals (40.0, max);
		
	}

}