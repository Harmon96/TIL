package quiz;

import java.util.Scanner;

//  ����7]  �빮�� <--> �ҹ��� ���� ���α׷� �ۼ� ( if ) 

public class day04_assignment07 {
	public static void main(String[] args) {
		char ch = ' ';
		
		System.out.print("���ĺ��� �Է����ּ���(�빮�� <--> �ҹ���) : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if (ch >= 65 && ch <= 96) {
			ch += 32;
		}
		else if (ch >= 97 && ch <= 122) { 
			ch -= 32;
		}
		
		System.out.println(ch);
	}
}
