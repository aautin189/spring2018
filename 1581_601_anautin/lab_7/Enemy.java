
public class Enemy
{

	private String image;
	private int width;
	private int height;
	private double x;
	private double y;

	// add new instance variable "speed"
	private int speed;
	private double degree;




	// CONSTRUCTOR:
	public Enemy(double x, double y)
	{
		this.x = x;
		this.y = y;
		this.width = 32;
		this.height = 32;
		this.image = "assets/asteroid.png";
		this.speed = (int)(3 + Math.random() * 10);
		this.degree = 0.0;

	} // end of CONSTRUCTOR





	// METHOD: 
	public void draw ()
	{
		// overloaded method
		StdDraw.picture(x, y, image, width, height, degree);
	
	} // end of draw METHOD






	// METHOD:
	public void move()
	{

		this.y += this.speed;

		this.degree += this.speed*10;
	
	} // end of move METHOD








} // end of Enemy CLASS



