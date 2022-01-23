package basic;

public class ConstructorThis {
		
		public ConstructorThis()
		{
			System.out.println(" Default const ");
		}
		public ConstructorThis(int x)
		{
			this();
			System.out.println(" const 1 ");
		}
		public ConstructorThis(int r,int g)
		{
			this(10);
			System.out.println(" const 2 ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorThis(20,30);
		
	}

}
