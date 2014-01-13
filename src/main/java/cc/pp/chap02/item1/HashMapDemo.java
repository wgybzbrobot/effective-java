package cc.pp.chap02.item1;

import java.util.HashMap;

/**
 * 静态工厂方法
 * @author wgybzb
 *
 */
public class HashMapDemo {

	public static <K, V> HashMap<K, V> newInstancePublic() {
		return new HashMap<K, V>();
	}

	protected static <K, V> HashMap<K, V> newInstanceProtected() {
		return new HashMap<K, V>();
	}

	@SuppressWarnings("unused")
	private static <K, V> HashMap<K, V> newInstancePrivate() {
		return new HashMap<K, V>();
	}

}
