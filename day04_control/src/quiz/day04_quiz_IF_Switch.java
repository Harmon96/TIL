package quiz;

import java.util.Scanner;

/*
 * ����, ����, ���� �Է� �޾Ƽ� ��� 60�� �̻��̸� �հ�,
 * �� ���� ���� 40�� �̸��̸� ���� ���հ�
 */

public class day04_quiz_IF_Switch {

	public static void main(String[] args) {

		int com, eng, kor;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		avg = (com + eng + kor)/3;
		 
		switch ((int)avg / 10 ) {
		case 10: case 9: case 8: case 7: 
		case 6: 
			switch (com <= 40 ? "com" : eng <= 40 ? "eng" : kor <= 40 ? "kor" : " ") {
			case "com": System.out.println("com " + com + "������, ���հ��Դϴ�."); break;
			case "eng": System.out.println("eng " + eng + "������, ���հ��Դϴ�."); break;
			case "kor": System.out.println("kor " + kor + "������, ���հ��Դϴ�."); break;
			
			default : System.out.println("�հ�"); break;
			
			} break;
			
		default:
			System.out.println("��� " + avg + "������ ���հ��Դϴ�.");	
		}
	}
}
