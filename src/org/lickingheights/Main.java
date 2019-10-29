package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);

	int randomNumber, userNumber;
	String answer;
	randomNumber = (int) (Math.random() * 100);
	System.out.println(randomNumber);

	System.out.println("I am thinking of a 1-100 guess what it is");
	userNumber = keyboard.nextInt();

	if (userNumber == randomNumber){
		System.out.println(randomNumber+ " is the correct answer");
	}
while (userNumber < randomNumber || userNumber > randomNumber){

		if (userNumber < randomNumber){
			System.out.print("You guessed to low try again");
			userNumber = keyboard.nextInt();
		}
		if (userNumber > randomNumber){
			System.out.println("You gussed to high try again");
			userNumber = keyboard.nextInt();
		}
		if (userNumber == randomNumber){
			System.out.println(randomNumber+ " is the correct number you got it right");
			System.out.println("Good job you got it right, do you want to play again");
			answer = keyboard.nextLine();
			while(!(answer == "yes"));
			


		}


}
    }
}
