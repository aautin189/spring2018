// IMPORT: Scanner class
import java.util.Scanner;


// CREATE: Your class
public class ZombieApocalypse
{



	// METHOD: main
	public static void main (String[] args)
	{


		// CREATE: variables to store values for the attributes of the "physical place" where the game takes place
		int colSize = 10;
		int rowSize = 10;
		String floorTile = " . ";

		// CREATE: variables to represent the x & y coordinate of the PLAYER entity
		int playerX = 0;
		int playerY = 0;
		String playerTile = "@";

		// CREATE: variables to represent the x & y coordinate of the ZOMBIE entity
		int zombieX = 5;
		int zombieY = 5;
		String zombieTile = ("*");


		// CREATE: variables to represent the x & y coordinate of the MALL entity
		int mallX = 9;
		int mallY = 9;
		String mallTile = "#";



		// CREATE: loop control variable
		boolean gameOver = false;


		// CREATE: Scanner object
		Scanner input = new Scanner(System.in);








		// START-GAME LOOP: 
		while (gameOver == false)
		{


			// DISPLAY-GAME-SCENE LOOP:
			// side note: the playerX and j variables represent the X COORDINATE
			// side note: the playerY and i variables represent the Y COORDINATE
			for (int i=0; i < rowSize; i++)
			{
				for (int j=0; j<colSize; j++)
				{



					// SELECT: allow this selection structure to override the default graphic if one of the other entities needs that space

					if (i == playerX && j == playerY)
					{
						System.out.print(playerTile);
					} // end if
					
					else if (j == zombieX && i == zombieY)
					{
						System.out.print(zombieTile);
					} // end else if
					
					else if (mallX ==j && mallY ==i)
					{
						System.out.print(mallTile);
					} // end else if
					
					else
					{
						System.out.print(floorTile);
					} // end else
				


				} // end interior for loop

				


				// DISPLAY: next line
				System.out.print("\n");


			} // end (display game scene) loop
			

			


			// INPUT: get user's input in order to move player in game
			
			String choice = input.nextLine();


			// SELECTION: execute the player's movement
			if (choice.equals("w"))
			{
				playerY --;
			}
			else if (choice.equals("s"))
			{
				playerY ++;
			}
			else if (choice.equals("d"))
			{
				playerX ++;
			}
			else if (choice.equals("a"))
			{
				playerX --;
			}







			// execute monster action
			boolean hasMoved = false;
			while (!hasMoved)
			{



				// populate a random #
				int zombieChoice = (int) (Math.random()* 4);
				
				
				// SELECTION: 
				if (zombieChoice == 0)
				{
					if (zombieX < rowSize -1)
					{
						zombieX ++;
						hasMoved = true;
					}	

				}
				

				else if (zombieChoice ==1)
				{
					if (zombieX > 0)
					{
						zombieX --;
						hasMoved = true;
					}
				}
				


				else if (zombieChoice ==2)
				{
					if (zombieY > 0)
					{
						zombieY --;	
						hasMoved = true;
					}
				}
				


				else if (zombieChoice ==3)
				{
					if (zombieY < colSize -1)
					{
						zombieY ++;	
						hasMoved = true;
					}
		
				}

			} // end moster while loop





			// CHECK-LOST CONDITION:
			if (playerX == zombieX && playerY == zombieY)
			{
				gameOver = true;
				System.out.println("Your brains were eaten by the zombie!");
			}
		 	


		 	// CHECK-WIN CONDITION:
		 	if (playerX == mallX && playerY == mallY)
		 	{

		 		gameOver = true;
		 		System.out.println("You survived and made it to the mall!");

		 	}






		 } // end of game (while) loop
	} // end of main scope
} // end of class scope