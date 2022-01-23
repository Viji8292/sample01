package basic;

import java.util.Scanner;

public class varaible {
      String qualification="b.sc";
      int contact;
		public String disp1(String name) {
			String s= "welcome" +name;
			return s;
			}
		public String disp2()
		{
			String de = qualification + "mcs";
			return de;
		}
		public void disp3(String email) {
			System.out.println("email is" +email);
		}
		public void disp4()
		{
			System.out.println("city is kumbakonam ");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
				varaible v= new varaible();
				String n = v.disp1(" viji ");
				System.out.println(n);
				Scanner sn = new Scanner(System.in);
				 int contact = sn.nextInt();
				System.out.println("contact  number is " +contact);
				String e= v.disp2();
				System.out.println("qualification " +e);
				v.disp3(" vijivg2007@gmail.com ");
				v.disp4();
				}

}
