public class CombatCalculator2
{
	public static void main(String[] args)
	{
		/*Monster data variables*/
		//Declare variable: monster's name; initialize it = "goblin"
		String theMonster = "GOBLIN DUDE:";

		//Declare variable: monster's health; initialize it = 100
		int monsterHealth = 100;

		//Declare variable: monster's attack power; initialize it = 15
		int monsterAttackPower = 15;



		/*Hero data variables*/
		//Declare variable: hero's health; initialize it = 100
		int heroHealth = 100;

		//Declare variable: hero's attack power; initialize it = 12
		int heroAttackPower = 12;

		//Declare variable: hero's magic power; initialize it = 0
		int heroMagicPower = 0;



		/*Report Combat Stats*/
		//Print the monster's name
		System.out.println(theMonster);

		//Print the monster's health
		System.out.println("Health Status = ");
		System.out.println(monsterHealth);

		//Print the player's health
		System.out.println("YOUR:");
		System.out.println("Health Status = ");
		System.out.println(heroHealth);

		//Print the player's magic power
		System.out.println("YOUR:");
		System.out.println("Magic Power = ");
		System.out.println(heroMagicPower);

	}
}

