import java.util.Scanner;

public class StringComparison {
	
	public static void main(String[] args) {
		//usingScanner();
		usingNewOnce();
		//usingNewTwice();
		//interningTheStringLiteral();
	}
	
	public static void interningTheStringLiteral(){
	//declare a string s1 assign it to string literal sean
		String s1 ="sean";//interned
		String s2 ="sean";//referred to the interned string literal
		System.out.println("interningTheStringLiteral : using == returns "+ (s1==s2) );	//true // no brackets returns false
		System.out.println("interningTheStringLiteral : using equals() returns "+ (s1.equals(s2)) ); //true
		//true string literals, no second sean created, both s1 and s2 point to the same "sean"
	}
	
	public static void usingNewTwice(){
		String name1 = new String("john");
		String name2 = new String("john");

		System.out.println("usingNewTwice : using == returns "+ (name1==name2));//false
		System.out.println("usingNewTwice : using equals() "+ (name1.equals(name2)) );//true
	}

	public static void usingNewOnce(){
		String name1 = "john";
		//String name2 = new String("john");// "==" returns false
		String name2 = new String("john").intern();//returns true uses .intern
		System.out.println("usingNewOnce : using == returns "+ (name1==name2));//false
		System.out.println("usingNewOnce : using equals() "+ (name1.equals(name2)) );//true
	}

	public static void usingScanner(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.next();
		System.out.println("Enter string 2: ");
		String s2 = sc.next();
		
		System.out.println("Scanner : using == returns "+ (s1==s2) );//false
		System.out.println("Scanner : using equals() returns "+ s1.equals(s2) );//true
	}
}

	

