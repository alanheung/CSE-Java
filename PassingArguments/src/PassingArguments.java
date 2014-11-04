//Java uses call-by-value only
//However, if you are passing a reference (to an array or an object,)
//the effect is similar to call-by-reference i.e. the called method 
//can change the object/array in the calling method.
class Watch{
	private int theNumberOfHands;
	public Watch(){
		theNumberOfHands=2;
	}
	public void setTheNumberOfHands(int theNumberOfHands) {
		this.theNumberOfHands = theNumberOfHands;
	} 
	public int getTheNumberOfHands() {
		return theNumberOfHands;
	}
}//
public class PassingArguments {

	public static void main(String[] args) {
		//1.Pass in a variable of a primitive type
		//e.g. an int. Result no change.
		int a=10;
		System.out.println("Primitive before == "+a);
		primitiveExample(a);
		System.out.println("Primitive after == "+a);
		
		double d = 55.6;
		System.out.println("Primitive before == "+d);
		primitiveExample2(a);
		System.out.println("Primitive after == "+d);
		
		//2.Pass in a reference to an object
		Watch rolex = new Watch();
		System.out.println("The number of hands before: "+rolex.getTheNumberOfHands());
		objectReferenceExample(rolex);
		System.out.println("The number of hands after: "+rolex.getTheNumberOfHands());
		
		//3.Pass in an array (an array reference to be exact!)
		int []ia = {1,2,3,4,5};
		for(int i=0; i<ia.length; i++){
			System.out.println("ia ["+i+"] == "+ ia[i]);
		}
		for(int i:ia){//enhanced for loop, for each int 'i' in the array 'ia'
			System.out.println(i);
		}
		
		fullArrayExample(ia);//pass down the array reference
		
		for(int i:ia){
			System.out.println(i);
		}
		
		System.out.println("ia[0] before "+ ia[0]);
		ArrayElementExample(ia[0]);
		System.out.println("ia[0] before "+ ia[0]);

		String name ="Alan";
		System.out.println(name);//displays alan
		stringExample(name);
		System.out.println(name);//stays as alan because it is imutable
		name = "Heung";
		System.out.println(name);// not changed, creates a new memory location, original alan is not used, thats why heung is displayed

	}//end
	public static void stringExample(String n){
		n="Bill";//doesnt change alan to bill
	}
	public static void ArrayElementExample(int x){
		x=999;
	}
	public static void fullArrayExample(int []array){
		for(int i=0; i<array.length; i++){
			array[i]*=2;//array[i] = array[i] * 2;
		}
//		for(int i:array){
//			System.out.println(i*2);
//		}
	}
	public static void objectReferenceExample(Watch watch){
		watch.setTheNumberOfHands(1);
	}
	public static void primitiveExample(int x){
		//x is a copy of a from main
		x=50;
		method1(x);
		System.out.println("Method1 == "+x);
	}
	public static void method1(int x){
		//x is a copy of d from main
		x=150; 
	}
	public static void primitiveExample2(double x){
		//x is a copy of d from main
		x=150.9; 
	}
}//end
