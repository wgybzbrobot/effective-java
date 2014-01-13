package cc.pp.chap03.item8;

/**
 * 该类中的equals知道String对象，然而String类中的equals却不知道该类对象。
 * 该类重写euqlas的时候违反了“对称性”原则。
 * @author wgybzb
 *
 */
public class CaseInsensitiveStringOne {

	private final String s;

	public CaseInsensitiveStringOne(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		this.s = s;
	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof CaseInsensitiveStringOne) {
			return s.equalsIgnoreCase(((CaseInsensitiveStringOne) o).s);
		}
		if (o instanceof String) {
			return s.equalsIgnoreCase((String) o);
		}
		return false;
	}

}
