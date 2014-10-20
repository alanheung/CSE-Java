class Tree{
	private int height;//instance variable
	
	public Tree(){//default constructor
		height = 0;
		System.out.println("You are planting a seedling");
	}
	public Tree(int height){//overloaded constructor with one parameter
		this.height = height;
		System.out.println("You are planting a tree");
	}
	public void info(){
		System.out.println("The tree is " +height+" metres tall");
	}
	public void info(String s){
		System.out.println(s+" tree is " +height+" metres tall");
	}
}

public class Overloading {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			Tree t = new Tree(i);//calls overloaded ctor
			t.info();
			t.info("Alan's");
		}
		new Tree();//calls default ctor
	}
}
