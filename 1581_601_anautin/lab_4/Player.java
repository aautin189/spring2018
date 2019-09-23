// import classes that we will need to access in this application
import java.lang.System;
import java.util.Scanner;
import java.lang.Math;



public class Player
{

	// player data
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;



	public static void draw ()
	{
		StdDraw.picture(x+width/2, y+height/2, image);

	} // end of draw method


	public static void start()
	{

		image = "assets/aimer.png";
		width = 32;
		height = 32;
		x = Scene.getWidth()/2;
		y = Scene.getHeight()/2;

	} // end of start method



	public static void move()
	{
		x = StdDraw.mouseX() - width/2;
		y = StdDraw.mouseY() - height/2;
		
	} // end of move method



} // end of Player class