package com.cts.basket.fruit;

import com.cts.basket.constant.FruitConstant;

/**
 * This class is used to for storing the name of the fruit and calculating the
 * price of the fruit.
 *
 */
public class Fruit {
	/**
	 * This field indicates the name of the fruit.
	 */
	private String name;
	/**
	 * This field indicates the overall price of the fruit.
	 */
	private double overallPrice;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the overallPrice
	 */
	public double getOverallPrice() {
		return overallPrice;
	}

	/**
	 * @param name
	 *            of the fruit.
	 * @param price
	 *            of the fruit.
	 * @param weight
	 *            of the fruit.
	 * @param quantity
	 *            of the fruit.
	 */
	public void setOverallPrice(String name, double price, double weight,
			int quantity) {
		if (FruitConstant.APPLE.equals(name)
				|| FruitConstant.BANANA.equals(name)
				|| FruitConstant.ORANGE.equals(name)
				|| FruitConstant.PEACH.equals(name) && weight > 0) {
			this.overallPrice = price * weight;
			setName(name);
		}
		if (FruitConstant.LEMON.equals(name) && quantity > 0) {
			this.overallPrice = price * quantity;
			setName(name);
		}
	}
}
