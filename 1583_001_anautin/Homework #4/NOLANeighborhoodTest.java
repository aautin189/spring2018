import java.util.Scanner;



public class NOLANeighborhoodTest
{
	

	// CREATE: VARIABLES: to represent each direction the tourist chooses to travel to next
	final static int NORTH = 0;
	final static int EAST = 1;
	final static int WEST = 2;
	final static int SOUTH = 3;


	// CREATE: VARIABLE: to store the String literal typed in to change direction
	public static String userTextDirection;


	// CREATE: VARIABLE: to store the index of the current location of the player inside the game
	public static int currentNeighborhood = 0;



	// CREATE: ARRAY: to house neighborhood details that will be accessed when printing our neighborhood details for user to see
	// will populate 8 rows
	public static String [] neighborhoodDetailsArray = {"You are Uptown! An adjacent neighborhood is to the east.", "You are in the Garden District! Adjacent neighborhoods are to the east and west.", "You are in the CBD! Adjacent neighborhoods are to the north, east, and west.", "You are in the French Quarter! Adjacent neighborhoods are to the north, east, and west.", "You are in the Marigny! An adjacent neighborhood is to the west.", "You are in Metairie! Adjacent neighborhoods are to the north, east, and south.", "You are in the Treme! Adjacent neighborhoods are to the west and south.", "You are in Kenner! An adjacent neighborhood is to the south."};

	// CREATE: 2 dimensional array (static integer) to represent the adjacent neighborhoods to move to next
	// will populate 8 rows by 4 columns
	public static int [][] indexOfNextNeighborhoodArray = {{-1,1,-1,-1}, {-1,2,0,-1}, {5,3,1,-1}, {6, 4,2,-1}, {-1,-1,3,-1}, {7,6,-1,2}, {-1,-1,5,3}, {-1,-1,-1,5}};






	// CREATE: METHOD: main
	public static void main (String [] args)
	{



		// VARIABLE: for loop control; initialize to true
		boolean continueTour = true;



		// LOOP: to iterate UNTIL user types in "quit"
		// loop should perform steps 2-4 (see homework instructions)
		while (continueTour == true)
		{

			displayNeighborhoodDetails();

			getUserTextDirection();




	
			// SELECTION STRUCTURES: 

			// PURPOSE -->
			// six sets; each set corresponds with a possible String literal entry made by the user
			
			// 1. north
			// 2. south
			// 3. east
			// 4. west
			// 5. quit
			// 6. (invalid entry)
			


			
			// ROUND ONE -->
			
			// Condition:
			// is the user input equal to one of these String literals == (north, south, east, west, quit, <invalid entry>)?
			
			// Operation:
			// access the 2-dimensional "adjacent neighborhood array" 
			// row = the current neighborhood the user is in
			// column = the north position (index value given to the NORTH constant during initialization)

			// Round 2:  

			// OPERATION --> inside of loop) to update current neighborhood based on user input

			if (userTextDirection.equals ("north"))
			{
				int userInput = indexOfNextNeighborhoodArray[currentNeighborhood][NORTH];

				if (userInput == -1)
				{

					System.out.printf("\nCan't go that way! Please enter a different direction.\n");

				}

				else 
				{
					currentNeighborhood = userInput;
				}


			} // end of NORTH if








			else if (userTextDirection.equals ("south"))
			{
				int userInput = indexOfNextNeighborhoodArray[currentNeighborhood][SOUTH];
			
				if (userInput == -1)
				{

					System.out.printf("\nCan't go that way! Please enter a different direction.\n");

				}

				else 
				{
					currentNeighborhood = userInput;
				}

			} // end of SOUTH if







			else if (userTextDirection.equals ("east"))
			{
				int userInput = indexOfNextNeighborhoodArray[currentNeighborhood][EAST];
			
				if (userInput == -1)
				{

					System.out.printf("\nCan't go that way! Please enter a different direction.\n");

				}

				else 
				{
					currentNeighborhood = userInput;
				}

			} // end of EAST if


	




			else if (userTextDirection.equals ("west"))
			{
				int userInput = indexOfNextNeighborhoodArray[currentNeighborhood][WEST];
			
				if (userInput == -1)
				{

					System.out.printf("\nCan't go that way! Please enter a different direction.\n");

				}

				else 
				{
					currentNeighborhood = userInput;
				}

			} // end of WEST if		







			else if (userTextDirection.equals ("quit"))
			{
				continueTour = false;
				System.out.printf("\nYou're leaving New Orleans! Thanks for stopping by!\n");
			
			} // end of QUIT if







			else
			{
				System.out.printf("\nThat is an invalid entry. Try again.\n");
			
			} // end of INVALID if
			





		} // end of while loop


	} // end of main method








	// CREATE: METHOD: that displays the neighborhood details at the array index based on currentNeighborhood value
	public static void displayNeighborhoodDetails()
	
	{
		System.out.println(neighborhoodDetailsArray[currentNeighborhood]);

	} // end of displayNeighborhoodDescription method





	// CREATE: METHOD: that collects a String literal from user; then, sets that String literal to all lowercase letters
	public static void getUserTextDirection()
	{		

		System.out.printf("\nOPTION 1: Type the direction to travel to: \n");
		System.out.printf("\nOPTION 2: Type quit to end the tour \n");

		Scanner input = new Scanner(System.in);

		userTextDirection = input.nextLine();

		userTextDirection.toLowerCase();


	} // end of getUserSelection method





} // end of class

