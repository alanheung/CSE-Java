class Tag{
	Tag(int marker){
		System.out.println("Tag("+ marker +")");
	}
}
class Card{
	Tag t1= new Tag(1);//first
	Card(){
		System.out.println("Card()");//fourth
		t3 = new Tag(33);//fifth
	}
	Tag t2 = new Tag(2);// second
	void f(){
		System.out.println("f()");//sixth
	}
	Tag t3 = new Tag(3);//third
}
public class OrderOfInitialisation {

	public static void main(String[] args) {
		Card c = new Card();
		c.f();
	}

}//
