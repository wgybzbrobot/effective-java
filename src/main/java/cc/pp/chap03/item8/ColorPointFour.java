package cc.pp.chap03.item8;

import java.awt.Color;

public class ColorPointFour extends Point {

	@SuppressWarnings("unused")
	private final Color color;

	public ColorPointFour(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	//	@Override
	//	public boolean equals(Object o) {
	//		if (o == null || o.getClass() != getClass())
	//			return false;
	//		Point p = (Point) o;
	//		return p.x == x && p.y == y;
	//	}

}
