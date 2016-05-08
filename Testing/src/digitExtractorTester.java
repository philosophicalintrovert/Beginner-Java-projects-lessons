import java.util.*;
public class digitExtractorTester {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		String rNumber = "12345";
		System.out.print("Enter a custom, five digit number: ");
		String nSequence = userInput.next();
		System.out.println(" ");
		if (nSequence.length() != rNumber.length()){
			System.out.println("Your input contains too many or too less digits.\nOnly five digit numbers are allowed.");
		}
		else{
		digitExtractor byMath = new digitExtractor(Integer.valueOf(nSequence));
		byMath.returnNumberSequenceByMath();
		System.out.println(" ");
		digitExtractor byChar = new digitExtractor(nSequence);
		byChar.returnNumberSequenceByChar();
		}
	}
}