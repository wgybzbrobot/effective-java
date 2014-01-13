package cc.pp.chap03.item8;

public class CaseInsensitiveStringTwo {

	private final String s;

	public CaseInsensitiveStringTwo(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		this.s = s;
	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof CaseInsensitiveStringTwo) {
			return s.equalsIgnoreCase(((CaseInsensitiveStringTwo) o).s);
		}

		return false;
	}

}
