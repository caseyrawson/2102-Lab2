import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HybridTests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid = new Hybrid();
		hybrid.setCostPerGallon(3.5);
		hybrid.setCostPerKWH(0.24);
    }

	@Test
	public void MPGTest() {
		double gallons = 3.0;
		double miles = 300;
		hybrid.setGallonsfromGas(gallons);
		hybrid.setMilesfromGas(miles);
		double mpg = hybrid.calcGasMPG();
		assertTrue(100 == mpg);
	}

	@Test
	public void MPGTest2() {
		double gallons = 4.0;
		double miles = 100;
		hybrid.setGallonsfromGas(gallons);
		hybrid.setMilesfromGas(miles);
		double mpg = hybrid.calcGasMPG();
		assertTrue(25 == mpg);
	}

	@Test
	public void MPGeTest() {
		double kWh = 70.0;
		double totalElectricMiles = 300;
		hybrid.setTotalkWh(kWh);
		hybrid.setElectricMiles(totalElectricMiles);
		double MPGe = hybrid.calcMPGe();
		assertTrue(144.42857142857144 == MPGe);
	}

	@Test
	public void MPGeTest2() {
		double kWh = 80.0;
		double totalElectricMiles = 300;
		hybrid.setTotalkWh(kWh);
		hybrid.setElectricMiles(totalElectricMiles);
		double MPGe = hybrid.calcMPGe();
		assertTrue(126.37500000000001 == MPGe);
	}

	@Test
	public void CostPerGallonTest() {
		hybrid.setCostPerGallon(4.0);
		double CostPerGallon = hybrid.getCostPerGallon();
		assertTrue(4.0 == CostPerGallon);
	}

	@Test
	public void CostPerKwhTest() {
		hybrid.setCostPerKWH(0.34);
		double CostPerKwh = hybrid.getCostPerKWH();
		assertTrue(0.34 == CostPerKwh);
	}
}