package ex03.Switch;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ø� �����ϼ���. (s, d, b, j) = ");
		char si = sc.nextLine().charAt(0); // ���ڿ� �߿��� ù���� �ѱ��ڸ� ������
		
		switch(si) {
		case 's' : System.out.print("����"); break;
		case 'd' : System.out.print("����"); break;
		case 'b' : System.out.print("�λ�"); break;
		case 'j' : System.out.print("����"); break;
		default :
				System.out.println("error. please input in s, b, d, j");
				System.exit(0);
		
		}
		
		System.out.print("��(��) ���� �ϼ̽��ϴ�.");
		
	}
}