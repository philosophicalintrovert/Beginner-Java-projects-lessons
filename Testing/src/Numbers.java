public class Numbers{
	
	// First solution
	/*public static void main(String[] args){
		int[] array = new int[]{1,2,4,2,6,7,2,7,9,1,2};
		int number = 2;
		int count = 0;
		for(int i : array){
			switch(i == number ? 1 : 0){
			case 1:
				count++;
			}
		}
		System.out.println(count);
	}*/
	
	// Second solution
	public static void main(String[] args){
		int[] array = new int[]{1,2,4,2,6,7,2,7,9,1,2};
		int count = 0;
		int number = 1;
		for(int i = 0; i < array.length; i++){
			if (array[i] == number){
				count++;
			}
		}
		System.out.println(count);
	}
	
}