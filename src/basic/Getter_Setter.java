package basic;

public class Getter_Setter {
		public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
		private int x,y;
		private String n;
		public Getter_Setter() {
			
		}
		public Getter_Setter(int x, String n) {
			super();
			this.x = x;
			this.n = n;
}
}

