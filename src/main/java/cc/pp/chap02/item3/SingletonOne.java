package cc.pp.chap02.item3;

/**
 * Singlton：把构造器保持私有，并导出公有的静态成员，静态成员是public static final型的示例对象。
 *      注：这是Java 1.5发行版之前的Singleton实现方式。
 *      私有构造器被调用一次，所以实例只有一个。但是享有特权的客户端可以借助AccessibleObject.setAccessible
 *  方法，通过反射机制调用私有构造器。如果需要抵御这种攻击，可以修改构造器，让它在被要求创建第二个示例的时候抛出异常。
 * @author wgybzb
 *
 */
public class SingletonOne {

	public static final SingletonOne INSTANCE = new SingletonOne();

	private SingletonOne() {
		//
	}

	public void leaveTheBuilding() {
		//
	}

}
