package ex04.Abstract;

public class Rectangle extends Shape {
	int y = 10;
	@Override
	public double calc(double x) {
		result = x * y;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(result + " 크기의 " + name + "이 그려졌습니다.");
	}

}
