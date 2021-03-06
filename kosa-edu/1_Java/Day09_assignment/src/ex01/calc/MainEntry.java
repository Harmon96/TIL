package ex01.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제2] 숫자 2개 입력 받고, 연산 1개 입력 받아서 사칙연산 구하는 프로그램 만들기 (io 처리)
public class MainEntry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double result = 0;
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("실행할 연산을 입력해주세요 : ");
		String oper = br.readLine();

		try {
			if( oper.equals("+") ) {
				result = num1 + num2;
			}
			else if( oper.equals("-") ) {
				result = num1 - num2;
			}
			else if( oper.equals("*") ) {
				result = num1 * num2;
			}
			else if( oper.equals("/") ) {
				result = num1 / num2;
			}
			else {
				System.out.println("적절한 입력을 해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("두 수의 " + oper + " 연산의 결과는 : " + result + " 입니다.");
		br.close();
	}
}
