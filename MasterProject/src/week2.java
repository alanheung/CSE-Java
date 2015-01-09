
public class week2 {

	public static void main(String[] args) {
		long l1 = 2_147_000_000; 
		//long l2 = 2_148_000_000;
		long l3 = 2_148_000_000L;
		//float f1 = 2.3; 
		float f2 = 2.3f;
		
		double d1 = 2.3;
		double d2 = 2.3f;
		
		int x = 14;
		int y = 8;
		
		int res1 = x--;//only initialized here so  x-- has no effect 
		//and shows 14 but x = 14 -1 = 13
		
		System.out.println("res1 == " + res1);//14
		System.out.println("x == " +x);//13
		System.out.println("res1 == " + res1);//14

		
		int res2 = --x;
		System.out.println("res2 == " + res2);//12
		System.out.println("x == " +x);//12
		
		char c = 67;
		
		System.out.println("c == " + c);//C
		c++;
		System.out.println("c == " + c);//D
		System.out.println("c == " +(int)c);//68
		
		//char range is 0....65535
		//c = -4;
		//c = 66_000;
		c = 65_535;
		System.out.println("c ==" + c);//unprintable character
		c = 63;
		System.out.println("c ==" + c);//?
	}

}
