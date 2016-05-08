public class ForLoops {
	
	 /*public static void main(String[] args){
		 //Form of the "for" loop.
		for (initialization; termination; increment){
			statement(s);
		}
	}
	
	public static void main(String[] args){
		//Creates an integer variable "variable" and checks if it's less than 11.
		//(If the above is true, the loop is initialized. Once the loop reaches the bottom, one is added to the variable
		//"variable")
		for (int variable = 1; variable < 11; variable++){
			System.out.println("Count is: " + variable); //Prints out: "Count is: %variable%".
		}
	}*/
	
	public static void main(String[] args){
		int initialValue = 0;
		int finalValue = 10;
		int counter = 0;
		
		if (initialValue < finalValue){
			System.out.println("Input accepted.");
			System.out.println("Initial value: " + initialValue);
			System.out.println("Final value: " + finalValue);
			System.out.println();
			
			System.out.println("Initial value count: \n" + initialValue);
			counter++;
			
			for (initialValue = 1; initialValue < finalValue + 1; initialValue++){
				System.out.println(initialValue);
				counter++;
				
				if (initialValue == finalValue){
					System.out.println();
					System.out.println("Counting completed.");
					System.out.println("There are " + counter + " numbers (inclusive) between " + (initialValue - counter + 1) + " and " + finalValue + ".");
				}
			}
		}
		
		else{
			System.out.println("Your initial value is more than your final value.");
			System.out.println("Please enter new values.");
		}
	}
	
}