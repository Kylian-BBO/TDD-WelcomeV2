package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void ITER_1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
	}
	
	@Test
	void ITER_2() {
		assertEquals("Hello, my friend", Welcome.welcome("    "));
	}
	
	@Test
	void ITER_3() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
	}
	
	@Test
	void ITER_4() {
		assertEquals("Hello, Amy and Bob", Welcome.welcome("amy,bob"));
	}
	
	@Test
	void ITER_5() {
		assertEquals("Hello, Amy, Bob and Jerry", Welcome.welcome("Amy,bob,jerry"));
	}
	
	@Test
	void ITER_6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("Amy, BOB, Jerry"));
		assertEquals("HELLO, JERRY, AMY AND BOB !", Welcome.welcome("JERRY,AMY,BOB"));
	}
	
	@Test
	void ITER_7() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob, amy, jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob, AMY, jerry, JACK"));
		assertEquals("HELLO, AMY AND JACK !", Welcome.welcome("AMY,JACK"));
	}
	
	@Test
	void ITER_8() {
		assertEquals("Hello, Bob and Amy", Welcome.welcome("bob    , amy   "));
		assertEquals("HELLO, AMY AND BOB !", Welcome.welcome(" AMY  ,    BOB "));
		assertEquals("Hello, Jack. AND HELLO, AMY AND BOB !", Welcome.welcome("    jack, AMY  ,    BOB "));	
	}
}