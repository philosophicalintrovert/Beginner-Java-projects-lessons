public class WhileLoops {
	
	/*static boolean earthIsSpinning = true; //Creates a boolean variable "earthIsSpinning" with the value "true".
	static int counter = 1; //Creates an integer variable "counter" with the value 1.
	
	public static void main(String[] args){
		//Checks if the variable "earthIsSpinning" equals to "true".
		//(If the above is true, executes the loop)
		while (earthIsSpinning){
			System.out.println(counter + "." + " The earth is still spinning."); //Prints out: "%counter%. The earth is still
			//spinning.
			
			counter++; //Adds one to the variable "counter".
			
			//Checks if the variable "counter" is greater than or equal to 11.
			//(If the above is true, sets the variables' "earthIsSpinning" to "false")
			if (counter >= 11){
				break; //Sets the variables' "earthIsSpinning" value to "false".
			}
		}
	}*/
	
	public static void main(String[] args){
		//Creates 3 integer variables ("initialValue", "finalValue", "counter"):
		int initialValue = 0;
		int finalValue = 10;
		int counter = 0;
		
		//Checks if the variable "initialValue" is less than "finalValue".
		//(If the above is true, executes the "if" statement)
		if (initialValue < finalValue){
			System.out.println("Input accepted."); //Prints out: "Input accepted.".
			System.out.println("Initial value: " + initialValue); //Prints out: "Initial value: %initialValue%".
			System.out.println("Final value: " + finalValue); //Prints out: "Final value: %finalValue%".
			System.out.println(); //Prints out a new empty line.
			System.out.println("Initiating count."); //Prints out: "Initiating count.".
			System.out.println(); //Prints out a new empty line.
			
			System.out.println("Initial value count:" + "\n" + initialValue); //Prints out: "Initial value count:; %initialValue%".
			counter++; //Adds one to the variable "counter".
			
			//Checks if the variable "initialValue" is less than "finalValue".
			//(If the above is true, initiates the "while" statement.
			while (initialValue < finalValue){
				initialValue++; //Adds one to the variable "initialValue".
				System.out.println(initialValue); //Prints out the variable "initialValue".
				counter++; //Adds one to the variable "counter".
			}
			
			//Checks if the variable "initialValue" is equal to the variable "finalValue".
			if (initialValue == finalValue){
				System.out.println(); //Prints out a new empty line.
				System.out.println("Counting complete."); //Prints out: "Counting complete.".
				System.out.println("There are " + counter + " numbers (inclusive) between " + (initialValue - counter + 1) + " and " + finalValue + ".");
				//Prints out: "There are %counter% numbers (inclusive) between %(%initialValue% - %counter% + 1)% and %finalValue%.
			}
		}
		
		//Checks if the "if (initialValue < finalValue)" statement is false.
		//(If the above is true, executes the "else" statement.
		else{
			System.out.println("Final value is less than initial value."); //Prints out: "Final value is less than initial value.".
			System.out.println("Please choose new values."); //Prints out: "Please choose new values.".
		}
	}
	
}
