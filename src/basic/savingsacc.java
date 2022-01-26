package basic;

public class savingsacc extends BankAcc{
			double interestrate;
			double rate = 800;
		public savingsacc(String accno, String accname){
			// TODO Auto-generated constructor stub
			super(accno ,accname);
			this.rate= rate;
			interestrate= rate;	
		}
			
			public double addInterest(){
			double interest = getbalance() + interestrate/100;
			deposit(interest);
			System.out.println("int" +interest);
			return interest;
			}
			public String getaccname(){
				return super.getaccname();
			}
			public String getaccno(){
				return super.getaccno();
			}
			public Double getbalance(){
				return super.getbalance();
			}
			public boolean deposit() {
				return super.deposit(interestrate);
			}
			void display(){
			show();
			addInterest();
			}
		}

