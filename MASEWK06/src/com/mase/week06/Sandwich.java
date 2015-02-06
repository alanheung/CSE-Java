package com.mase.week06;

	class Meal {
//		Cheese b = new Cheese("Cheese instance in Meal...");
//		Meal() { System.out.println("Meal()"); }
	}

		class Bread {
			Bread() { System.out.println("Bread()"); }
			Bread(String s) { System.out.println("\nBread::"+s); }
		}
	
		class Cheese {
			Cheese() { System.out.println("Cheese()"); }
			Cheese(String s) { System.out.println("\nCheese::"+s); }
		}
	
		class Lettuce {
			Lettuce() { System.out.println("Lettuce()"); }
			Lettuce(String s) { System.out.println("\nLettuce::"+s); }
		}

	class Lunch extends Meal {
//		Bread b = new Bread("Bread instance in Lunch...");
//		Lunch() { System.out.println("Lunch()");}
	}

	class PortableLunch extends Lunch {
		Lettuce l = new Lettuce("Lettuce instance in PortableLunch...");
		PortableLunch() {
			System.out.println("PortableLunch()\n");
		}
	}

	public class Sandwich extends PortableLunch {
//		Bread b = new Bread();
//		Cheese c = new Cheese();
//		Lettuce l = new Lettuce();
		Sandwich() { 
			System.out.println("\nSandwich()");
		}
		public static void main(String[] args) {
			new Sandwich();
		}
	} 
	/* Output

	Cheese::Cheese instance in Meal...
	Meal()

	Bread::Bread instance in Lunch...
	Lunch()

	Lettuce::Lettuce instance in PortableLunch...
	PortableLunch()

	Bread()
	Cheese()
	Lettuce()

	Sandwich()
	*/
