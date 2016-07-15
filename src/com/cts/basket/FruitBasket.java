package com.cts.basket;

import java.util.ArrayList;
import java.util.List;

import com.cts.basket.fruit.Fruit;

/**
 * This class is used to calculate the total price of the fruits inside the
 * basket.
 */
public class FruitBasket {
	// List of fruits
	private List<Fruit> fruits;
	/**
	 * Final price of the fruit basket.
	 */

	private double finalPrice;

	/**
	 * @return the finalPrice
	 */
	public double getFinalPrice() {
		return finalPrice;
	}

	/**
	 * @param finalPrice
	 *            the finalPrice to set
	 */
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public FruitBasket() {
		this.fruits = new ArrayList<Fruit>();
	}

	public void addFruit(Fruit fruit) {
		this.fruits.add(fruit);
	}

	public void calculateTotalPrice() throws Exception {
		if (fruits.size() > 0) {
			for (Fruit fruit : fruits) {
				finalPrice += fruit.getOverallPrice();
			}
		} else {
			throw new Exception("No Fruits in the Basket.");
		}
	}
}
