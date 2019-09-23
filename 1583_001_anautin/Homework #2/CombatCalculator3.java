// import the "Scanner" class; must be first line of code
import java.util.Scanner;

public class CombatCalculator3{
	public static void main(String[] args){


		// create Scanner to obtain input from the user
		Scanner input = new Scanner(System.in);



		/*MONSTER DATA VARIABLES*/
		// declare variable: monster's name; initialize it = "goblin"
		String theMonster = "GOBLIN DUDE";

		// declare variable: monster's health; initialize it = 100
		int monsterHealth = 100;

		// declare variable: monster's attack power; initialize it = 15
		int monsterAttackPower = 15;


		/*HERO DATA VARIABLES*/
		// declare variable: hero's health; initialize it = 100
		int heroHealth = 100;

		// declare variable: hero's attack power; initialize it = 12
		int heroAttackPower = 12;

		// declare variable: hero's magic power; initialize it = 0
		int heroMagicPower = 0;



		/*OPENING MESSAGE*/
		// greet the user
		System.out.println("Let's fight, Goblin Dude!");
		System.out.println("");



		/*Report Current Combat Stats*/
		// print the monster's name
		System.out.println("Player 1: " + theMonster);

		// print the monster's health
		System.out.println("Health = " + monsterHealth);
		System.out.println("");

		// print the player's health 
		System.out.println("Player 2: YOU");
		System.out.println("Health = " + heroHealth);

		// print the player's magic power
		System.out.println("Magic Power = " + heroMagicPower);
		System.out.println("");




		/*Combat menu prompt*/
		// present the user with options that can be used to defeat Goblin Dude
		System.out.println("Here are your combat options: ");

		System.out.println("1. Sword Attack");
		System.out.println("2. Cast a spell");
		System.out.println("3. Charge Mana");
		System.out.println("4. Run Away!");

		System.out.println("What action would you like to perform?");

		// declare integer variable to be used for player's selection; assign value = Scanner object
		int playerSelection = input.nextInt(); 



	}
}

