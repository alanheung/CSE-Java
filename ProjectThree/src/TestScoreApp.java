import java.util.Scanner;

public class TestScoreApp {
	public static void main(String[] args) {
		// Display operational messages
		System.out.println("Please enter test scores that range from 0 to 100\nTo end the program enter 999\n");
		
		//declare variables
		double scoreTotal = 0.0;
		int scoreCount = 0;
		int testScore = 0;
		Scanner sc = new Scanner(System.in);

		//Get series of test scores from user
		while (testScore != 999){
			// Get the input from the user
			System.out.println ("Please enter score: ");
			testScore = sc.nextInt();
			
			// Accumulate the score count and score total
			if(testScore >= 0 && testScore <= 100){
				//valid scores
				scoreTotal = scoreTotal + testScore;
				scoreCount =scoreCount + 1;
			} else if(testScore != 999){
				System.out.println("Invalid entry, not counted");
			}
		}//end while
		if(scoreCount >= 1){
			//Display the score count, score total and average score
			double averageScore = scoreTotal/scoreCount;
			String message = "\n" +
							 "Score count: " + scoreCount + "\n"
							 + "Score total: " + scoreTotal + "\n"
							 +"Average score: " + averageScore + "\n";
			System.out.println(message);
		}else
			System.out.println("No score was entered");

	}
}
