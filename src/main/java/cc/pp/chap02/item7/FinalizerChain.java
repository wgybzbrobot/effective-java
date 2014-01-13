package cc.pp.chap02.item7;

public class FinalizerChain {

	@Override
	protected void finalize() throws Throwable {
		try {
			// 终结子类状态
		} finally {
			super.finalize();
		}
	}

}
