//import java.util.Random;

public class CoinTossSwitch {
	
	/*public static void main(String[] args){
		Random rand = new Random(); //Creates a new variable ("rand") with the type "Random".
        int randomInt = rand.nextInt(2); //Creates a new integer variable ("randomInt") with the random value from 0 to 1.
        
        System.out.println(randomInt); //Prints out the value of the variable "randomInt".
        
        //Splits out the variable in the parentheses (in this case it's "randomInt") and checks if the variable has a
        //value of 0 or 1.
        //(If the value of the variables' value is 0, prints out: "Tails!"; if the value of the variables' value is 1,
        //prints out: "Heads!".
        switch (randomInt){
        
            case 0: //Checks if the variables' value is 0.
                System.out.println("Tails!"); //Prints out: "Tails!".
                break; //Separates/breaks the cases.
            case 1: //Checks if the variables' value is 1.
                System.out.println("Heads!"); //Prints out: "Heads!".
                break; //Separates/breaks the cases.
        }
	}*/
	
	public static void main(String[] args){
		String currentCharacter = "Mario"; //Assigns the string variable the value of "Mario".
		
		//Creates 3 new integer variables ("maxLife", "maxJump", "maxSpeed"):
		int maxLife;
		int maxJump;
		int maxSpeed;
		
		//Checks if the variables' "currentCharacter" is Mario or Luigi, or Yoshi.
		switch (currentCharacter){
		
		case "Mario":
			System.out.println("You have selected Mario as your character!"); //Prints out: "You have selected Mario as your
			//character.".
			maxLife = 70; //Assigns the variable "maxLife" the value of 70.
			maxJump = 50; //Assigns the variable "maxJump" the value of 50.
			maxSpeed = 25; //Assigns the variable "maxSpeed" the value of 25.
			System.out.println("Max life: " + maxLife + "\n" + "Max jumping height: " + maxJump + "\n" + "Max speed: " + maxSpeed);
			//Prints out: "Max life: %maxLife%; Max jumping height: %maxJump%; Max speed: %maxSpeed%.
			break; //Separates/Breaks the cases.
			
		case "Luigi":
			System.out.println("You have selected Luigi as your character!"); //Prints out: "You have selected Luigi as your
			//character.".
			maxLife = 40;  //Assigns the variable "maxLife" the value of 40.
			maxJump = 70;  //Assigns the variable "maxJump" the value of 70.
			maxSpeed = 30;  //Assigns the variable "maxSpeed" the value of 30.
			System.out.println("Max life: " + maxLife + "\n" + "Max jumping height: " + maxJump + "\n" + "Max speed: " + maxSpeed);
			//Prints out: "Max life: %maxLife%; Max jumping height: %maxJump%; Max speed: %maxSpeed%.
			break; //Separates/Breaks the cases.
		
		case "Yoshi":
			System.out.println("You have selected Yoshi as your character!"); //Prints out: "You have selected Yoshi as your
			//character.".
			maxLife = 50; //Assigns the variable "maxLife" the value of 50.
			maxJump = 30; //Assigns the variable "maxJump" the value of 30.
			maxSpeed = 40; //Assigns the variable "maxSpeed" the value of 40.
			System.out.println("Max life: " + maxLife + "\n" + "Max jumping height: " + maxJump + "\n" + "Max speed: " + maxSpeed);
			//Prints out: "Max life: %maxLife%; Max jumping height: %maxJump%; Max speed: %maxSpeed%.
			break; //Separates/Breaks the cases.
		}
	}
}
