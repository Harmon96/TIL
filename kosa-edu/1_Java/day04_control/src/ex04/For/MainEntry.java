package ex04.For;

public class MainEntry {

	public static void main(String[] args) {
		for(int i=1; i<=15; i++) {
			System.out.println("Hello");
		}
		
		// �ʱⰪ, �������� 2�� �̻� ���� (��, ������ ���� 1��!!)
		int a, b;
		for (a=1, b=2; a<=10; a++, b+=2) {
			System.out.println(a);
		}
		
		System.out.println("====================");
		// �ʱⰪ, �������� ���� ���� (��, ������ �����ϸ� ���ѷ���)
		a = 1; b = 2;
		for( ; a < 20 ; ) {
			System.out.println(a);
			a++;
			b--;
		}
		
		System.out.println("====================");
		// ���� for��
		for(;;) { // ���ѷ���
			System.out.println("����");
			
		}
		
		
		
	}
}