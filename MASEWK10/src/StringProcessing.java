
public class StringProcessing {

	public static void main(String[] args) {
//		compareStrings();
//		firstExampleUsingStrings();
//		firstExampleUsingSB();
		interning();
	}
	
	public static void compareStrings(){
		String name = "alan";
		System.out.println(name.compareTo("sean"));//-18 ascii
		System.out.println("jack".compareTo("paul"));//-6 	106-112
		System.out.println("tom".compareTo("tim"));//6
	}
	
	public static void firstExampleUsingStrings(){
		String s = new String("The numbers are: ");
		
		for(int i=0; i<=5;i++){
			Integer.toString(i);
			System.out.println(s+(i));
		}
	}

	public static void firstExampleUsingSB(){
		StringBuffer s = new StringBuffer("The numbers are: ");
		
		for(int i=0; i<=5;i++){
			Integer.toString(i);
			System.out.println(s.append(i));
		}
	}
	
	public static void interning(){
		String a="abc", b="abc";
		if(a==b){
			System.out.println("a == b true");
		}else{
			System.out.println("false");
		}
		
		String c= new String("abc");
		String d=new String("abc");
		if(c==d){
			System.out.println("c == d true");
		}else{
			System.out.println("c == d false");
		}
		
		String e= new String("abc");
		String f =new String("abc");		
		if(e.equals(f)){
			System.out.println("e equals f true");
		}else{
			System.out.println("e equals f false");
		}
	}
	
	public static void stringBuffers(){
		StringBuffer sb = new StringBuffer();
		sb.append("If you can keep your head when all about you   ");
		sb.append("    Are losing theirs and blaming it on you,   ");
		sb.append("If you can trust yourself when all men doubt you, ");
		sb.append("    But make allowance for their doubting too;   ");
		sb.append("If you can wait and not be tired by waiting, ");
		sb.append("    Or being lied about, don’t deal in lies, ");
		sb.append("Or being hated, don’t give way to hating, ");
		sb.append("    And yet don’t look too good, nor talk too wise: ");
	}

}

	
	


