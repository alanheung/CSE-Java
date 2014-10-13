//2. Write a program called AlgebraicExpression. This program is based on the
//expression y=ax3+ 7. Initialise x to 2 and a to 3. Using parentheses where needed
//ensure y evaluates to the following: 31 (the normal evaluation); 108 and 66.
public class AlgebraicExpression {
	public static void main(String[] args) {
		int x = 2;
		int a = 3;
		int y = 0;
		System.out.println(  y = a * x * x * x + 7  ); // 31
		System.out.println(  y = a * x * x * (x + 7)  ); //108
		System.out.println(  y = a * x * (x * x + 7)  ); //66
	}

}
