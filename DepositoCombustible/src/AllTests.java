import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
	
	DepositoCombustibleConsumirTest.class,
	DepositoCombustibleEstaLlenoTest.class,
	DepositoCombustibleEstaVaciotest.class,
	DepositoCombustibleFillTest.class,
	DepositoCombustibleMaxTest.class,
	DepositoCombustibleNivelTest.class
})

public class AllTests {}
