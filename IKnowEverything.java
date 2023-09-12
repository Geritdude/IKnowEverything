import java.util.Scanner;
import java.util.Random;

public class IKnowEverything {
	public static void main(String[] args) {
		Random myRandom =  new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int randomNumber;
		
		System.out.println("Type your question, my child: ");
		keyboard.nextLine(); //use this for your calculator.
		//Not .nextString();!
		
		randomNumber = myRandom.nextInt(10) + 1;
		
		if (randomNumber > 5){
			System.out.println("Yes, isn't is obvious?");
		} else{ 
			System.out.println("No, and don't ask again.");
		}
		keyboard.close();
	}
}
