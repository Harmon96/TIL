package ex05_While_doWhile;

public class MultiDoWhile {
	public static void main(String[] args) {
		int a = 1, b = 1; // ���� �ʱ�ȭ
		
		do {
			do {
				
				System.out.println(b + "\t");
				b++; // ������
			} while(b <= 3); // ����
			
			a++; // ����
		} while(a <= 2); // ����
		
	}
	
	

}
