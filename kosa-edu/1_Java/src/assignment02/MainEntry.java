package assignment02;

import java.util.Scanner;
import java.util.Vector;

/* 
 * �̸�, ����, ����, ���� ����
 * ����, ���, ����(����)
 * vertor ���.
 */

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Score> s = new Vector<Score>();
		
		while(true) {
			try {	
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���α׷� ����");
			
			switch(sc.nextInt()) {
			case 1:
				add(s); break;
			case 2:
				show(s); break;
			case 3:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} // main end

	// case 1: ���� �Է�
	private static void add(Vector<Score> s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, ������ �Է��ϼ���.");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		s.add(new Score(name, kor, eng, com));
	} // add end
	
	// case 2: ���� ���
	public static void show(Vector<Score> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.println("=======�л�����=======");
			System.out.println("�л��̸� : " + s.get(i).getName());
			System.out.println("����������: " + s.get(i).getTotal_score());
			System.out.println("����ա���: " + s.get(i).avg());
			System.out.println("����������: " + s.get(i).getGrade());
			System.out.println("=======�л�����=======\n");
		}
	} // show end


	

}
