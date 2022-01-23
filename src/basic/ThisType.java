package basic;

public class ThisType {
	
	String name;
	String  a,b;
	public ThisType(String name) {
		this.name = name;
	}
	public ThisType(String a,String b) {
		this.a = a;
		this.b = b;
	}
	public ThisType(){
		System.out.println("default package");
	}
	public  void disp() {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThisType t1 = new ThisType("Vijaya shri");
			t1.disp();
			
			ThisType t2 = new ThisType("aa2,bb2");
			t2.disp();
			
			ThisType t = new ThisType();
			t.disp();
			}
}
