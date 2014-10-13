//5 Determine given code and their outputs
public class Operators {
	public static void main(String[] args) {
		int x=0, w=0, y=0, z=0;
		
		x=4;
		System.out.println(++x);//5
		System.out.println(x++);//5
		System.out.println(x);//6
		System.out.println(--x);//5
		System.out.println(x--);//5
		System.out.println(x);//4
		
		w=20;x=10;y=-5;z=0;
		System.out.println(w == x && y != z);//false
		System.out.println(w == x || y != z);//true
		System.out.println(!(w == (x+z)));//true
	}

}
