package cc.pp.chap02.item3;

/**
 * 对于公有静态成员方法SingletonTwo.getInstance所有的调用，都会返回一个对象引用。
 *     注：这是Java 1.5发行版之前的Singleton实现方式。
 * @author wgybzb
 *
 */
public class SingletonTwo {

	private static final SingletonTwo INSTANCE = new SingletonTwo();

	private SingletonTwo() {
		//
	}

	public static SingletonTwo getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		//
	}

}
