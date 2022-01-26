package basic;

public class TriAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha = 65;
		for(int p=0;p<=5;p++) {
			for(int q=5;q>p;q--) {
				System.out.print(" ");
				}
			for(int k=0;k<=p;k++) {
				System.out.print((char)(alpha+k));
			}
			for(int l=p-1;l>=0;l--){
				System.out.print((char)(alpha+l));
			}
			System.out.println( );
		}
	}

}
