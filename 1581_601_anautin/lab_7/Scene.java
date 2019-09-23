import java.util.ArrayList;

public class Scene
{

	/* Attributes: Instance variables*/
	private String image;
	private int width;
	private int height;
	private Player player;

	// an array list that holds data of the "enemy" data type
	private ArrayList<Enemy> monsters;




	



	// ** CONSTRUCTOR ** //
	// assign values to all the instance variables
	public Scene()
	{

		this.width = 500;
		this.height = 350;
		this.image = "assets/space-background.png";
		this.monsters = new ArrayList<Enemy>();


		// construct a scene
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0.0, width);
		StdDraw.setYscale(height, 0.0);

	} // end of ** CONSTRUCTOR **






	// METHOD: 
	public void draw()
	{

		StdDraw.picture(width/2, height/2, image); // draw background image using center point
		for (Enemy monster : monsters)
		{

			monster.draw();

		}

		player.draw();
	
	} // end of draw METHOD






	// METHOD:
	public void addMonster()
	{
		double x = 32 + (Math.random() * (width - 64));
		double y = -32;
		Enemy star = new Enemy(x,y);
		this.monsters.add(star);
	
	} // end of addMonster METHOD






	// METHOD:
	public void update ()
	{

		for (Enemy monster : monsters)
		{
			monster.move();
		}
	
	} // end of update METHOD






	// METHOD:
	public Player getPlayer()
	{

		return this.player;
	
	} // end of getPlayer METHOD






	// METHOD:
	public void setPlayer(Player player)
	{

		this.player = player;

	} // end of setPlayer METHOD






} // end of Scene CLASS


