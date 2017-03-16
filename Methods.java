public class Methods {
	public static void main(String[] args) {
		// boolean gameOver = true;
		// int score = 800;
		// int levelCompleted = 5;
		// int bonus = 100;

		// type values we want from our 4 arguments we passed (inHere)
		// can use hard coded numbers or literall names like gameOver or score
		calculateScore(true, 800, 5, 100);

		// replaces code commented out below.
		calculateScore(true, 10000, 8, 200);

		// score = 10000;
		// levelCompleted = 8;
		// bonus = 200;

		// if(gameOver) {
		// 	int finalScore = score + (levelCompleted * bonus);
		// 	System.out.println("Your final score was " + finalScore);
		// }
	} 

	// // method calculate score
	// // we can pass the data type and variable inside calculateScore (inHere)
	// public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	// 	// when you create a method and define paramaters, not needed in method here
	// 	// boolean gameOver = true;
	// 	// int score = 800;
	// 	// int levelCompleted = 5;
	// 	// int bonus = 100;

	// 	if(gameOver) {
	// 		int finalScore = score + (levelCompleted * bonus);
	// 		finalScore += 2000;
	// 		System.out.println("Your final score was " + finalScore);
	// 	}	

	// }

	// method calculate score
	// we can pass the data type and variable inside calculateScore (inHere)
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		// when you create a method and define paramaters, not needed in method here
		// boolean gameOver = true;
		// int score = 800;
		// int levelCompleted = 5;
		// int bonus = 100;

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
		}
	}
}









































































