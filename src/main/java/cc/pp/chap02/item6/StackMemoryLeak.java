package cc.pp.chap02.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 这段程序存在内存泄漏问题：由于内存占用地不断增加，程序性能的降低会逐渐表现出来。
 *       如果一个栈先是增长，然后再收缩，那么，从栈中弹出来的对象将不会被当作垃圾回收，
 *   即使使用栈的程序不再引用这些对像，它们也不会被回收。这是因为，栈内部维护着对这些
 *   对象的过期引用（Obsolete Reference）。所谓的过期引用，是指永远也不会被解除的
 *   引用（本示例中指的是elements下表小于size的那些元素）。
 * 解决方案：清空不必要的对象，然而清空对象引用应该是一种例外，而不是一种规范行为。
 * 消除过期引用最好的方法是让包含该引用的变量结束其生命周期。
 * @author wgybzb
 *
 */
public class StackMemoryLeak {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackMemoryLeak() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		/**
		 * 内存泄漏解决方案：清空使用过的元素
		 */
		//		element[size] = null;
		return elements[--size];
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

}
