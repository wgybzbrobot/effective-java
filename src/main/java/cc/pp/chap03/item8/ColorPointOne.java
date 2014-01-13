package cc.pp.chap03.item8;

import java.awt.Color;

/**
 * 如果不完全提供equals方法，而是直接从Point继承过来，在equals做比较的时候颜色信息就被忽略掉了。
 * @author wgybzb
 *
 */
public class ColorPointOne extends Point {

	@SuppressWarnings("unused")
	private final Color color;

	public ColorPointOne(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

}
