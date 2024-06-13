package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IPValidatorTest {

	@Test
	void CP1() {
		assertTrue(IPValidator.validateIPAndClass("126.1.1.1",'A'));
	}
	
	@Test
	void CP2() {
		assertTrue(IPValidator.validateIPAndClass("191.1.1.1",'B'));
	}

	@Test
	void CP3() {
		assertTrue(IPValidator.validateIPAndClass("223.1.1.1",'C'));
	}

	@Test
	void CP4() {
		assertTrue(IPValidator.validateIPAndClass("239.1.1.1",'D'));
	}

	@Test
	void CP5() {
		assertTrue(IPValidator.validateIPAndClass("255.1.1.1",'E'));
	}


}
