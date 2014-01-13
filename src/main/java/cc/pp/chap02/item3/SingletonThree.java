package cc.pp.chap02.item3;

/**
 * Java 1.5发行版开始实现Singleton的方式，最佳实现方式。
 *  优点：与公有域方法很相近，但是更简洁，并带有序列化机制，
 *        防止多次实例化，即使是在面对复杂的序列化或者反射攻击的时候。
 * @author wgybzb
 *
 */
public enum SingletonThree {

	INSTANCE;

	public String printString() {
		return "test";
	}

}
