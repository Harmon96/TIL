package quiz;

import java.util.Scanner;

public class day04_assignment_score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, com, eng, total_score;
		float avg;
		String check=null;
		char grade;
		
		try {
			
			do {
			System.out.print("�̸�, ����, ����, ���� ������ �Է����ּ���.");
			
			name = sc.next();
			kor = sc.nextInt();
			com = sc.nextInt();
			eng = sc.nextInt();
			
			avg = (kor + com + eng) / 3;
			if (avg < 100 && avg >= 90) {
				grade = 'A'; 
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			total_score = kor + com + eng;
			
			System.out.println(name + "���� ����ǥ ******");
			System.out.printf("���� : %3d ���� : %3d   ���� : %3d\n", kor, com, eng);
			System.out.printf("���� : %3d ��� : %.2f ���� : %c", total_score, avg, grade);
			
			System.out.println("\n��� �Է��Ͻðڽ��ϱ�? (y/n)");
			check = sc.next();
			if (check.equals("n")) {
				System.exit(0);
				}
			} while (check.equals("y"));	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
