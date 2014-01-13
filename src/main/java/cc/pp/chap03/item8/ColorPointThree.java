package cc.pp.chap03.item8;

import java.awt.Color;

/**
 * 违反了传递性原则
 * @author wgybzb
 *
 */
public class ColorPointThree extends Point {

	private final Color color;

	public ColorPointThree(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		/**
		 * 如果o是普通的Point，忽略color比较。
		 */
		if (!(o instanceof ColorPointThree)) {
			return o.equals(this);
		}
		/**
		 * 如果o是该类类型，做全局比较。
		 */
		return super.equals(o) && ((ColorPointThree) o).color == color;
	}

}
