package cc.pp.chap03.item8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CaseInsensitiveStringTest {

	@Test
	public void testCaseInsensitiveStringOne() {

		CaseInsensitiveStringOne cis = new CaseInsensitiveStringOne("Test");
		String s = "test";
		assertTrue(cis.equals(s));
		assertFalse(s.equals(cis));
	}

	@Test
	public void testCaseInsensitiveStringOneList() {

		List<CaseInsensitiveStringOne> list = new ArrayList<CaseInsensitiveStringOne>();
		CaseInsensitiveStringOne cis1 = new CaseInsensitiveStringOne("test1");
		CaseInsensitiveStringOne cis2 = new CaseInsensitiveStringOne("test2");
		list.add(cis1);
		list.add(cis2);
		assertFalse(list.contains("test1"));
		assertFalse(list.contains("test2"));
	}

	@Test
	public void testCaseInsensitiveStringTwo() {

		CaseInsensitiveStringTwo cis = new CaseInsensitiveStringTwo("Test");
		String s = "test";
		assertFalse(cis.equals(s));
		assertFalse(s.equals(cis));
	}

	@Test
	public void testCaseInsensitiveStringTwoList() {

		List<CaseInsensitiveStringTwo> list = new ArrayList<CaseInsensitiveStringTwo>();
		CaseInsensitiveStringTwo cis1 = new CaseInsensitiveStringTwo("test1");
		CaseInsensitiveStringTwo cis2 = new CaseInsensitiveStringTwo("test2");
		list.add(cis1);
		list.add(cis2);
		assertFalse(list.contains("test1"));
		assertFalse(list.contains("test2"));
	}

}
