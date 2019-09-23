

public class Scene
{

	// DATA

	private int rows;
	private int cols;
	private GameObject background;





	public Scene(String [][] map)
	{

		this.rows = map.length;
		this.cols = map[0].length;


		int width = cols * 32;
		int height = rows * 32;
		this.background = new GameObject(0,0,width,height,"../Assets/background.png");



		// LOOP
		for (int y=0; y < rows; y++)
		{

			for (int x=0; x < cols; x++)
			{

				String tile = map[y][x];


			} // end : inner-loop
			
		
		} // end : outer-loop
	

		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0.0,width);
		StdDraw.setYscale(height, 0.0);

	} // end : CONSTRUCTOR





	public void draw()
	{

		background.draw();

	} // end draw method






} // end : Scene class





