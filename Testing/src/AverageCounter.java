
public class AverageCounter {

	public static void main(String[] args) {
		int[] list = new int[] { 1, 2, 5, 4, 6, 7, 9, 10 };
		double[] grades = new double[list.length];
		double sum = 0;
		double average;
		for (int i = 0; i < list.length; i++) {
			grades[i] = list[i];
			sum += grades[i];
		}
		average = sum / list.length;
		System.out.println(average);
	}

}
