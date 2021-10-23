import static org.junit.Assert.*;

import org.junit.Test;

public class DaysDurationCalculatorTest {
	DaysDurationCalculator dayz = new DaysDurationCalculator();
@Test
	public final void testCal() {
		assertNotNull(dayz.cal(0, 0, 0, 0, 0));
	}
@Test
	public final void testCal2() {
		assertNotEquals(dayz.cal(3, 4, 1, 8, 2001),dayz.cal(4, 10, 1, 7 , 2020));
	}
@Test
	public final void testCal3() {
		assertEquals(dayz.cal(3, 4, 1, 8, 2001),dayz.cal(3, 4, 1, 8, 2001));
	}
@Test
	public final void testCal4() 
	{
		assertNotNull(dayz.cal(3, 0, 0, 0, 5));
	}
}
