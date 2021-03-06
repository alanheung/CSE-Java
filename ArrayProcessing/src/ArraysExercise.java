import java.util.Scanner;

public class ArraysExercise {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//		int []a={2,4,6};
		//		for(int i=0; i<a.length;i++){
		//			//a[i]*=2; // a[i] = a[i] * 2
		//			int value=a[i]*2;
		//		}
		////		for(int i=0; i<a.length;i++){
		////			System.out.println(a[i]);
		////		}
		//		
		//		int []b = {2,4,6};
		//		for(int value:b){
		//			value*=2;
		//		}
		//		for(int val:b){
		//			System.out.println(val);
		//		}
		studentGrades();
	}
	public static void studentGrades(){
		int [][]studentGrades = { 	{77,68,86,73},
				{96,87,89,78},
				{70,90,86,81}  };
		System.out.println("Values of array are: ");
		printArray(studentGrades);

		System.out.println("\n\nThe lowest grade is "+minimum(studentGrades));
		System.out.println("\n\nThe highest grade is "+maximum(studentGrades));

		// calculate the average for each student
		int row=1;
		for(int []student:studentGrades){
			switch(row){
			case 1: System.out.print("The average for the first student is ");
			break;
			case 2: System.out.print("The average for the second student is ");
			break;
			case 3: System.out.print("The average for the third student is ");
			break;
			}
			System.out.println(average(student));
			row++;
		}
	}
	public static double average(int []studentGrades){
		double total=0;

		for(int grade:studentGrades)
			total+=grade;

		return total/studentGrades.length;		
	}
	public static int maximum(int [][]grades){
		int maxGrade1=0, maxGrade2=0;

		for(int []student:grades){
			for(int grade:student){
				if(grade >maxGrade1)
					maxGrade1=grade;
			}
		}
		for(int student=0; student<grades.length; student++){
			for(int grade=0; grade<grades[student].length; grade++){
				if(grades[student][grade] > maxGrade2)
					maxGrade2 = grades[student][grade];
			}
		}
		if(maxGrade1 == maxGrade2)
			return maxGrade2;
		else{
			System.out.println("Error");
			return -1;
		}
	}
	public static int minimum(int [][]grades){
		int lowGrade=100;
		for(int []student:grades){
			for(int grade:student){
				if(grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}
	public static void printArray(int [][]grades){
		// enhanced-for loop to output the multi-dim array
		for(int []student:grades){
			for(int grade:student){
				System.out.print(grade + "\t");				
			}
			System.out.println();
		}
	}
}