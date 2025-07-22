import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int target = random.nextInt(100) + 1;
        int chance = 5;
        while(chance > 0) {
            System.out.print("guess a number between 1 and 100 (inclusive, chance: " + chance + " time): ");
            try {
                int guess = scanner.nextInt();
                if(guess == target) {
                    System.out.println("Congratulations! You win!");
                    break;
                } else if(guess < target) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                chance--;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
        }

        if(chance == 0) {
            System.out.println("you lost! target was " + target);
        }

    }
}