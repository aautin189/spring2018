

// import classes that we will need to access in this application
import java.lang.System;
import java.util.Scanner;
import java.lang.Math;




public class Game
{


	private static boolean gameOver;



	public static void main(String [] args)
	{

		// Start the game
		start();
		// Game Loop:
		while (gameOver == false)
		{

			// 1. update game
			update();
			// 2. render the game (show it to the player)
			render();

		}
	} // end of main method



	public static void render()
	{

		// draw scene
		Scene.draw();
		// draw enemy
		Enemy.draw();
		// draw player
		Player.draw();

		// show graphics >> 100 milliseconds (refers to how long it waits until it displays after each iteration of the loop)
		// show everything that I just told you to draw (from the Player class)
		StdDraw.show(100);

	
	} // end of render method




	public static void update()
	{

		// check for player input
		// update player (data) variables
		Player.move();


		// update enemy (data) variables
		long now = System.currentTimeMillis();
		
		if (now - Enemy.getAge() > 1000)
		{

			Enemy.move();	
		
		} // end of selection statement
		

	} // end of update method


	public static void start()
	{

		gameOver = false;
		// setup all game data
		Scene.start();
		Enemy.start();
		// setup player data
		Player.start();


	} // end of start method


} // end of Game class