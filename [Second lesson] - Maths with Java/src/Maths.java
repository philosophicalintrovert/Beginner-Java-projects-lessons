/*
 * The "double" variable supports decimals only.
 * The "int" variable supports whole numbers only.
 */

public class Maths {
	
	//Class variables (doubles/integers):
	static double a = 10;
	static double b = 15;
	static double c = 22;
	static int counter = 0;
	
	public static void main(String[] args){
		
		//The below listed double variables are local.
		//(They belong to the "main" method only)
		double result;
		double resultTwo;
		double resultThree;
		double resultFour;
		double resultFive;
		
		//Assign values to the above mentioned double variables.
		//(It could've been done above)
		result = a + b;
		resultTwo = a - b;
		resultThree = a * c;
		resultFour = c / b;
		resultFive = c % b;
		
		//Calls the method "outputFirst" that prints out the variables which are mentioned above.
		//(The double variable "output" becomes the double variable "result/resultTwo/etc")
		outputFirst(result);
		outputFirst(resultTwo);
		outputFirst(resultThree);
		outputFirst(resultFour);
		outputFirst(resultFive);
	}
	
	public static void outputFirst(double output){
		counter++; //Adds one to the integer variable "counter".
		
		System.out.println("Result " + counter + " is " + output); //Prints out: "Result %counter% is %output%".
	}
	
}
