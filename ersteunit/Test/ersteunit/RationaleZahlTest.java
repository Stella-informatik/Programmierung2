package ersteunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RationaleZahlTest {


	@Test
	void testkuerzen() {
		RationaleZahl z= new RationaleZahl(2,4);
		RationaleZahl z1=new RationaleZahl(1,2);
		assertEquals(z1,z);
		
	}
	@Test
	void testpruefung() {
		assertThrows(ArithmeticException.class,()->{
			new RationaleZahl(3,0);
		});
	}
	
	@Test
	void testvorzeichnen() {
		RationaleZahl z= new RationaleZahl(1,-2);
		assertEquals(-1,z.getZ());
		assertEquals(2,z.getN());
	}
	@Test
	void testausgabestring() {
		RationaleZahl z= new RationaleZahl(1,2);
		assertEquals("1/2",z.toString());
	}
	@Test
	void testgleichheitbruch() {
		RationaleZahl z= new RationaleZahl(1,2);
		assertTrue(z.equals(z));
	
	}
	
}
