package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome!");
		System.out.println("Say hello to your new pet Chucky the Chameleon.");

		VirtualPet pet = new VirtualPet();

		String userInput = "";
		while (!userInput.equals("5")) {

			System.out.println("Let's see how your chameleon is doing...");
			System.out.println("Hunger Level: " + pet.getHungerLevel());
			System.out.println("Hydration Level: " + pet.getHydration());
			System.out.println("Needs to go outside: " + pet.getOutside());
			System.out.println("Needs to socialize with other chameleons: " + pet.getGoPlay());

			System.out.println("What would you like to do with Chucky?");
			System.out.println("1.   Feed your pet.");
			System.out.println("2.  Give Chucky some water.");
			System.out.println("3.  Let your chameleon go outside.");
			System.out.println("4.  Play with other chameleons.");
			System.out.println("5.  Leave your pet.");
			System.out.println("Which one?");

			userInput = input.nextLine();

			if (userInput.equals("1")) {
				pet.feed();
				System.out.println("You fed Chucky some yummy veggies and fruit.");
			}

			else if (userInput.equals("2")) {
				pet.water();
				System.out.println("You gave Chucky some water.");
			} else if (userInput.equals("3")) {
				pet.outside();
				System.out.println("You let Chucky go outside and go potty in a tree.");
			}
			if (userInput.equals("4")) {
				pet.goPlay();
				System.out.println("You created a playdate so Chucky can play with other chameleons.");
				System.out.println("Look at all the colors they can change match!");
			}
			pet.tick();
		}
		System.out.println("You've decided to leave your pet for a while. See you later!");
	}
}
