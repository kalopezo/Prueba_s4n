import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroTest {

	@Test
	public void testToStringMultiploDe3() {
		String esperado = "Fizz";
		Numero seis = new Numero(6);
		String real = seis.toString();
		assertEquals(esperado, real);
	}
	
	@Test
	public void testToStringMultiploDe5() {
		String esperado = "Buzz";
		Numero diez = new Numero(10);
		String real = diez.toString();
		assertEquals(esperado, real);
	}
	
	@Test
	public void testToStringMultiploDe3y5() {
		String esperado = "FizzBuzz";
		Numero quince = new Numero(15);
		String real = quince.toString();
		assertEquals(esperado, real);
	}
	
	@Test
	public void testToStringMultiploDeNinguno() {
		Numero once = new Numero(11);
		String esperado = String.valueOf(11);
		String real = once.toString();
		assertEquals(esperado, real);
	}

}
