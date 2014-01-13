package cc.pp.chap02.item5;

/**
 * Long是装箱类型，long是基本类型。
 * @author wgybzb
 *
 */
public class RedundantObjects {

	public static void main(String[] args) {

		RedundantObjects.sumUpperCaseLong();
		RedundantObjects.sumLowerCaseLong();
	}

	public static void sumUpperCaseLong() {

		long start = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(end - start);
	}

	public static void sumLowerCaseLong() {

		long start = System.currentTimeMillis();
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(end - start);
	}

}
