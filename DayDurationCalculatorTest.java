import static org.junit.Assert.*;

import org.junit.Test;

public class DaysDurationCalculatorTest {
	DaysDurationCalculator dayz = new DaysDurationCalculator();
@Test
	public final void testCal() {
		assertNotNull(dayz.cal(0, 0, 0, 0, 0));
	}
