
// import classes that we will need to access in this application
import java.lang.System;
import java.util.Scanner;
import java.lang.Math;




public class Scene
{

	private static String image;
	private static int width;
	private static int height;


	public static void draw()
	{
		StdDraw.picture(width/2, height/2, image);

	}

	


	public static void start ()
	{

		image = "assets/background.png";
		width = 500;
		height = 375;

		// setup the canvas
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0.0, width);
		StdDraw.setYscale(height, 0.0);

	}


	// METHOD: returns the width of the scene
	public static int getWidth()
	{

		return width;

	} // end of getWidth method



	// METHOD: returns the height of the scene
	public static int getHeight()

	{

		return height;
	
	} // end of getHeight method




} // end of Scene class



