public class Controller
{

	private Player player;


	public void update()
	{

		onMousePress();

	}



	public Controller (Player player)
	{

		this.player = player;
	}



	public void onMousePress()
	{

		if (StdDraw.mousePressed())
		{
			double mouseX = StdDraw.mouseX();
			double mouseY = StdDraw.mouseY();
			double playerX = player.getX();
			double playerY = player.getY();

			if (mouseY - playerY < 0) {playerY -= player.getSpeed();}
			if (mouseY - playerY > 0) {playerY += player.getSpeed();}
			if (mouseX - playerX < 0) {playerX -= player.getSpeed();}
			if (mouseX - playerX > 0) {playerX += player.getSpeed();}

			player.move(playerX, playerY);

		}
	}



}