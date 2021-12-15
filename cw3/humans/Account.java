package humans;
public class Account{
	int amount;
	public Account(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
	public void withdraw(int amount){
		this.amount-=amount
	}
}