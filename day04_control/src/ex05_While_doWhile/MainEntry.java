package ex05_While_doWhile;

public class MainEntry {

	public static void main(String[] args) {
		
		int a = 1;
		
		while (a<11) {
			System.out.println("hello " + a);
			a++;
		}
		
		System.out.println("============================");
		int b = 10; // ���� �ʱ�ȭ
		do {
			System.out.println("hello " + b);
			b--;
		}while (b >= 1 );
		
	}
}