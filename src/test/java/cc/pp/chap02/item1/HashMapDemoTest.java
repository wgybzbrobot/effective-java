package cc.pp.chap02.item1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class HashMapDemoTest {

	private List<String> list;
	private static final String RESULT = "{test=[aaa, bbb]}";

	@Before
	public void prepared() {
		list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
	}

	@Test
	public void testNewInstancePublic() {

		Map<String, List<String>> map = HashMapDemo.newInstancePublic();
		map.put("test", list);
		assertEquals(map.toString(), RESULT);
	}

	/**
	 * 注意要在同一个包下才行
	 */
	@Test
	public void testNewInstanceProtected() {

		Map<String, List<String>> map = HashMapDemo.newInstanceProtected();
		map.put("test", list);
		assertEquals(map.toString(), RESULT);
	}

	/**
	 * 只能对类中的公有的或者受保护的构造器执行类型推导，私有的则不行
	 */
	@Ignore
	public void testNewInstancePrivate() {

		//		Map<String, List<String>> map = HashMapDemo.newInstancePrivate();
		//		map.put("test", list);
		//		assertEquals(map.toString(), RESULT);
	}

	@Test
	public void testHashMapForJava7() {

		Map<String, List<String>> map = new HashMap<>();
		map.put("test", list);
		assertEquals(map.toString(), RESULT);
	}

}
