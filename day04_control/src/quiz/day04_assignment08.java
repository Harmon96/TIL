package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;
/*����8]  �μ� �Է� �޾Ƽ� ������ �ϴ� ���α׷� �ۼ� (����ó��)
  - ���ڰ� �ƴ� ���� �Է� ������.
  - ������ �ƴ� �Ǽ� ������ �Է� ������.
  - � ���� 0���� ���� �� ����.
*/  
public class day04_assignment08 {
	public static void main(String[] args) {
		int input1, input2, result = 0;
		
		try {
			Scanner sc = new Scanner(System.in);
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			result = input1 / input2;
			
			System.out.println(result);
		} catch (InputMismatchException ime) { // ������ ���� Ÿ�԰� �ٸ� Ÿ���� �Է¹޾��� ��
			System.out.println("�Է°��� �߸��Ǿ����ϴ�. ������ �Է����ּ���.");
		} catch (ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} 
	}
}
