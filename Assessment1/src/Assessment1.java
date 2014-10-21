//Alan Heung A00226316 21/10/2014
import java.util.Scanner;

public class Assessment1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//number1();
		//number2();
		//number3();
		number4();
	}

	public static void number1(){
		//declare variables
		double shippingBase = 0.0;
		//ask user for entry
		System.out.print("Please enter a shipping method (UPS/FEDEX): ");
		String shippingMethod = sc.next();
		System.out.print("Please enter a weight eg.(1 for 1kg): ");
		double weight = sc.nextDouble();
		//calc if user has entered UPS or Fedex
		if(shippingMethod == "UPS"){
			if(weight <= 5){
				shippingBase = 4.95;
			}else if(weight >=10){
				shippingBase = 7.95;
			}else if(weight > 10){
				shippingBase = 10.95;
			}
		}else if(shippingMethod == "FEDEX"){
			shippingBase = 7.95;
		}else{
			shippingBase = 9.95;
		}
		//Display output
		System.out.print("The price of shipping is " + shippingBase);

	}
	public static void number2(){
		//declare variables
		String map ="";
		int index = 0;
		//ask user for entry
		System.out.print("Please enter one of the following letters(A/B/G/D/E/S/O): ");
		char c = sc.next().charAt(0);
		//try to catch errors between two switch statements
		try{
			//first switch to calc map and index
			switch(c){
				case 'A': map = "A maps to"; index = 1;
				break;
				case 'B': map = "B maps to"; index = 2;
				break;
				case 'G': map = "G maps to"; index = 3;
				break;
				case 'D': map = "D maps to"; index = 4;
				break;
				case 'E': map = "E maps to"; index = 5;
				break;
				case 'S': map = "S maps to"; index = 18;
				break;
				case 'O': map = "O maps to"; index = 24;
				break;
				default: map =""+" Invalid input";
				break;
			}
			//System.out.println(map+" "+index);
			// second switch for calc the greek value
			switch(index){	
				case 1: map = "ALPHA";
				break;
				case 2: map = "BETA";
				break;
				case 3: map = "GAMMA";
				break;
				case 4: map = "DELTA";
				break;
				case 5: map = "EPSILON";
				break;
				case 18: map = "SIGMA";
				break;
				case 24: map = "OMEGA";
				break;
				default: map = index + " unable to match";
				break;
			}
			//print out results
			System.out.println(c+" maps to: "+ map+ " ");
		}catch(Exception e){//catches exception if user enters wrong value
			System.out.println(c + " is an invalid input");
			e.printStackTrace();
		}
	}

	public static void number3(){
		outerloop://continues loop here
		for(int l = 1; l<5; l++){//for loop for length and display
			System.out.print("Length == "+l+" ");
			for(int w = 1; w<5; w++){//for loop for width and display
				System.out.print("Width == "+w+" ");
				for(int a = 0; a<=4; a++){// for loop to calc area and display
					System.out.println("Area == "+ w*l);
					continue outerloop;
				}
			}
		}
	}

	public static void number4(){
		//declare variables
		int total = 0;
		//for loop that starts at 45 and decreases in 5s
		for(int i=45;i>5;i-=5){	
			if(i != 50 || i !=5){// to remove the 50 and 5 values
				total = total + i;//keeps the total of each loop value and adds them
				System.out.print(i+" + ");
			}
			if(i == 10){// to eliminate the last + (possible to put = here)
				System.out.print(i+" ");
			}
		}
		//display the total
		System.out.print("= " +total);
	}
}
