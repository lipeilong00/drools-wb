package com.myteam.repro;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Car implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String color;
	private int price;

	public Car() {
	}

	public java.lang.String getColor() {
		return this.color;
	}

	public void setColor(java.lang.String color) {
		this.color = color;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(java.lang.String color, int price) {
		this.color = color;
		this.price = price;
	}

}