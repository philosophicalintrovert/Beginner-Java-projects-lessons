public class bankAccount {
	
	public bankAccount(){
		
	}
	
	public bankAccount(int moneyAmount){
		moneyTotal = moneyAmount;
	}
	
	int moneyTotal = 0;
	
	public void addMoney(int amount){
		moneyTotal = moneyTotal + amount;
	}
	
	public void loseMoney(int amount){
		moneyTotal = moneyTotal - amount;
	}
	
	public int getMoney(){
		return moneyTotal;
	}
	
}