import java.util.Scanner;


// RUNNER CLASS

class GameControl
{



	// DECLARE
	// static variables that will be accessed from within main

	private static Sanctuary currentSanctuary;






	// ------------------------------------------------------------------------------------------


	// METHOD
	// main method used to run our game
	public static void main (String [] args)
	{



		// INVOKE
		// City constructor
		// reserve space in memory for City object
		// create an instance of City
		// use this instance to invoke any instance methods inside of the City class
	
		City city = new City();



		// INVOKE
		// method that gets the starting sanctuary so we can execute the game loop
		// value returned should be a reference value == resilience
		// store reference in our static variable
		Sanctuary defaultSanctuaryReference = city.getDefaultSanctuary();

		Sanctuary currentSanctuary = defaultSanctuaryReference;






		// LOOP

		boolean gameOver = false;

		while (gameOver == false)
		{
			

			
			// INVOKE
			// method that returns desciption pertaining to the currently occupied sanctuary
			// then, print out that description

			String currentSanctuaryDescription 	= currentSanctuary.getDescription();
			printLongPartition();


			System.out.println("\n" + currentSanctuaryDescription + "\n");
			printShortPartition();




			// INVOKE
			// method that returns an "exit message"
			// method that returns a custom exits range to include all available exits based on currently occupied sanctuary
			// combine those 2 Strings & print to terminal
			String exitsMessage = currentSanctuary.getExitsMessageString();
			String availableExits = currentSanctuary.getAvailableExitsString();

			System.out.println("\n" + exitsMessage + availableExits);





			// INVOKE
			// method that prompts user to enter a direction or quit game
			// get the user input
			// convert to lower case
			String convertedUserInput = getUserSelection();
			printLongPartition();





			// EVALUATE
			// user input to determine if they have chosen to quit the game
			// otherwise, update current sacntuary to reflect the valid user's choice
			// otherwise, the input must have been invalid, in which case, an error message is sent to the terminal


			if (convertedUserInput.equals("quit"))
			{
				gameOver = true;
				System.out.println("Thanks for playing!");
			}

			else if (convertedUserInput.equals("north"))
			{
				currentSanctuary = currentSanctuary.getNorth();
			}

			else if (convertedUserInput.equals("south"))
			{
				currentSanctuary = currentSanctuary.getSouth();
			}

			else if (convertedUserInput.equals("east"))
			{

				currentSanctuary = currentSanctuary.getEast();

			}

			else if (convertedUserInput.equals("west"))
			{

				currentSanctuary = currentSanctuary.getWest();
			}

			else
			{
				System.out.println("\nThis is an invalid entry. Please try again!\n");
			}


			

		} // end scope: GAME LOOP


	} // end METHOD: main










	// ASSISTANT METHODS
	// allow us to create space between content printed to the screen

	public static void printLongPartition()
	{
		System.out.println("\n-------------------------------------------------------------------------\n");
	
	} // end method



	public static void printShortPartition()
	{
		System.out.println("\n------------------------------\n");
	
	} // end method












	// METHOD
	// method will print prompt, collect String input, convert it to lowercase, and return modified String to caller
	public static String getUserSelection()
	{

		String promptMenu = "\nTO CONTINUE: type in a direction, or\n\nTO QUIT: type quit";

		

		// CREATE: new Scanner object
		Scanner input = new Scanner(System.in);


		// Print out the prompt menu
		System.out.println(promptMenu);
		




		String userEntry = input.next();

		String convertedStringDirection = convertToLowerCaseDirection(userEntry);

		return convertedStringDirection;

	

	} // end scope: METHOD userInputPrompt




	public static String convertToLowerCaseDirection(String userEntry)
	{

		userEntry.toLowerCase();
		return userEntry;


	} // end scope: METHOD convertToLowerCaseDirection








} // end CLASS: GameControl



