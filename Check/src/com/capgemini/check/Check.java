
package com.capgemini.check;

//creating member variables with different accessibility modifiers
public class Check {

	int d = 9;
	private int i = 34;
	public int j = 12;
	protected int k = 32;

	// member function disp prints the statement when called
	public void disp() {
		System.out.println("Good morning...");
	}

	// private members cannot be accessed directly from other classes so we make use
	// of getters
	public int getI() {
		return i;
	}
}
