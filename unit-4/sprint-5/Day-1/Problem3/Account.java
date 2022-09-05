package Problem3;

public class Account {
	String accountnumber;
	double balance;
	
	public void deposite(double amount) {
		
		this.balance=this.balance+amount;
	}
	
	public double withdraw(double amount)throws InsufficientFundsException {
		if(amount>this.balance) {
			InsufficientFundsException ife= new InsufficientFundsException("You have not sufficient balance");
			throw ife;
			
		}
		
		else {
			return amount;
		}
		
	
		
	}

}
