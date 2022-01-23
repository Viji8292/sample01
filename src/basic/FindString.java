package basic;

import java.util.Scanner;

public class FindString {
		public static void main(String args[])
		{
			String s1= "welcome to a learning portal";
			Scanner sn = new Scanner(System.in);
			System.out.println("find the String");
			String find = sn.next();
			String[] s2=s1.split(" ");
			int c=0;
			for(int i=0;i<s2.length;i++)
			{
				if(s2[i].equals(find))
				{
				c++;
				break;
				}
			}
			if(c>0)
				System.out.println(find+ " String Found ");
			else
				System.out.println(" String not Found ");
			}
}
