package modernjavainaction.chap01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modernjavainaction.chap01.FilteringApples.Apple;

class FilteringApplesTest {

	Apple greenLightApple;
	Apple redHeavyApple;
	List<Apple> apples;

	@BeforeEach
	void setUp() throws Exception {
		greenLightApple = new Apple(1, "green");
		redHeavyApple = new Apple(1000, "red");
		apples = new ArrayList<>();
		apples.add(greenLightApple);
		apples.add(redHeavyApple);
	}

	@Test
	void testFilterGreenApples() {
		List<Apple> result = FilteringApples.filterGreenApples(apples);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0).getColor(), "green");
	}

	@Test
	void testFilterHeavyApples() {
		List<Apple> result = FilteringApples.filterHeavyApples(apples);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0).getWeight(), 1000);
	}

	@Test
	void testFilterApples() {
		List<Apple> result = FilteringApples.filterApples(apples, FilteringApples::isGreenApple);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0).getColor(), "green");
		result = FilteringApples.filterApples(apples, FilteringApples::isHeavyApple);
		assertEquals(result.size(), 1);
		assertEquals(result.get(0).getWeight(), 1000);
	}

	@Test
	void testIsGreenApple() {
		assertTrue(FilteringApples.isGreenApple(greenLightApple));
		assertFalse(FilteringApples.isGreenApple(redHeavyApple));
	}

	@Test
	void testIsHeavyApple() {
		assertTrue(FilteringApples.isHeavyApple(redHeavyApple));
		assertFalse(FilteringApples.isHeavyApple(greenLightApple));
	}

	@Test
	void testMain() {
		assertAll(() -> FilteringApples.main());
	}

}
