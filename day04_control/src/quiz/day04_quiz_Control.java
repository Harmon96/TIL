package quiz;
/*
 * ����] 1~100�߿��� 3�� ����� ������ ���� ���ϼ���.
 */
import java.util.Scanner;

public class day04_quiz_Control {
	public static void main(String[] args) {
		int count = 0, sum_count = 0;
		for(int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				count++;
				sum_count += i;
			}
		}
		System.out.println("3�� ����� ���� : " + count);
		System.out.println("3�� ����� ���� : " + sum_count);
	}
}
