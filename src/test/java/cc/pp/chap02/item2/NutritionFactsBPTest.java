package cc.pp.chap02.item2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cc.pp.chap02.item2.NutritionFactsBP;
import cc.pp.chap02.item2.NutritionFactsBPGeneric;

public class NutritionFactsBPTest {

	@Test
	public void testNutritionFactsBP() {

		NutritionFactsBP bp = new NutritionFactsBP.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		assertEquals(240, bp.getServingSize());
		assertEquals(8, bp.getServings());
		assertEquals(100, bp.getCalories());
		assertEquals(35, bp.getSodium());
		assertEquals(27, bp.getCarbohydrate());
		assertEquals(0, bp.getFat());
	}

	@Test
	public void testNutritionFactsBPGeneric() {

		NutritionFactsBPGeneric bp = (NutritionFactsBPGeneric) new NutritionFactsBPGeneric.Builder(240, 8)
				.calories(100).sodium(35)
				.carbohydrate(27).builder();
		assertEquals(240, bp.getServingSize());
		assertEquals(8, bp.getServings());
		assertEquals(100, bp.getCalories());
		assertEquals(35, bp.getSodium());
		assertEquals(27, bp.getCarbohydrate());
		assertEquals(0, bp.getFat());
	}

}
