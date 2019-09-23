
import java.util.Scanner;


// METHODS INCLUDED in the Physics class:
// start()
// update()
// getVelocityX
// getVelocityY
// thrustUp()
// thrustRight()
// thrustLeft()



public class Physics
{

	// CLASS DATA
	private static double velocityX;
	private static double velocityY;
	private static double gravity;
	private static double maxSurvivableVelocity;
	private static double thrust;







	// METHOD: start
	public static void start(Scanner input)
	{

		velocityX = 0.0;
		velocityY = 0.0;
		gravity = input.nextDouble();
		maxSurvivableVelocity = input.nextDouble();
		thrust = input.nextDouble();


	} // end of start method







	// METHOD: update
	public static void update()
	{

		velocityY -= gravity;

	} // end of update method






	// METHOD: getVelocityX
	public static double getVelocityX()
	{

		return velocityX;

	} // end of getVelocityX method






	// METHOD: getVelocityY
	public static double getVelocityY()
	{

		return velocityY;

	} // end of getVelocityY method







	// METHOD: thrustUp
	public static void thrustUp()
	{

		velocityY -= thrust;

	} // end of thrustUp method







	// METHOD: thrustRight
	public static void thrustRight()
	{

		velocityX += thrust;

	} // end of thrustRight method






	// METHOD: thrustLeft 
	public static void thrustLeft()
	{

		velocityX -= thrust;

	} // end of thrustLeft method





} // end of Physics class


