import javax.swing.JOptionPane;
import java.util.Arrays;
public class JOptionPaneTesting2{
	
	public static void main(String[] args){
		String[] input = JOptionPane.showInputDialog("What are you grades this month?\nThey must be seperated by spaces.").split(" ");
		int[] grades = new int[input.length];
		int average = 0;
        int lowest = Integer.parseInt(input[0]);
        int highest = Integer.parseInt(input[0]);
        for(int i=0; i < input.length; i++){
                if(Integer.parseInt(input[i]) > highest){ //Checks if the inputs' [i] index number is more than the variables' "largest" index number
                	highest = Integer.parseInt(input[i]); //If the above is true, assigns the inputs' [i] indexes' number to the variable "largest"
                }
                else if (Integer.parseInt(input[i]) < lowest){ //If the above is false, checks if the inputs' [i] index number is less than the variables' "smallest" index number
                	lowest = Integer.parseInt(input[i]); //If the above is true, assigns the inputs' [i] indexes' number to the variable "smallest"
                }
                grades[i] = Integer.parseInt(input[i]);
    			average += grades[i];
        }
		average /= grades.length;
		JOptionPane.showMessageDialog(null, "You have " + input.length + " grades and they are: " + Arrays.toString(input));
		JOptionPane.showMessageDialog(null, "Your highest grade is: " + highest + "\nYour lowest grade is: " + lowest);
		JOptionPane.showMessageDialog(null, "Your total average is: " + average);
	}
}