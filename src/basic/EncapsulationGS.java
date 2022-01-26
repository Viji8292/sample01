package basic;

public class EncapsulationGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Getter_Setter o = new Getter_Setter();
			o.setX(30);
			o.setY(40);
			o.setN("viji");
			System.out.println(o.getN());
			System.out.println(o.getX());
			System.out.println(o.getY());
			
			
			Getter_Setter j = new Getter_Setter(59,"const");
					System.out.println(j.getN());
					System.out.println(j.getX());
		
			
	}

}
