class Rock{
	public Rock(){
		System.out.println("Create a Rock...");
	}
	public Rock(int i){
		System.out.println("Create a Rock..."+i);
	}
}
//only one public class per file and the file name must be the same name as the public class name
public class SimpleConstructor2014 {
//if you provide no constructor (ctor) then java provides a default one with no arguments
	public static void main(String[] args) {
		System.out.println("Before for loop");
		for(int i=1; i<=5; i++){
			new Rock(i);
		}
		System.out.println("After for loop");
		
	}//
}//
