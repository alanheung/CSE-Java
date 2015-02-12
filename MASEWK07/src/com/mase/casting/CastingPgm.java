package com.mase.casting;

public class CastingPgm {
	
	public static void main(String[] args) {
//		upcasting();
		downcasting();
	}
	public static void upcasting(){
		Triangle t = new RightAngledTriangle();
		t.draw();//polymorphism
		
		Triangle t1 = new Triangle();
		RightAngledTriangle r1 = new RightAngledTriangle();
		t1.draw();
		r1.draw();
		t1=r1;
		
		t1.draw();
		//t1.area();//compiler error cannot find symbol
		
		//upcasting to the interface
		Shape s = new Triangle();
		s.draw();
		s=r1;
		s.draw();
//		progToTheInterface(new Triangle());//comment this out to get the progToTheInterface to print RAT::area
		progToTheInterface(new RightAngledTriangle());
		
	}
	public static void downcasting(){
		Triangle t = new Triangle();
		RightAngledTriangle r = new RightAngledTriangle();
		
		t=r;
//		t.draw(); //RightAngledTriangle::draw
//		t.area();//The method area() is undefined for the type Triangle, RAT has area, not Triangle
//		r.draw();//RightAngledTriangle::draw

		
		Triangle t1 = new Triangle();
		RightAngledTriangle r1 = new RightAngledTriangle();
		
//		r1=t1;//compiler error; incompatible types
	//	r1=(RightAngledTriangle)t1;//Triangle cannot be cast to com.mase.casting.RightAngledTriangle, downcasting required
		//but cannot be cast down the tree
		
//NOTE:	A triangle reference can talk to a triangle object or any subclass of triangle, A RAT reference can talk to a RAT object or any subclass ofRAT
//A RAT cannot talk to a triangle object, up the tree, even with a downcast hence the exception we saw there	
//The object you are downcasting from must be of same type or subclass of type that you are casting to on the lefthandside.
//This is because a reference can only work with objects of its own type and its subclass
		
		Triangle t2 = new RightAngledTriangle();
		
//		RightAngledTriangle r2 = (RightAngledTriangle)new Triangle();//Triangle cannot be cast to com.mase.casting.RightAngledTriangle
		
//		Triangle t4 = new RightAngledTriangle();
//		RightAngledTriangle r4 = new RightAngledTriangle();
//		(RightAngledTriangle)t4=r4;
//		r4.area();
		
		Triangle t5 = new RightAngledTriangle();
		t5.draw();//RightAngledTriangle::draw
		RightAngledTriangle r5 = (RightAngledTriangle)t5;
		r5.area();//RightAngledTriangle::area
		
		Triangle t6 = new Triangle();
		t6.draw();//Triangle::draw
//		RightAngledTriangle r6 = (RightAngledTriangle)t6;//Triangle cannot be cast to com.mase.casting.RightAngledTriangle
//		r6.area();//error

		if(t6 instanceof RightAngledTriangle){
			RightAngledTriangle r6 = (RightAngledTriangle)t6;
			r6.area();
		}
	}
	public static void progToTheInterface(Shape s){
		s.draw();
		//because shape has no area(), make it an instanceof RAT
		if(s instanceof RightAngledTriangle);
		RightAngledTriangle r = (RightAngledTriangle)s;//downcasting s to RAT
		r.area();
	}

}//end
