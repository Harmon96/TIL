package quiz;

import java.util.Scanner;


//��Ģ���� ���α׷� �ۼ� - ������ 1��, �������� 2��


public class day04_quiz_switch {
	public static void main(String[] args) {
		

		try {
			
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ڸ� �Է����ּ��� (+, -, *, /) : ");
		String oper = sc.next();
		System.out.print("ù��° ���ڸ� �Է����ּ���.");
		int input1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ���.");
		int input2 = sc.nextInt();
		
		switch (oper) {
		case "+": result = input1 + input2; break;
		case "-": result = input1 - input2; break;
		case "*": result = input1 * input2; break;
		case "/": result = input1 / input2; break;
		default : {
			System.out.println("error");
			System.exit(0);
			}
		
		}
		
		System.out.println("�� ������ \'" + oper + "\' ������ ����� : " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}
}