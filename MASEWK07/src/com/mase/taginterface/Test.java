// http://www.javapractices.com/topic/TopicAction.do?Id=240
//The advantages of doing so are:
//1. it emphasizes important, high-level aspects of a class, not otherwise expressed in code.
//2. for both human readers and tools, it allows quick identification of classes having specific properties.
//3. the javadoc of the tag interface is a natural home for documenting all the characteristics of items that implement the given interface. 
package com.mase.taginterface;

class CattleTag implements Tag{
	
}
public class Test {

	public static void main(String[] args) {
		Tag t = new CattleTag();
		//		Tag t2 = new Tag();//error cannot instantiate an interface, however you can reference
		if(t instanceof CattleTag){
			System.out.println("t is an instance of CattleTag");
		}
		if(t instanceof Tag){
			System.out.println("t implements Tag");
		}
	}

}//
