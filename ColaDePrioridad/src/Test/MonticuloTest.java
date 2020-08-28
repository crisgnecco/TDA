package Test;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import Clases.*;

public class MonticuloTest {

	static ColaDePrioridad cola;
	
	@BeforeClass
	public static void before() {
	
		cola = new ColaDePrioridad();
		cola.add(2);
		cola.add(1);
		cola.add(3);
		cola.add(6);
		cola.add(4);
		cola.add(5);
		cola.add(0);
	}
	
	
	@Test
	public void getTest() {
		
		Integer a = 0;
		Integer b = 1;
		assertEquals(a,cola.remove());
		cola.mostrar();
		System.out.println("............................");
		cola.add(10);
		assertEquals(b,cola.remove());
		cola.mostrar();
		
	}

	@Test
	public void getHayQueBalancearPorDerechaTest() {
		
		ColaDePrioridad cola = new ColaDePrioridad();
		cola.add(1);
		cola.add(5);
		cola.add(3);
		cola.add(6);
		cola.add(7);
		cola.add(8);
		cola.add(9);
		
		Integer b = 1;
		cola.mostrar();
		System.out.println("............................");
		assertEquals(b,cola.remove());
		cola.mostrar();
		
	}

}
