
public class Player
{

	private String image;
	private int width;
	private int height;
	private double x;
	private double y;
	private int speed;


	// CONSTRUCTOR
	public Player(double x, double y)
	{

		this.x = x;
		this.y = y;
		this.width = 32;
		this.height = 32;
		this.image = "assets/spaceman.png";
		this.speed = 10;
	
	} // end of CONSTRUCTOR




	// METHOD:
	public void draw()
	{

		StdDraw.picture(x, y, image, width, height);

	} // end of METHOD




	public void move(double x, double y)
	{

		this.y = y;
		this.x = x;
	}


} // end of Player CLASS