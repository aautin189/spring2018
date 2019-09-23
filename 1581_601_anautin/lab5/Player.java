
import java.util.Scanner;


// METHODS INCLUDED in the Player class:
// start()
// draw()
// update()
// move()


public class Player
{

	// CLASS DATA
	// all ship images 
	private static String shipImage;
	private static String thrusterUpImage;
	private static String thrusterLeftImage;
	private static String thrusterRightImage;
	private static String shipLandedImage;
	private static String shipCrashedImage;



	// current ship image
	private static String sprite;


	// ship dimensions
	private static int width;
	private static int height;


	// ship initial position
	private static double x;
	private static double y;


	// ship fuel
	private static int fuel;









	// METHOD: start
	public static void start(Scanner input)
	{

		// read the ship art assets

		shipImage = "assets/" + input.next();
		thrusterUpImage = "assets/" + input.next();
		thrusterLeftImage = "assets/" + input.next();
		thrusterRightImage = "assets/" + input.next();
		shipLandedImage = "assets/" + input.next();
		shipCrashedImage = "assets/" + input.next();


		// set current image
		sprite = shipImage;

		
		// read the ship dimensions
		width = input.nextInt();
		height = input.nextInt();

		// read the ship initial position
		x = input.nextDouble();
		y = input.nextDouble();

		// read the ship fuel
		fuel = input.nextInt();


	} // end of start method






	// METHOD: draw
	public static void draw()
	{

		// draw ship to scene
		StdDraw.picture(x, y, sprite);


	} // end of draw method







	// METHOD: update
	public static void update()
	{

		Player.move();
		Physics.update();
		y += Physics.getVelocityY();
		x += Physics.getVelocityX();

		if ( (y+height) > (Scene.getHeight()-15))
		{

			sprite = shipCrashedImage;
			Game.setGameOver(true);


		} // end of if


	} // end of update method





	// METHOD: move
	public static void move()
	{

		if (StdDraw.hasNextKeyTyped())
		{


	
			char ch = StdDraw.nextKeyTyped();
			if (ch == 'w')
			{

				Physics.thrustUp();				// go faster upwards
				sprite = thrusterUpImage;		// set image for "upward" thruster	
			}

			else if (ch == 'd')
			{

				Physics.thrustRight();			// go faster to the right
				sprite = thrusterRightImage;
			}

			else if (ch == 'a')
			{

				Physics.thrustLeft();			// go faster to the left
				sprite = thrusterLeftImage;

			}

		} // end of outer if statement


		else 
		{
			sprite = shipImage;
		
		} // end of outer else


	} // end of move method




} // end of Player class


