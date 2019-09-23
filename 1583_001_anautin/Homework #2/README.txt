INSTRUCTIONS

Developer: Abby N Autin

Program: CombatCalculator.java


::::  Goal of the game: defeat the goblin by decreasing his health to zero or below, using the methods provided.


PRE

1. import Scanner object
	// call

2. public class CombatCalculator7{
	// open first pair of curly braces

3. (nested) public static void main(String [] args){
	// open pair of curly braces



DECLARE

1. Scanner input = new Scanner(System.in);
	// create Scanner to obtain data from user



INITIALIZE

1. Initialize the monster's variables:
	- monster name = "GOBLIN DUDE"
	- monster health = 100
	- monster attack power = 15


2. Initialize the hero's variables:
	- hero health = 100
	- hero attack power = 12
	- hero magic power = 0







LOOP

1. int runAway = 0;
	// specifically created a control variable that is nested in option 4; set to = 1 when the player chooses to run away; new value makes loop condition false, thus terminating the loop & the program

2. while (monsterHealth > 0 && runAway < 1){
	// open pair of curly braces
	// this while loop will only iterate while the monster is alive (monster health higher than 0) AND while the player has not yet chosen to run away (runAway variable less than 1, more specifically, the value it was initialized at, which is 0) 
	// note: if and when the player selects option 4 (to run away), I've set the runAway variable to increment by 1; this would make the loop condition false on the next check

3. (nested) output a greeting to the player

4. output the current stats for both the monster and the player

5. output the combat menu while prompting the user for his/her selection (input)

6. int playerSelection = input.nextInt();
	// declare the variable that will store the user's input









>> PROCESS USER INPUT

1. if (the player selects option 1, to attack with a sword){
	- open pair of curly braces
	- decrement the monster's health by 12 points
	- output the player's effect of his/her choice

2. else if (the player selects option 2, to cast a spell){
	- open pair of curly braces

	3. if (the hero's magic power is greater than or equal to 3){
		- open pair of curly braces
		- divide the monster's health by 2
		- deduct the cost of casting the spell from the hero's magic power, which is 3
		- print the confirmation to user

	4. else{
		- print "You have not collected enough magic."

5. else if (the player selects option 3, to charge magic){
	- open pair of curly braces
	- increment hero's magic power by 1
	- print the confirmation to user

6. else if (the player selects option 4, to run away){
	- increment the runAway variable by 1, making the loop condition false
	- confirm the player ran away and lost the game

7. else{
	- if the player makes ANY OTHER ENTRY
	- print "I do not understand. Make another choice."

8. if (monsterHealth <= 0){
	- this if statement checks to see if the user has defeated the monster
	- the user must decrease monster health to zero or less
	- if true, print "Congrats" statement



