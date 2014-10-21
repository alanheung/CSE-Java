import java.util.Scanner;

public class Assessment1Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//number1();
		number2();
		//number3();
//		int result = number4(50,5);
//		System.out.print("= "+result);

	}
	public static void number1(){
		//declare variables
		double shippingBase = 0.0;
		double weight = sc.nextDouble();
		//ask user for entry
		System.out.print("Please enter a shipping method (UPS/FEDEX): ");
		String shippingMethod = sc.next().toUpperCase();
		System.out.print("Please enter a weight eg.(1 for 1kg): ");
		//calc if user has entered UPS or Fedex
		if(shippingMethod.equals("UPS")){
			if(weight <= 5){
				shippingBase = 4.95;
			}else if(weight >=10){
				shippingBase = 7.95;
			}else if(weight > 10){
				shippingBase = 10.95;
			}
		}else if(shippingMethod.equals("FEDEX")){
			shippingBase = 7.95;
		}else{
			shippingBase = 9.95;
		}
		//Display output
		System.out.print("The price of shipping is " + shippingBase);

	}
	public static void number2(){
		String map ="";
		int index = 0;
		System.out.print("Please enter one of the following letters(A/B/G/D/E/S/O): ");
		char c = sc.next().toUpperCase().charAt(0);
		boolean inputIsOK = true;
		switch(c){
			case 'A': map = "A maps to "; index = 1;
				break;
			case 'B': map = "B maps to "; index = 2;
				break;
			case 'G': map = "G maps to "; index = 3;
				break;
			case 'D': map = "D maps to "; index = 4;
				break;
			case 'E': map = "E maps to "; index = 5;
				break;
			case 'S': map = "S maps to "; index = 18;
				break;
			case 'O': map = "O maps to "; index = 24;
				break;
			default: System.out.println("Invalid input "+c);
				inputIsOK = false;//boolean become false
				break;
		}
		if(inputIsOK){		
			final int ALPHA=1, BETA=2, GAMMA=3, DELTA=4, EPSILON=5, SIGMA=18, OMEGA=24;
			switch(index){//second switch
				case ALPHA: map += "ALPHA";
					break;
				case BETA: map += "BETA";
					break;
				case GAMMA: map += "GAMMA";
					break;
				case DELTA: map += "DELTA";
					break;
				case EPSILON: map += "EPSILON";
					break;
				case SIGMA: map += "SIGMA";
					break;
				case OMEGA: map += "OMEGA";
					break;
				default: System.out.println("Unable to match "+index);
					break;
			}//switch
			System.out.println(map);
		}//if
	}

	public static void number3(){
		outer://continues loop here
		for(int l = 1; l<=3; l++){//for loop for length and display
			for(int w = 1; w<=3; w++){//for loop for width and display
					System.out.println("Length == "+l+" "+"Width == "+w+" "+"Area == "+ (w*l));
					if(l ==2 && w==2)
						break outer;
			}
		}
	}

	public static int number4(int from, int to){
		//declare variables
		int total = 0;
		//for loop that starts at 45 and decreases in 5s
		for(int i=(from-5);i>to;i-=5){	
			if(i != 50 || i !=5){// to remove the 50 and 5 values
				total = total + i;//keeps the total of each loop value and adds them
				System.out.print(i+" + ");
			}
			if(i == 10){// to eliminate the last + (possible to put = here)
				System.out.print(i+" ");
			}
		}
		//display the total
		//System.out.print("= " +total);
		return total;
	}
}

