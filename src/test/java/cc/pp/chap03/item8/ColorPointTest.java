package cc.pp.chap03.item8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;

public class ColorPointTest {

	@Test
	public void testColorPointOne() {

		Point p = new Point(1, 2);
		ColorPointOne cpo = new ColorPointOne(1, 2, Color.RED);
		assertTrue(p.equals(cpo));
		assertTrue(cpo.equals(p));
	}

	@Test
	public void testColorPointTwo() {

		Point p = new Point(1, 2);
		ColorPointTwo cpt = new ColorPointTwo(1, 2, Color.RED);
		assertTrue(p.equals(cpt));
		assertFalse(cpt.equals(p));
	}

	@Test
	public void testColorPointThree() {

		Point p = new Point(1, 2);
		ColorPointThree cpt1 = new ColorPointThree(1, 2, Color.RED);
		ColorPointThree cpt2 = new ColorPointThree(1, 2, Color.BLUE);
		assertTrue(p.equals(cpt1));
		assertTrue(p.equals(cpt2));
		assertTrue(cpt1.equals(p));
		assertTrue(cpt2.equals(p));
		assertFalse(cpt1.equals(cpt2));
		assertFalse(cpt2.equals(cpt1));
	}

}
