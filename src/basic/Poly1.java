package basic;

public class Poly1 {
		double avg;
		private String name ;String course;
		public Poly1(String name,String course) {
			this.name= name;
			this.course=course;
			}
		void getdata(int m1,int m2) {
			int total = (m1 + m2)/2;
			 this.avg = total;
		}
		void display(int roll) {
			System.out.println("poly1 of roll " +roll);
			System.out.println("Name " +name);
			System.out.println("Course " +course);
			System.out.println("average " +avg );
		}
}
		
