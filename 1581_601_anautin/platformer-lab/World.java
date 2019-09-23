import java.util.Scanner;


// CLASS : holds all level data in the game
// the world data will get its info from the configuration file and then save it in the program
public class World
{

	private String [][][] levels;




	// CONSTRUCTOR
	public World()
	{

		// get all map data and save it for later (in our 3-dimensional array)
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		levels = new String[count][][];


		for (int lvl = 0; lvl < count; lvl++)
		{

			int rows = input.nextInt();
			int cols = input.nextInt();
			input.nextLine();

			setLevel(lvl, rows, cols, input);

		} // end : repetition
	} // end : Constructor







	// GETTER method
	public String [][] getLevel(int level)
	{

		return levels[level];
	}


	private void setLevel(int lvl, int rows, int cols, Scanner input)
	{

		levels[lvl] = new String [rows][cols];


		input.useDelimiter("");
		for(int y=0; y < rows; y++)
		{
			for (int x=0; x < cols; x++)
			{

				 String tile = input.next();
				 levels [lvl][y][x] = tile;
				 
			
			} // end : inner-repetition

			input.nextLine();
			
		
		} // end : outer-repetition

		input.reset();

	

	} // end : setLevel method









} // end : World Class





