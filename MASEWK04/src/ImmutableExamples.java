
public class ImmutableExamples {
	public static void main(String[] args){
//		immutable();
		StringExample();
	}
	
	public static void immutable(){
		integerExample();
	}
	
	public static void StringExample(){
//		String name ="Alan";
//		String name2 ="Alan";// interned
//		System.out.println("name ref (before)== "+
//				Integer.toHexString(System.identityHashCode(name)));
//		System.out.println("name ref (before)== "+
//				Integer.toHexString(System.identityHashCode(name2)));
//		
//		name+=" Heung";
//		System.out.println("name ref (after)== "+
//				Integer.toHexString(System.identityHashCode(name)));
//		System.out.println("name == "+ name);
//		System.out.println("name2 ref (after)== "+
//				Integer.toHexString(System.identityHashCode(name2)));
//		System.out.println("name == "+ name2);

		String pet = "dog";
		System.out.println("pet ref (BEFORE)== "+
				Integer.toHexString(System.identityHashCode(pet)));
		System.out.println("pet before == "+ pet);
		
		pet = immutableString(pet);//pass in reference to method
//		immutableString(pet);
		
		System.out.println("pet ref (AFTER)== "+
				Integer.toHexString(System.identityHashCode(pet)));
		System.out.println("pet after == "+ pet);
	}
	
//	public static void immutableString(String petType){
	public static String immutableString(String petType){
		System.out.println("\tpetType ref (BEFORE)== "+
				Integer.toHexString(System.identityHashCode(petType)));
		petType = petType + " named spot";
		System.out.println("\tpetType ref (AFTER)== "+
				Integer.toHexString(System.identityHashCode(petType)));
		System.out.println("\tPet type after "+petType);
		return petType;//return petType
	}
	
	public static void integerExample(){
		//integer is immutable
		Integer dataWrapper = new Integer(5);
		System.out.println("dataWrapper ref (before)== "+
				Integer.toHexString(System.identityHashCode(dataWrapper)));
		Integer value = methodInteger(dataWrapper);
		System.out.println("dataWrapper ref (after)== "+
				Integer.toHexString(System.identityHashCode(dataWrapper)));
		System.out.println(value + dataWrapper);
	}
	
	public static Integer methodInteger(Integer x){
		// public static Integer methodInteger(final Integer x){ 
		//x++; has an error as it is immutable
		System.out.println("x ref (before x++)== "+
				Integer.toHexString(System.identityHashCode(x)));

		Integer y = x+10;
		x++;
		System.out.println("x ref (after x++)=="+ 
				Integer.toHexString(System.identityHashCode(x)));

		return y;
	}
	

}
