import java.util.Scanner;

public class StudentGrade{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please enter grade: ");
		int grade = sc.next().charAt(0);
	}

	public int StudentGrade(int x){
		if(x >= 85 && x <=100 ){
			return 'A';		
		}else if(x >= 70 && x <85){
			return 'B';		

		}else if(x >= 55 && x <70){
			return 'C';		

		}else if(x >= 40 && x <55){
			return 'D';		

		}else if(x >= 25 && x <40){
			return 'E';		

		}else if(x < 25){
			return 'F';		

		}else{
			return x;
		}
	}
}
