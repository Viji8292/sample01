package basic;

import java.util.Scanner;

public class Mainbank extends savingsacc {
public Mainbank(String accno, String accname) {
	// TODO Auto-generated constructor stub
		super(accno,accname);
		Scanner sn = new Scanner(System.in);
		System.out.println("enter balance");
			balance = sn.nextDouble();
			}

			void display1()
			{
				display();
				System.out.println("interest" +interestrate);
				System.out.println("rate" +rate);
				}
}


	

