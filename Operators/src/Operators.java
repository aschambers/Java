public class Operators {
    // psvm for shortcut
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result = result - 1;
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
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        } else if (topScore >= 100) {
            System.out.println("topscore >= 100");
        } else if (topScore <= 100) {
            System.out.println("topscore <= 100");
        } else if (topScore > 100 && topScore < 200 || topScore == 150) {
            System.out.println("In between 100 and 200");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
