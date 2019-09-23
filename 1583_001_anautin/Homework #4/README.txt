

Abby Autin

DATE: March 23, 2018
COURSE: Java I		


ASSIGNMENT:
Homework #4
NOLA Neighborhood Exploration Game





**************************************************
NEW CONCEPTS:

- this assignment introduced the following new concepts that were not covered in the last homework (3):

* Arrays
* Initializer lists


* Multi-dimensional arrays
* Initializer lists for multi-dimensional arrays


* Retrieving values from arrays & multi-dimensional arrays

**************************************************
REMEMBER:

- At this point, we are still only using 1 class file to run our program
- Multiple methods are created and called from within that class
- Not yet focusing on passing info to & from methods
	- will start doing this once we begin relying on multiple classes to run our programs


**************************************************
OVERVIEW:

- program allows the user to explore a collection of connected neighborhoods in New Orleans.
- uses one array (8 rows) to store descriptions of each of the 8 neighborhoods that you chose to include in your map
- uses a separate array (8 rows by 4 columns) to store 8 sets of index values, each set corresponding to a neighborhood; and each set consisting of 4 indexes that represent the adjacent neighborhoods to that one neighborhood


- the program begins in a default location, printing out details of that specific neighborhood
- It then let's the user know which directions they are allowed to travel, based on the internal map that we modeled with the help of arrays
- That String literal entered by the user will be converted to an integer. 
- The value of the integer is found by accessing the (8 X 4) multi-dimensional array that stores adjacent neighborhood index values
- The specific corresponding neighborhood that is accessed is based on the direction that user has chosen to travel BASED ON THE CURRENT LOCATION THEY ARE IN
- Once that index value is identified, it is used to update the "currentNeighborhood" variable.
	- that variable is what is used to determine which neighborhood description is sent to the terminal at the start of the game
	- since we update this variable each time the user selects a new direction, the game simulates "movement" from one neighborhood to another


**************************************************



