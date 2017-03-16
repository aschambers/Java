public class Operators {
	public static void main(String[] args) {
		// operators (=)
		int result = 1 + 2;

		System.out.println("1 + 2 = " + result);

		int previousResult = result;
		result -= 1;
		System.out.println(previousResult + " - 1 = " + result);
		result = result * 10;
		System.out.println(previousResult + " * 10 = " + result);

		previousResult = result;
		result = result / 5;
		System.out.println(previousResult + " / 5 = " + result);

		previousResult = result;
		result = result % 3;
		System.out.println(previousResult + " % 3 = " + result);

		previousResult = result;
		result = result + 1;
		System.out.println("Result is now " + result);
		result++;
		System.out.println("Result is now " + result);
		result--;
		System.out.println("Result is now " + result);

		result+= 2;
		System.out.println("Result is now " + result);
		result *= 10;
		System.out.println("Result is now " + result);
		result -= 10;
		System.out.println("Result is now " + result);
		result /= 10; 
		System.out.println("Result is now " + result);

		boolean isAlien = false;
		if(isAlien == false)
			System.out.println("It is not an alien");
		else 
			System.out.println("It is an alien");

		int topScore = 95;
		int secondtopScore = 92;
		if(topScore == 100)
			System.out.println("You got the high score!");
		else if (topScore >= 90 && topScore < 100)
			System.out.println("You did good, but did not get the highest score!");
		else if ((topScore > secondtopScore) || topScore > 93)
			System.out.println("You got a 93 or higher!");
		else
			System.out.println("You did not get a high score");

		boolean isCar = false;
		if(isCar == true)
			System.out.println("This is not supposed to happen");

		isCar = true;
		// ternary operator
		boolean wasCar = isCar ? true : false;
		if(wasCar)
			System.out.println("wasCar is true");

		// google nuts and bolts to see operators
		double first = 20d;
		double second = 80d;
		// precedence table = http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		double total = (first + second) * 25;
		double theRemainder = total % 40;
		System.out.println("Remainder is: " + theRemainder);

		if(total <= 20) {
			System.out.println("Total was over the limit and value was: " + total);
		} else {
			System.out.println("Total was not over the limit and value was: " + total);
		}
	} 
}


























































