

Abby Autin

DATE: April 14, 2018
COURSE: Java I		


ASSIGNMENT:
Homework #5
Sanctuary Exploration Game- Object Oriented Approach





**************************************************
NEW CONCEPTS:

- this assignment introduced the following new concepts that were not covered in the last homework (3):



* Composition (has-a relationship)

* Modeling with objects

* Instance variables 

* Constructors



* Getters & setters

* Instance methods



**************************************************
ISSUES:
CLASS == Sanctuary




BUG #1

						Method: setExits()

- method isn't designed to return any values (as it is a setter method)
- however, it still needs a return type
- void is technically considered a return type
- you must specify this as a placeholder in the event that the method isn't intended to return any data


BUG #2

						Method: getExits()

- you had this method receiving a String literal from exitString() method
- the exitString() method is also located in the class Sanctuary
- as a result, you didn't need to pass that data from method to method
- instead, you could have just written out the method call from inside the body of getExits()


BUG #3

						Method: getExits()

- you didn't declare a data return type because you were using the method to take in data, modify it, and print out the newly modified String
- (EMAILED BEN TO GET MORE CLARIFICATION ON WHY)


BUG #4

						Method: getExits()

- you declared String exitString inside of each if statement
- remember rule: you can only declare a variable once
- since all of these if statements are located inside of the same method, you can just call the variable without needing to specify the data type over and over 
- and so, you moved the variable declaration up above the first if statement (inside method scope, so all if statements can access it)





**************************************************
ISSUES:
CLASS == GameControl



BUG #1

						Method: main()

- you invoked the getDefaultSanctuary() method located inside the City class
- you just called it by name
- however, getDefaultSanctuary() is an instance method (instance of City)
- since this is an instance method, you must specify an "instance" when you try to invoke the method
- so, the new method call looks like this:

	city.getDefaultSanctuary();



BUG #2

						Method: main()

- inside your main method, inside of your control structure, inside your conditions, you used == equality operator to compare the user input to a String literal
- however, since those Strings are "Reference" types, not "primitive types," you should have used the equals() method to perform that evaluation
- See here:

incorrect       ---- >        if (convertedUserInput == "quit")

correct		---- >	      if (convertedUserInput.equals("quit))	  








