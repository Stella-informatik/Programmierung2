package ersteunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class zaehler {
	private static int statisch = 0;
    private int instanz = 0;
	@BeforeAll
	public static void vorAllen() {
        System.out.println("BeforeAll"); 
	}

	@AfterAll
	public static void nachAllen() {
        System.out.println("AfterAll");
    }

	@BeforeEach
	public void vorJedem() {
        statisch++;
        instanz++;
        System.out.println("BeforeEach: " + statisch + " " + instanz);
    }

	@AfterEach
	public void nachJedem() {
        System.out.println("AfterEach");
    }

	@Test
	public void testB() {
        System.out.println("B");
    }
	
	@Test
	public void testA() {
        System.out.println("A");
    }
}
