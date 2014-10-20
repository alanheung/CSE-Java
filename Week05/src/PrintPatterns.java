
public class PrintPatterns {
	public static void main(String[] args) {
		pattern1();
	}
	public static void pattern1(){
		for(int i = 1; i <= 5; i++){
			for(int j = 0; j < i; j++){
				System.out.print("O ");
			}
			for(int j = 0; j < 5 - i; j++){
				System.out.print(". ");
			}
			System.out.println();
		}
	}
}
