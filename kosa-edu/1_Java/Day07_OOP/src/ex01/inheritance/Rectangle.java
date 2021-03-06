package ex01.inheritance;

public class Rectangle extends Point {
	private int x2, y2;

	public Rectangle() {
		super();
		x2 = y2 = 50;
	}

	
	
	
	public Rectangle(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
	}
	
	

	public Rectangle(int x) {
		super(x);

	}
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Rectangle [x2=" + x2 + ", y2=" + y2 + ", x=" + x + ", y=" + y + "]";
	}
	

//	public void disp() {
//		super.disp();
//		System.out.print(", " + x2 + ", " + y2);
//	}
	
	
	
	

}
