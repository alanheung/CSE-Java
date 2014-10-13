
public class Scope {
	public static void main(String[] args) {
		int a = 1;
		// b=8; //error
		
		int b =0;
		{//new block (i.e. scope)
			a=3;
			b=4;
			
			int c = 0;
			
			{
				a=6;
				//int c = 9;//error
				{
					b=9;
					c=9;
				}
				c=8;
			}
			c=7;
		}
		//c=7; //error
		a=4;
		b=4;
		add(a,b);
	
		int result = add2(5,9);
		System.out.println("main::result == "+result);//result
		
		System.out.println("main == "+add2(1,3));
		
	}
	public static void add(int a, int b){// a and b can be named anything, doesnt have to correspond to the main
		int answer = a+b;
		System.out.println("add::answer == "+ answer);	
	}
	public static int add2(int a, int b){
		System.out.println("inside add2()");	
		return a+b;//returns the result
	}
	
	
}
