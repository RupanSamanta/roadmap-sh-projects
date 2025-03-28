
import java.util.Scanner;

/*
 * Number Guessing Game. It has 3 different levels Easy, Medium, Hard. 
 * You will be given 10, 5, 3 chances respectively to guess the number.
 * Game Over! if you run out of chances.
 * You win if you guess the correct number.
 * Score: 5 points for Easy, 10 points for Medium, 20 points for Hard per each chances left.
 */
public class NumberGuessingGame {

    private int level;
    private int chances;
    private long score;
    private int round;

    NumberGuessingGame() {
        level = 0;
        chances = 0;
        score = 0;
        round = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberGuessingGame game = new NumberGuessingGame();
        System.out.println("""
                            Welcome to the Number Guessing Game!\r
                           I'm thinking of a number between 1 and 100.\r
                           You have 5 chances to guess the correct number.\r
                           \r
                           Please select the difficulty level:\r
                           1. Easy (10 chances)\r
                           2. Medium (5 chances)\r
                           3. Hard (3 chances)\r
                           \r
                           Enter your choice:"""
        );
        boolean flag = true;
        while (flag) {
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Great! You have selected the Easy level.\n");
                    System.out.println("Let's start the game!\n");
                    flag = false;
                }
                case 2 -> {
                    System.out.println("Great! You have selected the Easy level.\n");
                    System.out.println("Let's start the game!\n");
                    flag = false;
                }
                case 3 -> {
                    System.out.println("Great! You have selected the Easy level.\n");
                    System.out.println("Let's start the game!\n");
                    flag = false;
                }
                default -> System.out.println("Invalid choice! Please select the difficulty level:");
            }
        }
        sc.close();
    }
}
