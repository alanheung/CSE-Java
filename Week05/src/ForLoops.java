
public class ForLoops {
	public static void main(String[] args) {
		loopTest2();
	}
	public static void loopTest2(){
		int counter = 0;
		
		outer:
		for(int i = 0; i <3; i++){
			System.out.println("i == "+i);	
			middle:
			for(int j = 0; j < 3; j++){
				System.out.println("j == "+j);
				inner:
				for(int k = 0; k < 3; k++){
					System.out.println("k == "+k);
						if(k-j > 0){
							continue middle;
						}
						counter++;
				}
				System.out.println("After inner ");	
			}
			System.out.println("After middle ");	
		}
		System.out.println("After outer, counter == "+counter);	
	}
}
