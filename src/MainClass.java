import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Guess the number I'm thinking of.It's between 1-10");
		Scanner tKeyboard = new Scanner(System.in);
		
		int i = 0 + (int) ( Math.random() * 10 );
		int tInput = 25;

		do {
			tInput = tKeyboard.nextInt();

			if (tInput == i) 
			{
				System.out.println("You've guessed it.");
			}
			else
			{
				System.out.println("Wrong.");
				if(tInput < i && tInput < 1)
				{
					System.out.println("Too low. Numbers below 1 are not valid. Enter a higher number.");
				}
				else if(tInput > i && tInput > 10)
				{
					System.out.println("Too high. Numbers above 10 are not valid. Enter a lower number.");
				}
				
			}
		} while (tInput != i);
		

	}

}