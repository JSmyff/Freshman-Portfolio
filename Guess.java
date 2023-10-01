import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args) {
		//Assigns a random number.
		Random random = new Random();
		int target = random.nextInt(100) + 1;

		//User prompt.
        Scanner stdin = new Scanner(System.in);
		System.out.print("Guess a number: ");
		int num = stdin.nextInt();

		while(num != target)
		{
			//Guess too low block.
			while(num < target)
			{
				System.out.print("Your number is too low. Guess a number: ");
				num = stdin.nextInt();
			}

			//Guess to high block.
			while(num > target)
			{
				System.out.print("Your number is too high. Guess a number: ");
				num = stdin.nextInt();
			}
		}
		System.out.println("Bravo! The secret number is " + target);
	}
}
