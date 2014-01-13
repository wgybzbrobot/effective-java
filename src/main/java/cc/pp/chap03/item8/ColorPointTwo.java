package cc.pp.chap03.item8;

import java.awt.Color;

/**
 * 比较时总是返回false
 * @author wgybzb
 *
 */
public class ColorPointTwo extends Point {

	private final Color color;

	public ColorPointTwo(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPointTwo)) {
			return false;
		}
		return super.equals(o) && ((ColorPointTwo) o).color == color;
	}

}