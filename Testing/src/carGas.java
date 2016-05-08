public class carGas {
	
	int distance = 0;
	int gas = 0;
	
	public carGas(){
		
	}
	
	public carGas(int amount){
		gas = amount;
	}
	
	public void addGas(int gasAmount){
		gas = gas + gasAmount;
	}
	
	
	public void addDistance(int distanceAmount){
		distance = distance + distanceAmount;
	}
	
	public int getGas(){
		return gas;
	}
	
	public int getDistance(){
		return distance;
	}
}
