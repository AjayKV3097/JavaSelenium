package org.corejava;

public class LoopingStatements {

	// print largest of two numbers using if and ternary

	private void largestOfTwo() {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 90;

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

	private void largestOfTwoUsingTernary() {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 90;
		int c;
		c = (a > b) ? a : b;
		System.out.println(c);

	}

	private void smallestOfThreeNumbers() {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		int c = 30;
		if (a < b && a < c) {
			System.out.println("A is smallest: " + a);
		} else if (b < a && b < c) {

			System.out.println("B is smallest: " + b);
		} else {
			System.out.println("c is smallest: " + c);
		}

	}

	private void weekNumber() {
		// TODO Auto-generated method stub
		String weekname = "Tuesday";

		switch (weekname) {
		case "Sunday":
			System.out.println("0");

			break;
		case "Monday":
			System.out.println("1");

			break;
		case "Tuesday":
			System.out.println("2");

			break;
		case "Wednesday":
			System.out.println("3");

			break;
		case "Thursday":
			System.out.println("4");

			break;
		case "Friday":
			System.out.println("5");

			break;
		case "Saturday":
			System.out.println("6");

			break;

		default:
			System.out.println("None");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingStatements l = new LoopingStatements();
		l.weekNumber();
	}

}
