

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ersteunit.RationaleZahl;

class TresorTest {

	@Test
	void testoeffnen1() {
	Tresor<String> t1=new Tresor<String>("Stell",10);	
	assertEquals("Stell",t1.inhalt);
	}
	@Test
	void testoeffnen2() {
	Tresor<String> t2=new Tresor<String>("Stell",10);	
	assertThrows(IllegalArgumentException.class,()->{
		 t2.oeffnen(3);
	});
	}
	@Test
	void testersetzen1() {
	Tresor<Integer> t1=new Tresor<Integer>(10,10);	
	assertEquals(10,t1.inhalt);
	}
	@Test
	void testerstzen2() {
	Tresor<String> t2=new Tresor<String>("rot",10);	
	assertThrows(IllegalArgumentException.class,()->{
		 t2.ersetzen(3,"gruen");
	});
	}
	@Test
	void testersetzen() {
		Pair<String,Double> meinpaar=new Pair<>("Erstes",3.4);
		Tresor<Pair<String,Double>> t3=new Tresor<>(meinpaar,000);	
	assertEquals("Erstes",t3.inhalt.getFirst());
	}
}
