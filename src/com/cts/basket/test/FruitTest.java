package com.cts.basket.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.cts.basket.constant.FruitConstant;
import com.cts.basket.fruit.Fruit;

/**
 * This Test class is used to check the overall price of the fruit.
 */
public class FruitTest {

	/**
	 * Happy Case : Find the total price of the fruit with correct input
	 * parameter.
	 * 
	 * @throws Exception
	 */
	@Test
	public void calculateTotalPriceTest() {
		try {
			Fruit fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.APPLE, 200, 2, 0);

			assertNotNull("The fruit name is null ", fruit.getName());
			System.out.println("The total price of the Fruit is :  "
					+ fruit.getOverallPrice());
		} catch (Exception e) {
			fail("Exception occurred while calculating the price of the fruit.");
		}
	}

	/**
	 * Sad Case : Find the total price of the fruit with incorrect input
	 * parameter.
	 * 
	 * @throws Exception
	 */
	@Test
	public void calculateWrongTotalPriceTest() {
		try {
			Fruit fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.LEMON, 5, 6, 0);

			assertNotNull("The fruit name is null ", fruit.getName());
			System.out.println("The total price of the Fruit is :  "
					+ fruit.getOverallPrice());
		} catch (Exception e) {
			fail("Exception occurred while calculating the price of the fruit.");
		}
	}

}
