
import java.util.Scanner;



// METHODS INCLUDED in the Scene class:
// start()
// draw()
// getHeight()



public class Scene
{


	// CLASS DATA
	private static int width;
	private static int height;
	private static String image;

	





	// METHOD: start
	public static void start(Scanner input)
	{
		// setup the scene data
		Scene.width = input.nextInt();
		Scene.height = input.nextInt();
		Scene.image = "assets/" + input.next();

		// setup the canvas (so we can draw the scene)
		StdDraw.setCanvasSize(width,height);
		StdDraw.setXscale(0.0,width);
		StdDraw.setYscale(height,0.0);

	} // end of start method






	// METHOD: draw
	public static void draw()
	{

		StdDraw.picture(width/2, height/2, image);


	} // end of draw method







	// METHOD: getHeight
	public static int getHeight()
	{

		return height;

	} // end of getHeight method






} // end of Scene class


