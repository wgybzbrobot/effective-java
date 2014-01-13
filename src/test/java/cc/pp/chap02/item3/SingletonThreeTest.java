package cc.pp.chap02.item3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cc.pp.chap02.item3.SingletonThree;

public class SingletonThreeTest {

	@Test
	public void testSingletonThree() {

		SingletonThree singleton = SingletonThree.INSTANCE;
		assertEquals("test", singleton.printString());
	}

}
