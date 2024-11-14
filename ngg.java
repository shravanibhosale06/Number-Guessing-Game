package Projects;
import java.util.Scanner;

public class NGG {

    public static void numGuessGame(){
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Generate a random number
        int random = 1 + (int) (100 * Math.random());

        //defining value of k for trials
        int k = 5;

        int i,num;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
        //iteration over k trials
        // using for loop
        for (i = 0; i < k; i++) {
            System.out.println("Guess the number ");

            //take input for guessing the number
            num = sc.nextInt();

            //using if and else
            if (num == random) {
                System.out.println("You have correctly guessed the number as " + random + "You won the game!!");
                break;
            } else if ((num > random) && (i != k - 1)) {
                System.out.println(num + " is greater than the number generated." + "You have another chance."
                        + "Choose a smaller number than " +num);
            } else if ((num < random) && (i != k - 1)) {
                System.out.println(num + " is smaller than the number generated." + "You have another chance."
                        + "Choose a greater number than " + num);
            }
        }
            if (i == k) {
                System.out.println("You have exhausted " + k + " trails");
                System.out.println("Sorry, but you lose the game" + "The number generated was " + random);
            }
        }

    public static void main(String[] args) {

        //function call
        numGuessGame();
    }
}
