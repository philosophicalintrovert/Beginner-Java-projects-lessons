public class Inheritance2 extends Inheritance {
	
	boolean hasAppleLogo = true;
	String color = "black";
	
	void adjustPrice(){
		if (hasAppleLogo){
			price += 4500;
		}
	}
	
}
