public class DodgerGame
{


	// ATTRIBUTES
	// instance variable
	// scope: anything inside this class
	private boolean isOver;


	private Scene scene;
	private long startTime;






	// CONSTRUCTOR job: assign the value of isOver variable
	public DodgerGame()
	{
		isOver = false;



		// this command invokes the constructor in the Scene class file
		scene = new Scene();


		startTime = System.currentTimeMillis();


		Player player = new Player (250, 187.5);
		this.scene.setPlayer( player );
		this.input = new Controller (player);
	
	} // end of dodgerGame METHOD







	// METHOD: also an instance method
	public void update()
	{



		long now = System.currentTimeMillis();

		if (now - this.startTime > 200)
		{
			scene.addMonster();
			this.startTime = now;
		} // end of IF

		
		scene.update();

	} // end of update METHOD





	// METHOD:
	public void render()
	{

		scene.draw(); // draw scene
		StdDraw.show(100);
	
	} // end of render METHOD






	// METHOD: main
	public static void main (String [] args)
	{
		DodgerGame game = new DodgerGame();
		while (game.isOver == false)
		{
			game.update();
			game.render();
		} // end of LOOP

	} // end of main METHOD






} // end of class

