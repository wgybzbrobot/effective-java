package cc.pp.chap02.item2;

/**
 * 对于“多个构造器参数”，采用Builder Pattern方式。
 * 安全性好、可读性好
 * @author wgybzb
 *
 */
public class NutritionFactsBP {

	/**
	 * 必选参数
	 */
	private final int servingSize;
	private final int servings;

	/**
	 * 可选参数
	 */
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public NutritionFactsBP(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public static class Builder {
		/**
		 * 必选参数
		 */
		private final int servingSize;
		private final int servings;

		/**
		 * 可选参数
		 */
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFactsBP build() {
			return new NutritionFactsBP(this);
		}
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

}
