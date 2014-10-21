import java.util.Scanner;

public class IfExercises {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unindentedIf1();
		//unindentedIf2();
		//ifMonth();
		//iflargerOfTwoNumbers();
		//ifGrade();
		//ifTemperature();
		//ifLargest();
		//ifLargest2();
		ternaryOperator();
        
		
		//System.out.println("in main() 1... ");
        //someMethod();
        //System.out.println("in main() 2... ");
	}
	public static void ternaryOperator(){
        boolean isHappy=true;
        String mood = isHappy ? "Im Happy!" : "Im Sad!";
        System.out.println(mood);		

        int x=0, y=0, minVal=0;
        System.out.print("Enter x : ");
        x = sc.nextInt();
        System.out.print("Enter y : ");
        y = sc.nextInt();

        minVal = x < y ? x : y; 
        System.out.println("minVal == "+minVal);
		
	}

	public static void ifGrade(){
            int mark=0;
            System.out.print("Enter mark : ");
            try{
                mark = sc.nextInt();

                if(mark < 0 || mark > 100){
                        System.out.println("Error in input: "+mark+". Valid values are 0..100");
                }else{
                        // valid mark value
                        if(mark >= 70 && mark <= 100) 
                                System.out.println("A");
                        else if(mark >= 60 && mark <= 69)
                                System.out.println("B");
                        else if(mark >= 50 && mark <= 59)
                                System.out.println("C");
                        else if(mark >= 40 && mark <= 49)
                                System.out.println("D");
                        else
                                System.out.println("Fail");
                }
            }catch(Exception e){
                System.out.println("Exception caught");
                e.printStackTrace();
            }
	}
	public static void iflargerOfTwoNumbers(){		
		int x=0, y=0;
		try{
			// code to be protected
	        System.out.print("Enter first number : ");
	        x = sc.nextInt();
	        System.out.print("Enter second number : ");
	        y = sc.nextInt();
	        
	        if(x < 0 || y < 0){ // if either is negative, error
	        	System.out.println("Negative values are not allowed; "+ x + " "+y);
	        } else if (x > 0 && y > 0) { // both are positive
	        	// which of the two is the larger?
	        	if(x > y)
	            	System.out.println(x + " is > "+y);
	        	else if (y > x)
	            	System.out.println(y + " is > "+x);
	        	else
	            	System.out.println(y + " == "+x);
	        } 
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		
	}
	public static void someMethod(){
		System.out.println("in someMethod()... ");
	}
	public static void ifLargest2(){
		int num1=0, num2=0, num3=0;
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        num3 = sc.nextInt();

        // Largest		
		if (num1 > num2){	// num1 > num2 => either num1 or num3 is the largest
			if (num1 > num3)
				System.out.println(num1 + " is the largest number");
			else
				System.out.println(num3 + " is the largest number");
		}		
		else{	// num2 > num1 => either num2 or num3 is the largest
			if (num2 > num3)
				System.out.println(num2 + " is the largest number");
			else
				System.out.println(num3 + " is the largest number");
		}
		// Smallest
		if (num1 < num2){	// num1 < num2 => either num1 or num3 is the smallest
			if (num1 < num3)
				System.out.println(num1 + " is the smallest number");
			else
				System.out.println(num3 + " is the smallest number");
		}
		else{	// num2 < num1 => either num2 or num3 is the smallest
			if (num2 < num3)
				System.out.println(num2 + " is the smallest number");
			else
				System.out.println(num3 + " is the smallest number");
		}

	}
	public static void ifLargest(){
		try{
			int num1=0, num2=0, num3=0;
	        System.out.print("Enter first number : ");
	        num1 = sc.nextInt();
	        System.out.print("Enter second number : ");
	        num2 = sc.nextInt();
	        System.out.print("Enter third number : ");
	        num3 = sc.nextInt();
	        
	        if (num1 >= num2 && num1 >= num3){
	        	System.out.println(num1 + " is the largest number");
	        }else if (num2 >= num3 && num2 >= num1) {
	        	System.out.println(num2 + " is the largest number");
	        }else if (num3 >= num1 && num3 >= num2){
	        	System.out.println(num3 + " is the largest number");
	        }
		}catch(Exception e){
        	System.out.println("Exception caught...");
        	e.printStackTrace();
		}
	        

	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        // compare...
//	        if (num1 > num2 && num1 > num3){
//	        	System.out.println(num1 + " is the largest number");
//	        }else if (num2 > num3 && num2 > num1) {
//	        	System.out.println(num2 + " is the largest number");
//	        }else if (num3 > num1 && num3 > num2){
//	        	System.out.println(num3 + " is the largest number");
//	        }else if(num1==num2 && num1==num3){ // all numbers are equal
//	        	System.out.println("All numbers are equal...");			
//	        }else if(num1==num2){// num1 == num2
//	        	if(num1 > num3){ 
//	        		System.out.println(num1+" is the largest");			
//	            }else{
//	                System.out.println(num3+" is the largest");			
//	            }
//	        }else if(num1==num3){ // num1 == num3 	
//	        	if(num1 > num2){ 
//	        		System.out.println(num1+" is the largest");			
//	            }else{
//	                System.out.println(num2+" is the largest");			
//	            }
//	        }else if(num2==num3){ // num2 == num3
//	        	System.out.println(num2+" is the largest");			
//	            if(num2 > num1){ 
//	            	System.out.println(num2+" is the largest");			
//	            }else{
//	                System.out.println(num1+" is the largest");			
//	            }
//	        }
//		}catch(Exception e){
//        	System.out.println("Exception caught...");
//        	e.printStackTrace();
//		}
		
		// Smallest
//		if (num1 < num2 && num1 < num3)
//			System.out.println(num1 + " is the smallest number");
//		else if (num2 < num3 && num2 < num1)
//			System.out.println(num2 + " is the smallest number");
//		else
//			System.out.println(num3 + " is the smallest number");

	}
	public static void ifTemperature(){
		int temperature		= 0;
		final int VERY_COLD_MIN = -10;
		final int VERY_COLD_MAX =  2;
		final int COLD_MAX      =  9;
		final int MILD_MAX 	= 14;
		final int WARM_MAX 	= 20;
		final int VERY_WARM_MAX = 27;
		final int HOT_MAX	= 31;

        System.out.print("Enter temperature : ");
        try{
            temperature = sc.nextInt();
            if(temperature >= VERY_COLD_MIN && temperature <= VERY_COLD_MAX){  // -10 to +2
            	System.out.println("Very Cold");
            }
            else if (temperature > VERY_COLD_MAX && temperature <= COLD_MAX){ // 3..9
            	System.out.println("Cold");
            }
            else if (temperature > COLD_MAX && temperature <= MILD_MAX){ // 10..14 
            	System.out.println("Mild");
            }
            else if (temperature > MILD_MAX && temperature <= WARM_MAX){ // 15..20 
            	System.out.println("Warm");
            }
            else if (temperature > WARM_MAX && temperature <= VERY_WARM_MAX){ // 21..27 
            	System.out.println("Very warm");
            }
            else if (temperature > VERY_WARM_MAX && temperature <= HOT_MAX){ // 2    8..31 
            	System.out.println("Hot");        
            }
            else{
            	System.out.println("Extreme Temperature!");        
            }
        } catch(Exception e){
        	System.out.println("Exception caught...");
        }
		
	}
	public static void ifMonth(){
		int month=0;

//		Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        try{
	        month = sc.nextInt();
	        if(month == 1)
	        	System.out.println("January");
	        else if(month == 2)
	        	System.out.println("February");
	        else if(month == 3)
	        	System.out.println("March");
	        else if(month == 4)
	        	System.out.println("April");
	        else if(month == 5)
	        	System.out.println("May");
	        else if(month == 6)
	        	System.out.println("June");
	        else if(month == 7)
	        	System.out.println("July");
	        else if(month == 8)
	        	System.out.println("August");
	        else if(month == 9)
	        	System.out.println("September");
	        else if(month == 10)
	        	System.out.println("October");
	        else if(month == 11)
	        	System.out.println("November");
	        else if(month == 12)
	        	System.out.println("December");
	        else
	        	System.out.println("Entry is out of range: "+month);
        }catch(Exception e){
        	System.out.println("Exception!");
        	e.printStackTrace();
        }
        
//        try{
        	//some piece of code
//        }catch(Exception e){
        	// execute this when we get an exception
//        }
        	

	}
	
	public static void unindentedIf1(){
		int x=5;
		int y=8;

		// Given the following unindented code, use only indentation and braces
		// to get the desired output. Indentation just helps with clarity.
		if ( y == 8 )
		if ( x == 5 )
    	System.out.println("@@@@@");
    	else
    	System.out.println("#####");
	
		System.out.println("$$$$$");
		System.out.println("&&&&&");

		// a. Output required :
		//		@@@@@
		//		$$$$$
		//		&&&&&

		// b. Output required :
		//		@@@@@
		
		// c. Output required :
		//		@@@@@
		//		&&&&&

		// d. Output required (note: set y to be 7 for this one):
		//		#####
		//		$$$$$
		//		&&&&&
	}

	public static void unindentedIf2(){
		int x=9, y=11;
		// Given the following unindented code, use only indentation and {} to get the correct output
		if ( x < 10 ) 
		if ( y > 10 ) 
		System.out.println("*****"); 
		else 
		System.out.println("#####"); 
		System.out.println("$$$$$"); 

		// a. Output required :
		//*****
		//$$$$$

		// b. Output required (set x to 11 and y to 9):
		//#####
		//$$$$$
		
	}

}
