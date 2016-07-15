package com.cts.basket.test;

import org.junit.Test;

import com.cts.basket.FruitBasket;
import com.cts.basket.constant.FruitConstant;
import com.cts.basket.fruit.Fruit;

import static org.junit.Assert.*;

/**
 * This Test class is used to check the final price of the fruit basket.
 */
public class FruitBasketTest {
	/**
	 * Happy Case : Find the total price of the fruit basket with correct input
	 * parameter.
	 * 
	 * @throws Exception
	 */
	@Test
	public void calculateTotalPriceTest() {
		try {
			FruitBasket fruitBasket = new FruitBasket();
			Fruit fruit = new Fruit();

			fruit.setOverallPrice(FruitConstant.APPLE, 200, 2, 0);
			fruitBasket.addFruit(fruit);

			fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.BANANA, 30.5, 4, 0);
			fruitBasket.addFruit(fruit);

			fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.LEMON, 5, 0, 7);
			fruitBasket.addFruit(fruit);

			fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.ORANGE, 80, 2, 0);
			fruitBasket.addFruit(fruit);

			fruit = new Fruit();
			fruit.setOverallPrice(FruitConstant.PEACH, 300, 0.5, 0);
			fruitBasket.addFruit(fruit);

			fruitBasket.calculateTotalPrice();

			assertNotNull("Final Price of the basket is ",
					fruitBasket.getFinalPrice());
			System.out.println("The total price of the Fruit Basket is :  "
					+ fruitBasket.getFinalPrice());
		} catch (Exception e) {
			fail("Exception occurred while calculating the price of the fruit.");
		}
	}

	/**
	 * Sad Case : Find the total price of the fruit basket with empty basket.
	 * 
	 * @throws Exception
	 */
	@Test
	public void calculateTotalPriceEmptyBasketTest() {

		FruitBasket fruitBasket = new FruitBasket();
		try {
			fruitBasket.calculateTotalPrice();
			assertNotNull("Final Price of the basket is ",
					fruitBasket.getFinalPrice());
		} catch (Exception e) {
			fail("Exception occurred while calculating the price of the fruit.");
		}
	}
}
