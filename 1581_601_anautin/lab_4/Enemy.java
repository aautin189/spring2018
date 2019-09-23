// import classes that we will need to access in this application
import java.lang.System;
import java.util.Scanner;
import java.lang.Math;




public class Enemy
{

	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;
	private static long age;




	public static void draw()
	{

		StdDraw.picture(x+width/2,y+height/2,image);

	}


	public static void start()
	{

		image = "assets/target.png";
		width = 32;
		height = 32;
		x = Math.random() * Scene.getWidth();
		y = Math.random() * Scene.getHeight();
		age = System.currentTimeMillis();

	} // end of start method



	public static void move()
	{
		x = Math.random() * Scene.getWidth();
		y = Math.random() * Scene.getHeight();
		age = System.currentTimeMillis();

	} // end of move method


	public static long getAge()
	{

		return age;
	}


} // end of Enemy class