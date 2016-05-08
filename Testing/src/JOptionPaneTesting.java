import java.util.Arrays;
import javax.swing.JOptionPane;

public class JOptionPaneTesting {
	
	public static void main(String[] args){
		String[] input = JOptionPane.showInputDialog("What are your grades of this month?\nYour answer must be seperated by spaces.").split(" ");
        double[] grades = new double[input.length];
        double average = 0.0;
        for (int i = 0; i < input.length; i++) {
            grades[i] = Double.parseDouble(input[i]);
            average+=grades[i];
        }
        average /= grades.length;
        JOptionPane.showMessageDialog(null, "Your grades are: " + Arrays.toString(input));
        JOptionPane.showMessageDialog(null, "Your average is: " + average);
    }
}