package cc.pp.chap02.item3;

import java.io.Serializable;

public class SingletonSerialize implements Serializable {

	private static final long serialVersionUID = -4290050450230107037L;

	private static final SingletonSerialize INSTANCE = new SingletonSerialize();

	private SingletonSerialize() {
		//
	}

	public static SingletonSerialize getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		//
	}

	/**
	 * 为了保证单例属性。
	 * 返回一个真实的SingletonSerialize对象，并且使垃圾回收注意假冒的对象实例。
	 */
	private Object readResolve() {
		return INSTANCE;
	}

}
