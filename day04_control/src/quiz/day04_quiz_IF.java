package quiz;

import java.util.Scanner;

/*
 * ����, ����, ���� �Է� �޾Ƽ� ��� 60�� �̻��̸� �հ�,
 * �� ���� ���� 40�� �̸��̸� ���� ���հ�
 */

public class day04_quiz_IF {

	public static void main(String[] args) {

		int com, eng, kor;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		avg = (com + eng + kor)/3;
		
		if (avg >= 60){
			if (com >= 40 && eng >= 40 && kor >= 40 ) {
				System.out.printf("��� %.2f ������ �հ��Դϴ�", avg);
			}
		
			if (com < 40 || eng < 40 || kor < 40) {
				if (com <= 40) {
					System.out.println("com���� " + com + "������, ���հ��Դϴ�.");
				}
				} else if (eng <= 40) {
					System.out.println("eng���� " + eng + "������, ���հ��Դϴ�.");
					
				} else if (kor <= 40) {
					System.out.println("kor���� " + kor + "������, ���հ��Դϴ�.");	
				}
		}
	}
}
