import java.util.Random;
import java.util.Scanner;
import java.util.*;
  
public class Task2_number
{
    public static void main(String[] args)
    {
        int number, guess;
		final int MAX = 100;
		Scanner sc = new Scanner(System.in);
  		Random rand = new Random();
  		boolean correct = false;
		number = rand.nextInt(MAX) + 1;
  		while (!correct) 
		{
  			System.out.println("Guess a number between 1 and 100.");
			guess = sc.nextInt();
            if (guess > number)
			{
            	System.out.println("Entered number is too large, so try again now.");
            }
  			else if (guess < number)
			{
            	System.out.println("Entered number is too small, so try again now.");
            }
			else 
			{
                System.out.println("Yes, number is correct.");
  				correct = true;
            }
        }
        System.exit(0);
    }
}