import java.util.Scanner;
//1.In a method called thirdOrderPolynomial(), calculate the third order 
//polynomial of x (the formula is fx = ax3 + bx2 + cx + d. Get the coefficients (a,b,c and d) from the user. 
//Inside a while loop, ask the user for x. Calculate the fx value and output the result. Ask the user if he/she wished to continue. 
//Note: all types are double.
//pass a b c d from main to the thirdOrderPolynomial method
//2. in method whileaverage calc the average if n numbers based on the user inputs
//use while loop, loop for iterations get num from user when loop is finished calc 
//the average without losing decimal
//3.In a method called whileGrades(), code a while loop that asks the user for a grade (a-f). Use the toLowerCase() method to deal 
//with lowercase letters only. Count up the number of A�s, B�s, C�s, D�s, E�s and F�s entered. �x� or �X� exits the loop. 
//After the loop exits, output the count of each grade.
//4.In a method called whileHistogram(), ask the user for the number of rows and columns. Using while loops, output a 
//histogram i.e. if rows is 3 and columns is 4, then output 3 rows, each row containing 4 stars each.
//5. in method whileLargestSmallest(), use a while loop to ascertain the largest and smallest numbers in a sequence
//of n numbers, where n is input by the user. output the largest and smallest numbers at the end.
//6. Write method whileSales() that uses a while loop to calc a persons monthly salary
//salary = 3000 euros + 9% of users inputed sales figure. exit loop when -1 is entered
//7.whileSquares()
//8.whileAverageSentinel(); Using a while loop enter numbers until the sentinel -1 is entered
//when the loop is finished calc the average of the numbers entered or no numbers were entered at all

public class WhileExercises {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.print("Please enter first number: ");
//		double a = sc.nextDouble();
//		System.out.print("Please enter second number: ");
//		double b = sc.nextDouble();
//		System.out.print("Please enter third number: ");
//		double c = sc.nextDouble();
//		System.out.print("Please enter fourth number: ");
//		double d = sc.nextDouble();
//		
//		thirdOrderPolynomial(a,b,c,d);
		//whileAverage();
		//whileGrades();
		//whileHistogram();
		//printGrid();
		//whileLargestSmallest();
		//whileSales();
		//whileSquares();
		whileAverageSentinel();
	}
	
	public static void whileAverageSentinel(){
		int avg=0, count=0, total=0;
		System.out.print("Please enter a number(-1 to exit): ");
		int n = sc.nextInt();
		while(n != -1){	
			total += n;
			System.out.print("Please enter a number(-1 to exit): ");
			n = sc.nextInt();
			count++;
		}
		avg = total/count;
		System.out.print("The average of the numbers are "+ avg);
	}

	public static void whileSquares(){
		int i=1, n=0, total=0, square=0;
		System.out.print("Please enter n: ");
		n = sc.nextInt();
		while(i<=n){
			square = i * i;
			System.out.println("The square of "+i+ " is "+ square); 
			total+=square;
			++i;
		}
		System.out.println("The total is "+total);
	}
	public static void whileSales(){
		double salary =0, sales=0;
		System.out.print("Please enter sales (-1 to exit): ");
		sales = sc.nextDouble();
		
		while(sales != -1){
			salary = 3000 +(sales*0.09);
			System.out.println("Salary is "+salary+" euros");
			System.out.println("Please enter sales (-1 to exit): ");
			sales = sc.nextDouble();
		}
	}

	public static void whileLargestSmallest(){
		int lNum = 0, sNum = 0, i=1, n=0, number=0;
		boolean someNumberEntered = false;
		
		System.out.print("Please enter n: ");
		n = sc.nextInt();
		//piece meal fashion, bit by bit development
		while(i<=n){//create counter i
			//System.out.println(i);
			someNumberEntered = true;
			System.out.print("Please enter a number: ");
			number = sc.nextInt();
			//n negative numbers would leave 0 as the incorrect largest number
			if(i==1){//very first number
				sNum = number;
				lNum = number;
			}else if(number > lNum){
				lNum = number;
			}else if(number < sNum){
				sNum = number;
			}
			i++;
		}
		if(someNumberEntered){
			System.out.println("The largest number you entered was: "+lNum);
			System.out.println("The smallest number you entered was: "+sNum);
		}else{//error
			System.out.println("n is invalid: "+n);
		}

	}

	public static void whileHistogram(){
		System.out.print("Please enter a number for columns: ");
		int col = sc.nextInt();
		System.out.print("Please enter a number for rows: ");
		int row = sc.nextInt();
		int i=0, j=0;
		while (i<row){
			while (j<col){
				System.out.print(" * ");
				j++;
			}
			System.out.println(" ");
			i++;
			j=0;
		}
	}
	
	public static void printGrid(){
		System.out.print("Please enter a number for rows: ");
		int row = sc.nextInt();
		System.out.print("Please enter a number for columns: ");
		int col = sc.nextInt();
		for ( int i = 0 ; i < row ; i++ ){
			// PRINT a row
			for ( int j = 0 ; j < col ; j++ ){
				System.out.print( " * " ) ;
			}
			// PRINT newline
			System.out.println( " " ) ;
		}
	}
	
	public static void whileGrades(){
		int A, B, C, D, E, F;
		int ATotal = 0,BTotal= 0,CTotal= 0,DTotal= 0,ETotal= 0,FTotal= 0; 
		System.out.print("Please enter a letter from a-f: ");
		char c = sc.next().toLowerCase().charAt(0);
		//alternative while with nested switch statements
		while (c != 'x'){
			if(c == 'a'){
				ATotal += 1;
			}
			if(c == 'b'){
				BTotal += 1;
			}
			if(c == 'c'){
				CTotal += 1;
			}
			if(c == 'd'){
				DTotal += 1;
			}
			if(c == 'e'){
				ETotal += 1;
			}
			if(c == 'f'){
				FTotal += 1;
			}
			System.out.print("Please enter a letter from a-f: ");
			c = sc.next().toLowerCase().charAt(0);
		}	
		System.out.println("Total number of As: " + ATotal);
		System.out.println("Total number of Bs: " + BTotal);
		System.out.println("Total number of Cs: " + CTotal);
		System.out.println("Total number of Ds: " + DTotal);
		System.out.println("Total number of Es: " + ETotal);
		System.out.println("Total number of Fs: " + FTotal);
	}

	public static void whileAverage(){
		System.out.print("Please enter a number for the sequence: ");
		double n = sc.nextDouble();
		
		int count = 0;
		double total = 0.0;
		double num = 0.0;
		
		while (count<n){
			System.out.print("Please enter a number: ");
			num = sc.nextDouble();			
			total += num;
			count++;
		}
		System.out.println(total);
		System.out.println("The average of the numbers: " + total/count);
	}
	
	public static void thirdOrderPolynomial(double a,double b,double c,double d){//note a b c d can be double q,double w,double e,double r
//			System.out.print("Please enter first number: ");
//			double a = sc.nextDouble();
//			System.out.print("Please enter second number: ");
//			double b = sc.nextDouble();
//			System.out.print("Please enter third number: ");
//			double c = sc.nextDouble();
//			System.out.print("Please enter fourth number: ");
//			double d = sc.nextDouble();
			char choice = 'y';
			while (choice == 'y'){//while(repeat.equalsIngnoreCase("y")){
				System.out.print("Please enter x: ");
				double x = sc.nextDouble();
				System.out.println("The third order polynomial of " + (int)x +" is "+ (a*x*x*x + b*x*x + c*x + d));
				System.out.print("Would you like to continue? y/n ");
				choice = sc.next().charAt(0);
			}
			System.out.print("Invalid input ");
	 }
}
