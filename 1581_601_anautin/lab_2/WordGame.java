/**
* 
* LAB EXERCISE #2
* - Mad Libs Word Game 
* 
*
* @ Abby Autin
* @ Feb 25, 2018
*
*/


import java.util.Scanner;


public class WordGame
{
	public static void main(String [] args)
	{

		Scanner input = new Scanner(System.in);

		String story = "I went to %s and found a %s. It was cursed and made me %s. Now I %s all day long. The End.\n";
		
		System.out.print("Enter a place: ");
		String place = input.nextLine();


		System.out.print("Enter an item: ");
		String item = input.nextLine();


		System.out.print("Enter an adjective: ");
		String adjective = input.nextLine();


		System.out.print("Enter a present-tense verb: ");
		String verb = input.nextLine();



		System.out.printf(story, place, item, adjective, verb);


	}

}