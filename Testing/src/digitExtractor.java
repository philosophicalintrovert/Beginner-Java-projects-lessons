public class digitExtractor {
	int tNumber;
	String cNumber;
	
	public digitExtractor(int numberSequence) {
		tNumber = numberSequence;
	}
	
	public digitExtractor(String numberSequence) {
		cNumber = numberSequence;
	}
	
	public void returnNumberSequenceByMath(){
		int int1;
		int int2;
		int int3;
		int int4;
		int int5;
		int1 = (tNumber % 10);
		int2 = (tNumber % 100) / 10;
		int3 = (tNumber % 1000) / 100;
		int4 = (tNumber % 10000) / 1000;
		int5 = (tNumber % 100000) / 10000;
		System.out.println("Mathematically: \n" + int1 + "\n" + int2 + "\n" + int3 + "\n" + int4 + "\n" + int5);
	}
	
	public void returnNumberSequenceByChar(){
		char char1;
		char char2;
		char char3;
		char char4;
		char char5;
		char1 = (cNumber.charAt(4));
		char2 = (cNumber.charAt(3));
		char3 = (cNumber.charAt(2));
		char4 = (cNumber.charAt(1));
		char5 = (cNumber.charAt(0));
		System.out.println("Conceptionally: \n" + char1 + "\n" + char2 + "\n" + char3 + "\n" + char4 + "\n" + char5); 
	}
}