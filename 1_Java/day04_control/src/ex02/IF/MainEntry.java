package ex02.IF;

import java.util.Scanner;

/*
 * ����] ����/��� ���� ���α׷� �ۼ�
 * if ( year % 4 == 0 )
 *		if( year % 100 != 0 ) || if ( year % 400 == 0 )
 *			"����"
 */


public class MainEntry {

	public static void main(String[] args) {
		System.out.print("year = ");
		int year = new Scanner(System.in).nextInt();
		
		boolean flag = false;
		String msg = null;
		
		if ( year % 4 == 0 ) {
	 		if (( year % 100 != 0 ) || ( year % 400 == 0 )) {
	 			flag = true;
	 			
	 		}
		} // if end
		
		msg = (flag == true ) ? "����" : "���";
		 
		System.out.println(year + "�⵵ ==> " + msg);
		
	}
}