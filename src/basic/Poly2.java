package basic;

public class Poly2 extends Poly1{
		String contact;
	public Poly2(String name, String course,String contact) {
		super(name, course);
		this.contact= contact;
		// TODO Auto-generated constructor stub
	}
	void getdata(int m1,int m2) {
		super.getdata(m1, m2);
	}
	void display(int roll) {
		super.display(11);
		System.out.println("contact" +contact);
	}
}
