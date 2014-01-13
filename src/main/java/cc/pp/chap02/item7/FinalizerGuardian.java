package cc.pp.chap02.item7;

/**
 * 即使子类的终结方法未能调用super.finalizer，该终结方法也会被调用。
 * @author wgybzb
 *
 */
public class FinalizerGuardian {

	/**
	 * 这个对象的唯一意图是终结外围FinalizerGuardian对象
	 */
	@SuppressWarnings("unused")
	private final Object fg = new Object() {
		@Override
		protected void finalize() throws Throwable {
			// 终结外围FinalizerGuardian对象
		}
		// 其余代码忽略
	};

}
