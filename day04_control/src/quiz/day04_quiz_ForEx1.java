package quiz;
//1. ���ϴ� ���� �Է� �޾Ƽ� ������ ���
import java.util.Scanner;

public class day04_quiz_ForEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����ϱ� ���ϴ� ������ �ܼ��� �Է��ϼ���.");
		int gugudan = sc.nextInt();
		
		for(int i=2; i<=9; i++) {
			System.out.println(i + "*" + gugudan + " = " + (i*gugudan));
		}	
	}
}
