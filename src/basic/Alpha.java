package basic;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int alpha = 65;
			for(int i= 0;i<=5;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print((char)alpha+ " ");
					alpha++;
				}
				System.out.println(" ");
			}
			}
	}
