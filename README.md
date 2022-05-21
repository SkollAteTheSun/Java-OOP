# Java-OOP
Lab work on studying the basics of object-oriented programming in Java.

Create an abstract class "Household appliances" with methods:
* public abstract void init(Scanner scanner) 	// reading parameters from the console
* public abstract String getCost()	// returns the cost
* public String toString() 		// returns the state of the object as a string

Build class hierarchy: 
- Household appliances
    - Gas stove
    - Electronic equipment
        - Microwave
        - Washing machine

Write a program that:
1. Reads the number of vehicles from the console (recognize the number of vehicles when the user enters the following lines: vap4yap, aa4a555 (in this case, you need to recognize the first number))
2. Reads the parameters in a loop. First, the type of equipment is asked and an object of the required class is created. Then the init() method is called on the object and the characteristics of the object are entered. It is clear that the init() method is different for different classes.
3. The read objects are added to the array
4. We search for household appliances with the highest cost and display them on the screen (output via toString())

