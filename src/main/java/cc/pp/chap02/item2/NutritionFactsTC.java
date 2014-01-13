package cc.pp.chap02.item2;

/**
 * 对于“多个构造器参数”，采用重叠构造器（Telescoping Constructor）方式，。
 * 安全性好
 * @author wgybzb
 *
 */
public class NutritionFactsTC {

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

	public NutritionFactsTC(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFactsTC(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFactsTC(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFactsTC(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFactsTC(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
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
