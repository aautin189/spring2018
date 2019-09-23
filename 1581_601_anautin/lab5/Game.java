
import java.util.Scanner;




// METHODS INCLUDED in the Game class:
// start()
// update()
// render()
// setGameOver()


public class Game
{



	// CLASS DATA
	private static boolean gameOver;

	






	// METHOD: main
	public static void main(String [] args)
	{

		start();

		while (gameOver == false)
		{

			update();
			render ();


		} // end of game loop

	} // end of main method






	// METHOD: start()
	public static void start()
	{

		Scanner input = new Scanner(System.in);
		gameOver = false;
		Scene.start(input);
		Player.start(input);
		Physics.start(input);

	} // end of start method








	// METHOD: update()
	public static void update()
	{

		Player.update();		// update player data

	} // end of update method








	// METHOD: render()
	// this method will render the graphical elements of the game
	public static void render()
	{

		Scene.draw();			// draw the scene
		Player.draw();			// draw the player
		StdDraw.show(100);		// show graphics

	} // end of render method








	// METHOD: setGameOver
	public static void setGameOver(boolean gameOver)
	{

		Game.gameOver = gameOver;

	} // end of setGameOver method




} // end of Game class


