public class getBankAccount {
	
	public static void main(String[] args){
		
		bankAccount moneyLeft = new bankAccount();
		moneyLeft.addMoney(987);
		moneyLeft.loseMoney(457);
		System.out.println("You have " + moneyLeft.getMoney() + " money left.");
	}
}