package ex07.main;

import java.util.Scanner;

public class WhileCharSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		String str = null;
		int count = 0;
		
		System.out.print("�ƹ� ���̳� �Է� �ϼ���. '!'�� ������ Ż�� : ");
		int su = 0;
		
		while (true) {
			str = sc.next();
			ch = str.charAt(0);
			
			if (ch == '!') break;
			
			count++;
			
		} // while end
		
		System.out.println("�� �Է� ���� ���� ������ : " + count + "��.");
		
		do {
			System.out.println("\n jumsu(0~100) = ");
			su = sc.nextInt();
			
		} while(su < 0 || su > 100);{
			System.out.println(su);
		}
	}
}
