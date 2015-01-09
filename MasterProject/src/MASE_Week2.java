import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;
enum Direction {
	NORTH, SOUTH, EAST, WEST
}
public class MASE_Week2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//simpleCalcs();
		//simpleCalcsShortHand();
		//compareTwoValues();
		//preAndPostDifference();
		//compareStrings();
		//turnaryOperator();
		//switchComparison();
		//switchComparisonBM();
		//switchVowelOrConsanant();
		//switchEnumType();
		//doubleNumbersRepresentations();
		halfEvenTests();
	}

	public static void halfEvenTests(){
		double d = 102.125;
		BigDecimal amount = new BigDecimal(Double.toString(d));

		amount = amount.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("amount is "+amount);//102.12

		double percent = 0.0755;//7.55%
		String p = NumberFormat.getPercentInstance().format(percent);
		System.out.println("p == "+p);//8%

		percent = 0.0749;//7.49%
		p = NumberFormat.getPercentInstance().format(percent);
		System.out.println("p == "+p);//7%

		percent = 0.075;//7.5%
		p = NumberFormat.getPercentInstance().format(percent);
		System.out.println("p == "+p);//8%

		percent = 0.065;//6.5%
		p = NumberFormat.getPercentInstance().format(percent);
		System.out.println("p == "+p);//6%

		percent = 0.0651;//6.51%
		p = NumberFormat.getPercentInstance().format(percent);
		System.out.println("p == "+p);//7%
	}
	
	public static void doubleNumbersRepresentations(){
		double x = 5.6, y = 5.8, total=0.0;
		total = x+y;
		System.out.println("The total is "+total);//11.39999999999999999999999999999

		BigDecimal bdx = new BigDecimal(x);
		BigDecimal bdy= new BigDecimal(y);
		BigDecimal bdtotal = bdx.add(bdy);
		System.out.println("BigDecimal total is "+bdtotal);//11.39999999999999999999999999999

		//hardcoded string - worked
		BigDecimal bdx2 = new BigDecimal("5.6");
		BigDecimal bdy2= new BigDecimal("5.8");
		BigDecimal bdtotal2 = bdx2.add(bdy2);
		System.out.println("BigDecimal total is "+bdtotal2);//11.4

		//converting from primitive double to Double wrapper
		//class so that we can convert to string
		BigDecimal bdx3 = new BigDecimal(new Double(x).toString() );
		BigDecimal bdy3 = new BigDecimal(Double.toString(y) );
		BigDecimal bdTotal3 = bdx3.add(bdy3);
		System.out.println("BigDecimal total3 is"+bdTotal3);

	}

	public static void switchEnumType(){
		Direction theWay = null;
		System.out.print("Enter the direction (n|s|e|w): ");
		String nsew = sc.next().toUpperCase();
		boolean ok = true;

		switch(nsew){
		case "N":
			theWay=Direction.NORTH;
			break;
		case "S":
			theWay=Direction.SOUTH;
			break;
		case "E":
			theWay=Direction.EAST;
			break;
		case "W":
			theWay=Direction.WEST;
			break;
		default:
			System.out.println(nsew+" is not valid.");
			ok = false;
			break;
		}
		if(ok){
			switch(theWay){
			case NORTH:
				System.out.println("Santa");
				break;
			case SOUTH:
				System.out.println("Penguins");
				break;
			case EAST:
				System.out.println("The land of the rising sun.");
				break;
			case WEST:
				System.out.println("Hollywood");
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}
	
	public static void switchVowelOrConsanant(){
		System.out.print("Enter letter: ");
		String letter = sc.next();

		switch (Character.toUpperCase(letter.charAt(0)) ){
		case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println(letter.charAt(0) +": Vowel");
			break;
		default:
			System.out.println(letter+" is a constanant");
			break;
		}
	}

	public static void switchComparisonBM(){
		int x = getInt("Enter x: ");
		int y = getInt("Enter y: ");
		String mathOp = getString("Enter operator (lt|gt|eq): ");
		evaluate(x,y,mathOp);
	}

	public static int getInt(String prompt){
		boolean ok = false;
		int inputFromUser = 0;
		while (!ok){
			System.out.print(prompt);
			if(sc.hasNextInt()){
				inputFromUser = sc.nextInt();
				ok = true;
			}else{
				System.out.println("Error! Invalid input try again!");
			}
			sc.nextLine(); //disregard any other data on the line
		}
		return inputFromUser;
	}

	public static String getString(String prompt){
		System.out.print(prompt);
		return sc.next().toUpperCase();
	}

	public static void evaluate(int x, int y, String comparisonToBePerformed){
		switch(comparisonToBePerformed){
		case "LT":
			System.out.println(x < y ? x + " is < " + y : x + " is not < " + y);
			break;
		case "GT":
			System.out.println(x > y ? x + " is > " + y : x + " is not > " + y);
			break;
		case "EQ":
			System.out.println(x == y ? x + " is == " + y : x + " is not == " + y);
			break;
		default:
			System.out.println(comparisonToBePerformed + " is not a recognised input");
			break;
		}
	}

	public static void switchComparison(){
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		System.out.print("Enter operator (lt|gt|eq): ");
		String mathOp = sc.next().toUpperCase();

		switch(mathOp){
		case "LT":
			if(x < y){
				System.out.println(x + " is < " + y);
			}else{
				System.out.println(x + " is not < " + y);
			}
			break;
		case "GT":
			if(x < y){
				System.out.println(x + " is > " + y);
			}else{
				System.out.println(x + " is not > " + y);
			}
			break;
		case "EQ":
			if(x == y){
				System.out.println(x + " is == " + y);
			}else{
				System.out.println(x + " is not == " + y);
			}
			break;
		default:
			System.out.println(mathOp + " is not a recognised input");
			break;
		}

	}

	public static void turnaryOperator(){
		boolean isHappy = true;

		String mood = isHappy? "Happy":"sad";

		System.out.println(mood);
	}

	public static void compareStrings(){
		//		System.out.print("Enter s1: ");
		//		String s1 = sc.next();
		//		System.out.print("Enter s2: ");
		//		String s2 = sc.next();

		//		System.out.println("Scanner == " + s1.equalsIgnoreCase(s2));

		String name1 = "John";
		String name2 = new String("John");

		System.out.println("Scanner == " + (name1==name2));
		System.out.println("Scanner == " + name1.equalsIgnoreCase(name2));

		String name3 = new String("John");
		String name4 = new String("John");

		System.out.println("Scanner == " + (name3==name4));
		System.out.println("Scanner == " + name3.equalsIgnoreCase(name4));

		String sean1 = "sean";
		String sean2 = "sean";

		System.out.println("Scanner == " + (sean1==sean2));

		String paul1 = "paul";
		String paul2 = new String("paul").intern();

		System.out.println("Scanner == " + (paul1==paul2));


		String dogName1 = sc.next().intern();
		String dogName2 = sc.next().intern();

		System.out.println("Scanner == " + (dogName1==dogName2));
	}
	
	public static void preAndPostDifference(){
		int x = 5;
		int y = 10;

		System.out.println("Value of x is : " + x);
		System.out.println("Value of ++x is : " + ++x);
		System.out.println("Value of x++ is :" + x++);
		System.out.println("Value of x is : " + x +"\n\n\n");

		System.out.println("Value of y is : " + y);
		System.out.println("Value of --y is : " + --y);
		System.out.println("Value of y-- is :" + y--);
		System.out.println("Value of y is : " + y);
	}
	
	public static void compareTwoValues(){
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();

		if(x>y){
			System.out.print(x +" > "+ y);
		}
		else if(x<y){
			System.out.println(y+" > "+x);
		}
		else{
			System.out.println(x+ " == "+ y);
		}
	}
	
	public static void simpleCalcsShortHand(){
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();

		int sum = x,dif = x,product = x,divide = x;

		sum+=y;
		dif-=y;
		product*=y;
		divide /=y;

		System.out.println("The sum of "+ x + " and " + y +" is : "+ sum);
		System.out.println("The differnce between "+ x + " and " + y +" is : "+ dif);
		System.out.println("The product of "+ x + " and " + y +" is : "+ product);
		System.out.println("The quotient of "+ x + " and " + y +" is : "+ divide);
	}
	
	public static void simpleCalcs(){
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();

		int sum = x+y;
		int product = x*y;
		int dif = x-y;
		int divide = x/y;

		System.out.println("The sum of "+ x + " and " + y +" is : "+ sum);
		System.out.println("The differnce between "+ x + " and " + y +" is : "+ dif);
		System.out.println("The product of "+ x + " and " + y +" is : "+ product);
		System.out.println("The quotient of "+ x + " and " + y +" is : "+ divide);
	}
}
