import java.util.Random; //Imports the randomisation library.

/*
 * "number = number + 5" can be written as:
 * "number += 5"
 * 
 * "number = number - 5" can be written as:
 * "number -= 5"
 * 
 * "number = number * 5" can be written as:
 * "number *= 5"
 * 
 * "number = number / 5" can be written as:
 * "number /= 5"
 */

public class MoreMathRandomisation {
	
	public static void main(String[] args){
		Random rand = new Random(); //Creates a new object with the type "Random".
		System.out.println(rand.nextInt(11)); //Prints out a random integer between 0 to 11 using the object "rand".
	}
	
}
