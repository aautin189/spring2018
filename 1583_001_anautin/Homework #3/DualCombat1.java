
// IMPORT: Scanner class
import java.util.Scanner;

// IMPORT: Secure Random class (to use for generating random #s)
import java.security.SecureRandom;




// CREATE: Your class
public class DualCombat1
{


	// CREATE: random number object
	private static final SecureRandom randomNumbers = new SecureRandom();

	// CREATE: class variables to store the value of each hero stat; initialize all to 0 as baseline
	public static int heroHealth = 0;
	public static int heroAttackPower = 0;
	public static int heroMagicPower = 0;


	// CREATE: class variables to store the value of each monster stat; initialize
	public static String monsterName = "GOBLIN DUDE";
	public static int monsterHealth = 100;
	public static int monsterAttackPower = 15;



	// CREATE: our own data type & corresponding values that will act as a loop control variable for our combat loop
	private static enum Coward {YEP, NOPE};

	// LOOP CONTROL variable for combat
	private static Coward forfeitStatus = Coward.NOPE;



	// -------------------------------------------------------------------------------------------------------------------------------- //




	// METHOD: main 
	public static void main(String[] args)
	{
		

		// INVOKE
		buildYourHero();


		// INVOKE
		buildYourMonster();




		// --------------------------------------------------------------------------------------------------------------- //
		



		// COMBAT LOOP: only run combat method if hero is alive, monster is alive, and hero hasn't run away
		while (heroHealth > 0 && monsterHealth > 0 && forfeitStatus == Coward.NOPE)
		{
			
			runCombat();

		} // end of combat while loop





		// --------------------------------------------------------------------------------------------------------------- //




		// SELECTION: if monster is dead, display victory message 
		if (monsterHealth <= 0)
		{

			System.out.printf("\n*******************\n");
			System.out.printf("\nCONGRATULATIONS! YOU defeated the " + monsterName + " !\n");
			System.out.printf("\n*******************\n");

		} // end of if statement






		// --------------------------------------------------------------------------------------------------------------- //





		// SELECTION: if hero is dead, display defeat message
		else if (heroHealth <= 0)
		{
			
			System.out.printf("\n*******************\n");
			System.out.printf("\nOH NO! YOU'VE BEEN KILLED BY THE " + monsterName + " !\n");
			System.out.printf("\n*******************\n");
		
		} // end of if...else statement




		// --------------------------------------------------------------------------------------------------------------- //






	} // end of main method







	
	// METHOD: buildYourHero
	// the player is allowed to customize the hero character
	public static void buildYourHero()
	{

		// CREATE: new Scanner object
		Scanner input = new Scanner(System.in);


		// CREATE: variable to store value of point allocation; initialize to 20
		// to start, the player is provided a 20-point allotment; each point allows the player to increase a hero stat
		int pointAllocation = 20;


		// DISPLAY: the character we are building
		System.out.printf("\nCreating: THE HERO\n");



		// EVALUATE: player must have points left to spend, in order to continue incrementing hero stats
		while (pointAllocation > 0)
		{


			// DISPLAY: storage value of points left in allocation
			System.out.printf("\nYou have " + pointAllocation + " points available. How would you like to prepare the hero for combat?\n");
			

			// DISPLAY: menu options
			System.out.printf("\n1.) INCREASE HEALTH: + 10 points\n");
			System.out.printf("2.) INCREASE ATTACK POWER: + 1 point\n");
			System.out.printf("3.) INCREASE MAGIC POWER: + 3 points\n");


			// DISPLAY: prompt for user to enter a selection
			// CREATE: variable to store the value entered by user
			System.out.printf("\nEnter a selection: \n");
			int playerSelection = input.nextInt();



			// SELECT: based on value entered, increase the value of corresponding stat & decrease value of point allocation
			// Or, by default, display an error message, prompting the user to try again
			switch(playerSelection)
			{
				case 1:
					heroHealth += 10;
					pointAllocation -= 1;
					break;
				case 2:
					heroAttackPower += 1;
					pointAllocation -= 1;
					break;
				case 3:
					heroMagicPower += 3;
					pointAllocation -= 1;
					break;
				default:
					System.out.printf("\n************************************************\n");
					System.out.print("ERROR! That is not a valid selection. Please type either 1, 2, or 3.");
					System.out.printf("\n************************************************\n");
					break;
			} // end of switch statement





			// DISPLAY: total values of each attribute following the hero build
			System.out.printf("\n________________________________\n");
			System.out.printf("\n...... Hero in progress...... \n");
			System.out.printf("\nHealth = "+ heroHealth + "\n");
			System.out.printf("Attack Power = "+ heroAttackPower + "\n");	
			System.out.printf("Magic Power = "+ heroMagicPower + "\n");
			System.out.printf("\n________________________________\n");



		} // end of while loop


	} // end of createHero method
	






	// METHOD: display hero stats
	public static void displayHeroStats()
	{
		System.out.printf("\nTHE Hero: \n");
		System.out.printf("Health = "+ heroHealth + "\n");	
		System.out.printf("Magic Power = "+ heroMagicPower + "\n");


	} // end of displayHeroStats method







		// METHOD: display monster stats
	public static void displayMonsterStats()
	{
		System.out.printf("\nTHE " + monsterName + ": \n");
		System.out.printf("Health = "+ monsterHealth + "\n");
		System.out.printf("Attack Power = "+ monsterAttackPower + "\n");	


	} // end of displayMonsterStats method







	// METHOD: produce a random monster
	public static void buildYourMonster()
	{

		
		// CREATE: randomNumbers object to produce a random number that will determine which monster profile to select
		int randomMonsterNo = randomNumbers.nextInt(3);



		// SELECT: a specific monster (complete with its own attributes), created and selected at random
		switch (randomMonsterNo)
		{

			case 0: 
				monsterName = "Goblin";
				monsterAttackPower = 8 + randomNumbers.nextInt(5);
				monsterHealth = 75 + randomNumbers.nextInt(25);
				System.out.printf("\n************************************************\n");
				System.out.printf("You've encountered a " + monsterName + " !!!!");
				System.out.printf("\n************************************************\n");
				break;

			case 1:
				monsterName = "Orc";
				monsterAttackPower = 12 + randomNumbers.nextInt(5);
				monsterHealth = 100 + randomNumbers.nextInt(25);
				System.out.printf("\n************************************************\n");
				System.out.printf("You've encountered an " + monsterName + " !!!!");
				System.out.printf("\n************************************************\n");				
				break;

			case 2:
				monsterName = "Troll";
				monsterAttackPower = 15 + randomNumbers.nextInt(5);
				monsterHealth = 150 + randomNumbers.nextInt(50);
				System.out.printf("\n************************************************\n");
				System.out.printf("You've encountered a " + monsterName + " !!!!");
				System.out.printf("\n************************************************\n");
				break;

			default:
				break;



		} // end of switch statement


	} // end of buildYourMonster method






	// METHOD: run combat 
	// will call on other methods depending on attack option selected
	public static void runCombat()
	{


		// CREATE: new Scanner object 
		Scanner input = new Scanner(System.in);


		// INVOKE: method that displays the monster's stats
		displayMonsterStats();

		// DISPLAY: hero current stats
		displayHeroStats();

		
		// DISPLAY: combat menu to the player
		System.out.printf("\nHere are your combat options: ");


		System.out.printf("\n1.) Sword Attack\n");
		System.out.printf("2.) Cast a spell\n");
		System.out.printf("3.) Charge magic\n");
		System.out.printf("4.) Run away!\n");

		// prompt user to select an option
		System.out.printf("\nWhich action would you like to perform? ");

		// declare integer variable to be used for player's selection; assign value = Scanner object
		int playerSelection = input.nextInt(); 


		// SELECT: switch statement based on user input
		// will invoke method corresponding with combat selection
		switch (playerSelection)
		{
			case 1: 
				swordAttackOption();
				break;

			case 2:
				spellOption();				
				break;

			case 3:
				chargeMagicOption();
				break;

			case 4:
				fleeOption();
				break;

			default:
				System.out.printf("\n*******************\n");
				System.out.printf("\nERROR: Invalid entry! Please try again.\n");
				System.out.printf("\n*******************\n");
				break;

			
		}
	

	}// end of runCombat method








	// METHOD: to calculate damage inflicted on hero (by the monster)
	public static void monsterRetaliation()
	{

		// if statement CONDITION: (monster is still alive)
		if (monsterHealth > 0)
		{
			// RANDOM: populate a random number from (1-monsterAttackPower) to represent damage inflicted on the hero
			int damage2Hero = 1 + randomNumbers.nextInt(monsterAttackPower);
			
			// reduce the hero's health by that amount
			heroHealth -= damage2Hero;
			
			// display a message notifying the player he/she had been attacked
			System.out.printf("\nALERT #2\n");
			System.out.printf("\nYOU'VE BEEN ATTACKED!\n");
			System.out.printf("\n*******************\n");

		} // end of if statements
	
	} // end of monsterRetaliation method








	// METHOD: attack monster with sword
	public static void swordAttackOption()
	{

		// RANDOM: populate a random number from (1-heroAttackPower) to represent the damage inflicted on the monster
		int damage2Monster = 1 + randomNumbers.nextInt(heroAttackPower);
		
		// reduce monster's health by that value
		monsterHealth -= damage2Monster;
		
		// display the value of damage inflicted on monster
		System.out.printf("\n*******************\n");
		System.out.printf("\nALERT #1\n");
		System.out.printf("\nDAMAGE TO " + monsterName + " = " + damage2Monster + " points!\n");
		System.out.printf("Great job!\n");
		System.out.printf("\n*******************\n");


		// INVOKE: monster retaliation method to calculate the damage inflicted on the hero
		monsterRetaliation();


	} // end of swordAttackOption method







	// METHOD: use magic to cast a spell
	// yields the results of attack option
	public static void spellOption()
	{

		// if statement CONDITION: (hero has enough mana to cast the spell)
		if (heroMagicPower >= 3)
		{
			
			// deduct hero magic power by 3
			heroMagicPower -= 3;

			// divide monsterHealth by 2
			monsterHealth /= 2;

			
			// display notification to the player that he/she has successfully cast a spell on the monster
			System.out.printf("\n*******************\n");
			System.out.printf("\nALERT #1\n");
			System.out.printf("\nYou cast a spell on the monster!\n");
			System.out.printf("\n*******************\n");

		} // end of if statement

		else
		{
			System.out.printf("\n*******************\n");
			System.out.printf("\nALERT #1\n");
			System.out.printf("\nYou do not have enough magic power available to cast a spell!\n");
			System.out.printf("\n*******************\n");
		
		} // end of else statement
		

		// INVOKE: monster retaliation against the hero
		monsterRetaliation();


	} // end of spellOption method






	// METHOD: charge magic
	public static void chargeMagicOption()
	{

		// increase heroMagicPower
		heroMagicPower += 3;
		
		// display message to player notifying him/her that the hero has chosen to charge his/her mana
		System.out.printf("\n*******************\n");
		System.out.printf("\nALERT #1\n");
		System.out.printf("\nYou charged your magic!\n");
		System.out.printf("\n*******************\n");		


		// INVOKE: monster retaliation against hero
		monsterRetaliation();
	

	} // end of chargeOption method






	// METHOD: flee
	// update loop control variable so that condition evaluates to false and terminates the loop
	public static void fleeOption()
	{

		// set loop control variable (Coward) == YEP
		forfeitStatus = Coward.YEP;
		
	
		
		// display message notifying the player that the hero chose to run away and lost the game
		System.out.printf("\n*******************\n");
		System.out.printf("\nYou ran away! You lost the game!\n");
		System.out.printf("\n*******************\n");

	

	} // end of fleeOption method




} // end of DualCombat class