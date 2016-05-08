import java.util.Random; //Imports the "Random" library.

/*
 * == - equal to;
 * != - not equal to;
 * > - greater than;
 * >= - greater than or equal to;
 * < - less than;
 * <= - less than or equal to;
 * || - or;
 * && - and.
 */

public class IfElse {
	
	/*static int age = 18; //Class-wide integer "age".
	
	public static void main(String[] args){
		//Creates an "if" statement.
		//(If the age is greater than or equal to 21, print out "You may drink.")
		if (age >= 21){
			System.out.println("You may drink.");
		}
		
		//Creates an "else" statement.
		//(If the age is anything but greater than or equal to 21, print out "You cannot drink yet.";
		//"Come back in %years% years.")
		else{
			System.out.println("You cannot drink yet.");
			System.out.println("Come back in " + (21 - age) + " years.");
		}
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		int result = rand.nextInt(2);
		
		if (result == 0){
			System.out.println("Heads.");
		}
		
		else if (result == 1){
			System.out.println("Tails.");
		}
		
		else if (result == 3){
			System.out.println("Side. Fix your random number generator.");
		}
	}
	
	public static void main(String[] args){
		//If either one, conditionOne or conditionTwo, are true, the "if" statement executes.
		if (conditionOne == true || conditionTwo == true){
			doThis();
		}
		
		//If both, conditionOne and conditionTwo, are true, only then the "if" statement executes.
		if (conditionOne == true && conditionTwo == true){
			doThis();
		}
	*/
	
	static int dieValue; //Initializes a class-wide variable "dieValue".
	
	public static void main(String[] args){
		rollDie(); //Calls the method "rollDie".
	}
	
	static void rollDie(){
		Random randomNumber = new Random(); //Creates a new variable with the type "Random".
		dieValue = randomNumber.nextInt(6) + 1; //Assigns a random number between 1 and 6 to the variable "dieValue".
		
		System.out.println("You rolled a " + dieValue + "."); //Prints out: "You rolled a %dieValue%."
		
		testDieValue(dieValue); //Calls the method "testDieValue" with the required parameters.
	}
	
	static void testDieValue(int dieValue){
		//Checks if the dieValue is less than or equal to 2.
		//(If the above is true, prints out: "You lose.")
		if (dieValue <= 2){
			System.out.println("You lose."); //Prints out: "You lose.".
		}
		
		//Checks if the dieValue is equal to 3 or 4, or 5.
		//(If the above is true, prints out two new empty lines and the text "Re-rolling."; calls the method "rollDie")
		else if (dieValue == 3 || dieValue == 4 || dieValue == 5){
			System.out.println(); //Prints out a new empty line.
			System.out.println("Re-rolling."); //Prints out: "Re-rolling.".
			System.out.println(); //Prints out a new empty line.
			rollDie(); //Calls the method "rollDie".
		}
		
		//Checks if the dieValue is equal to 6.
		//(If the above is true, prints out "You win!")
		else if (dieValue == 6){
			System.out.println("You win!"); //Prints out: "You win!".
		}
	}
	
}