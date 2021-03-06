package com.mase.innerclasses;


public class Parcel2 {
	
	//cont
	class Contents {//~ means package, same class
		
		private int i=11;

		public int value() {
			return i;
		}
	}
	
	//dest
	class Destination {//~ means package, same class
		
		private String label;
		
		Destination(String whereTo){
			label=whereTo;
		}

		public String readLabel() {
			return label;
		}
	}
	
	//main
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents cont(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = cont();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tanzania");
		
		Parcel2 q = new Parcel2();
		Contents c2 = new Parcel2().new Contents();
		Contents c = q.cont();
		Destination d = q.to("Borneo");
		System.out.println(d.readLabel());
	}

}
