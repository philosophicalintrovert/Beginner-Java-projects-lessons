import java.util.Arrays;
import javax.swing.JOptionPane;

public class numberExtractor {
	
	public static void main(String[] args){
		String[] input = JOptionPane.showInputDialog("Numbers: ").split("");
		if (input.length > 5){
			JOptionPane.showMessageDialog(null, "You can't input more than 5 numbers.");
		}
		else if(input.length < 2){
			JOptionPane.showMessageDialog(null, "You must input atleast 2 numbers minimum.");
		}
		else{
		Arrays.sort(input);
		System.out.println("Extracted numbers: ");
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
		JOptionPane.showMessageDialog(null, "Your numbers have been extracted!");
		}
	}
}