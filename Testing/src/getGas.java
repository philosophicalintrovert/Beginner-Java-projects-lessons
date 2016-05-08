public class getGas {
	
	public static void main(String[] args){
		loseGas();
	}
	
	public static void loseGas(){
		carGas gasAmount = new carGas();
		gasAmount.addDistance(500);
		gasAmount.addGas(7);
		int distance;
		int gas;
		int leftDistance;
		distance = gasAmount.getDistance() / 20;
		gas = gasAmount.getGas() - distance;
		if (gas < 0){
			leftDistance = (gas * -1) * 20;
			System.out.println("You have none gas left and " + leftDistance + " kilometers of distance left.");
		}
		if (gas == 0){
			System.out.println("You have no gas left.");
		}
		if (gas > 0){
			System.out.println("You have " + gas + " litres of gas left.");
		}
	}
}