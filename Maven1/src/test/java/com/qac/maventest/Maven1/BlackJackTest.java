package com.qac.maventest.Maven1;
//import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase {
	@Test
	public void test() {
		BlackJack blackjack = new BlackJack();
		
		assertEquals(10, blackjack.play (12,19));
		
		
	}
}
