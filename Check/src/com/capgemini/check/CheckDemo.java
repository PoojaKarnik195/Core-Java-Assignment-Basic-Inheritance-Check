
package com.capgemini.check;

/**
 * @author Pooja Karnik Program to check direct and indirect variable
 *         accessibility
 *
 */
//checking direct and indirect variable accessibility
public class CheckDemo {

	// indirectly accessing private member using getters from other class while
	// other members can be directly accessed from the object created
	public static void main(String[] args) {

		Check check = new Check();

		check.disp();
		System.out.println("d = " + check.d);
		System.out.println("i = " + check.getI());
		System.out.println("j = " + check.j);
		System.out.println("k = " + check.k);

	}
}
