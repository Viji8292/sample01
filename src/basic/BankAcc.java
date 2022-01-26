package basic;

public class BankAcc {
		String accname;
		String accno;
		static Double balance;
	 
	public  BankAcc(String accname,String accno) {
		this.accname=accname;
		this.accno=accno;
	}
	public String getaccname(){
		return accname;
	}
	public String getaccno(){
		return accno;
	}
	public Double getbalance(){
		return balance;
	}
	public boolean deposit(double amount) {
		if(amount > 0)
			balance = balance + amount;
			return true;
	}
	public boolean withdraw(double amount) {
		if(amount > balance)
			balance = balance - amount;
			return true;
	}
	void show()
	{
		System.out.println("Accname" +accname);
		System.out.println("Accno"    +accno);
		deposit(1000.0);
		System.out.println("Deposit" +balance);
		withdraw(300.0);
		System.out.println("withdraw" +balance);
		
		
	}
	}
