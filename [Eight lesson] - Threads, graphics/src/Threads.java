public class Threads {
	
	public static void main(String[] args){
		//Creates a new Thread with the name "thread" which prints out: "One." on execution.
		Thread thread = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i += 2){
					System.out.println("One.");
				}
			}
		};
		
		//Creates a new Thread with the name "threadTwo" which prints out: "Two." on execution.
		Thread threadTwo = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i += 2){
					System.out.println("Two.");
				}
			}
		};
		
		thread.start(); //Starts the Thread "thread".
		threadTwo.start(); //Starts the Thread "threadTwo".
	}
	
}