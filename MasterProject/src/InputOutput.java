import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutput {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[]args){
//		System.out.println("Your full name is "+getName());
//
//		String[] name = new String[2];
//		getName(name);
//		for(String nameElement:name){
//			System.out.print(nameElement+" ");
//		}
//		int age = getAge("Please enter your age ");
//		System.out.println("Your age is "+ age);

		int age = getAge("Please enter your age: ","Jack");
		//		System.out.println("Your age is "+ age);

		if(checkPension(age)){
			System.out.println("You are eligible for the pension");
		}else{
			System.out.println("You are not eligible for the pension");
		}

		//scope
		{
			int ageStartedSchool=5;
			System.out.println("Age started school is " + ageStartedSchool);
			{
				int x=9;
				System.out.println(x);
				{
					x=88;
					int y=22;
					{
						y=9;
					}
					y=88;
				}
	//			y=3;//error y cannot be resolved to a variable
				System.out.println("Age started school is " + ageStartedSchool);
			}			
			System.out.println("Age started school is " + ageStartedSchool);
		}			
//		System.out.println("Age started school is " + ageStartedSchool);//error outside the scope

		for(int i=0; i <3; i++){
			i++;
		}
//		i=0;//error outside the loop
	}//


	public static boolean checkPension(int age){
		boolean pensionableAge = (age>= 65) ? true:false;//ternary operator
		return pensionableAge;
		//		if(age>=65){
		//			return true;
		//		}else{
		//			return false;
		//		}
	}

	public static int getAge(String prompt, String name){
		int age = 0;
		System.out.print("Hi there "+ name + " " +prompt);
		if(sc.hasNextInt()){
			age=sc.nextInt();
		}else{
			System.out.println("Error in the input");
			age=-1;
		}
		return age;
	}

	public static int getAge(String prompt){
		int age = 0;
		try{
			System.out.print(prompt);	
			age = sc.nextInt();
		}catch(InputMismatchException ime){
			ime.printStackTrace();
		}

		System.out.println(" here...");

		return age;
	}

	public static int getAge(){
		System.out.print("Please enter your age ");
		return sc.nextInt();
	}

	public static void getName(String[] nameArray){
		System.out.print("Please enter your first name ");
		nameArray[0]=sc.next();
		System.out.print("Please enter your last name ");
		nameArray[1]=sc.next();
	}

	public static String getName(){
		System.out.print("Please enter your full name ");
		String fullName = sc.nextLine();
		return fullName;
	}
}//