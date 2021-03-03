import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class depositocombustibleTest {
	
	private DepositoCombustible DepositoCombustible ;

	@Test
	void testGetDepositoNivel() {
		DepositoCombustible dep= new DepositoCombustible (40.0, 10.0);
		double nivel= dep.getDepositoNivel();
		assertEquals (10.0, nivel);
		
	}

}