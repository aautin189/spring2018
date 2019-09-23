


public class PlatformGame
{


	/* Platformer Game Attributes */
	private World world;
	private boolean isOver;
	private int level;
	private Scene scene;

	




	/* Create a new Platform Game */
	// CONSTRUCTOR
	public PlatformGame()
	{
		this.isOver = false;
		this.level = 0;
		this.world = new World();
		String [][] map = world.getLevel(level);
		this.scene = new Scene(map);
	
	} // end : constructor






	// HELPER method
	public void update()
	{

		// game update code
	
	} // end : update game




	// HELPER method
	public void render()
	{

		scene.draw();
		StdDraw.show(10);
	
	} // end : render game




	/* The main game loop */
	public static void main (String [] args)
	{

		PlatformGame game = new PlatformGame();

		while (game.isOver == false)
		{
			game.update();
			game.render();
		
		} // end : game loop

	} // end : main method




} // end : PlatformGame













