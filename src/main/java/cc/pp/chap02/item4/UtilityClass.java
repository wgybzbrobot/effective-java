package cc.pp.chap02.item4;

/**
 * 不可实例化的工具类
 * @author wgybzb
 *
 */
public class UtilityClass {

	/**
	 * 屏蔽默认的构造函数
	 */
	private UtilityClass() {
		throw new AssertionError();
	}

}
