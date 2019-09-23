

import java.util.Scanner; // import Scanner class from the java.util package

public class CombatCalculator7 // create class
{
	public static void main(String[] args) // create main method
	{



		// reference variables
		// references a Scanner object
		Scanner input = new Scanner(System.in); // create new Scanner object; initialize "input" variable with value of Scanner object



		/*INITIALIZATION*/


		String theMonster = "GOBLIN DUDE"; // String variable initialized with String literal

		// monster's initial health level
		int monsterHealth = 100;

		// monster's attack power
		int monsterAttackPower = 15;


		// >>>>> HERO
		// hero's initial health level
		int heroHealth = 100;

		// hero's attack power
		int heroAttackPower = 12;

		// hero magic power (default)
		int heroMagicPower = 0;



		/*LOOP CONTROL*/

		// declare a loop control variable
		int runAway = 0;
		
		
		while (monsterHealth > 0 && runAway < 1)
		{

			
			/*OPENING MESSAGE*/

			// greet the user
			System.out.println("Let's fight, Goblin Dude!");




			/*PRINT CURRENT STATS*/

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
		


			/*MENU OPTIONS: PROMPT USER INPUT*/

			// present the user with options that can be used to defeat Goblin Dude
			System.out.println("Here are your combat options: ");

			System.out.println("1. Sword Attack");
			System.out.println("2. Cast a spell");
			System.out.println("3. Charge Mana");
			System.out.println("4. Run Away!");

			// prompt user to select an option
			System.out.println("What action would you like to perform?");

			// declare integer variable to be used for player's selection; assign value = Scanner object
			int playerSelection = input.nextInt(); 



		
			/*PROCESS USER INPUT*/
			// double-selection statements: perform specific operations and checks based on the user's selection


			// if player selects to attack the monster with a sword:
			if (playerSelection	== 1)
			{
			
				// calculate the effects of the sword attack: reduce the monster's health by the value of the Hero's attack power (using a Compound Assignment Operator) 
				monsterHealth -= heroAttackPower;			

				// communicate the effects of the player's choice
				System.out.println("You strike the " + theMonster + " with your sword for " + heroAttackPower + " damage.");

			} // end of if



			// if player trys to cast a spell on the goblin:
			else if (playerSelection == 2)
			{
			
				// before user can cast spell, he/she must first have collected 3 points. Check for this now.
				if (heroMagicPower >= 3)
				{

					// calculate the effects of casting a spell: cut the current monster's health in half (using a Compound Assignment Operator)
					monsterHealth /= 2;

					// reduce hero's magic power by 3 points
					heroMagicPower -= 3;


					// confirm the player's action
					System.out.println("You cast the weaken spell on the Goblin Dude.");

				} // end of if

				else
				{

					System.out.println("You have not collected enough magic power to cast a spell.");

				} // end of else



			} // end of else if



			// if player chooses to charge his/her magic:
			else if (playerSelection == 3)
			{


				// calculate the effects of charging magic: add 1 to current magic power (using a unary operator)
				heroMagicPower ++;

				// confirm the player's action
				System.out.println("You focus and charge your magic power.");

			} // end of else if



			// if the player chooses to run away:
			else if (playerSelection == 4)
			{
				
				// make the loop statement false
				runAway += 1;

				// confirm the player's action
				System.out.println("You ran away! You lost the game!");


			} // end of else if


			// if the user does anything else:
			else 
			{
				
				// print an error message; prompt player to make a valid selection
				System.out.println("I don't understand that command. Please make a different selection.");

			} // end of else
		
		

			// if monster's health is 0 or below, terminate the loop & congratulate the player
			if (monsterHealth <= 0)
			{

				System.out.println("Congratulations! You defeated the Goblin Dude!");

			} // end of if
		
		} // end of while loop
		
		

	} // end of main method
} // end of class

