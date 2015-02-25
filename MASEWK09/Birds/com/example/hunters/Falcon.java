package com.example.hunters;

public class Falcon {

	private String name;

	public Falcon(){
		name="Falcon";
	}
	public String getName(){
		return name;
	}
	public static void testEagleAccess(){
		Eagle eag = new Eagle();
		System.out.println(eag);
	}
	@Override
	public String toString() {
		return "Falcon [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Falcon falcon = new Falcon();
		Falcon falcon2 = new Falcon();
		System.out.println(falcon);
		System.out.println(falcon2);
		testEagleAccess();
		
		System.out.println(falcon.getClass());
		System.out.println(falcon2.getClass());
//		if(falcon.getName().equals(falcon2.getName())){
//			System.out.println(falcon+" equals "+falcon2);
//		}else{
//			System.out.println(falcon+" not equal "+falcon2);
//		}
	}

}
