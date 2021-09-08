package assignment;

import java.util.Scanner;
import java.util.Vector;

/*
Customer class
name, address, tel field
�������Լ�, set/get method
�� �߰� / ���� / �� ����Ʈ ��� / ���� / ���α׷� ���� ����ϴ� ���α׷� �ۼ��ϱ�.
* Vertor ���.
*/

public class MainEntry {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vector<Customer> v = new Vector<Customer>();		
			
			while(true) {
				System.out.println("1. �� �߰�");
				System.out.println("2. �� ����");
				System.out.println("3. �� ����Ʈ ���");
				System.out.println("4. �� ���� ����");
				System.out.println("5. ���α׷� ����");
				System.out.print("���Ͻô� �۾��� ���ڸ� �Է����ּ��� : ");
				
				switch(sc.nextInt()) {
				case 1:
					add(v); break;
				case 2:
					del(v); break;
				case 3:	
					show(v); break;
				case 4: 
					update(v);
					break;
				case 5:
					System.out.println("�����մϴ�.");
					System.exit(0);
				} // switch end
			} // while end
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main end
	
	// case 1: �� �߰�
	private static void add(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �̸�, �ּ�, ��ȣ�� �Է��ϼ���.");
		int cus_num = 0;
		String name = sc.next();
		String address = sc.next();
		String tel = sc.next();
		
		v.add(new Customer(cus_num, name, address, tel));
		cus_num++;
	}
	
	// case 2: �� ����
	public static void del(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ��ȣ�� �Է��ϼ���.");
		int num = sc.nextInt();
		v.remove(num-1);
	}
	
	// case 3: �� ����Ʈ ���
	public static void show(Vector<Customer> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("=======������=======");
			System.out.println("����ȣ : " + v.get(i).getCus_num() + 1);
			System.out.println("���̸� : " + v.get(i).getName());
			System.out.println("���ּ� : " + v.get(i).getAddress());
			System.out.println("����ȣ : " + v.get(i).getTel());
			System.out.println("=======������=======\n");
		}
	}
	
	// case 4: �� ���� ����
	public static void update(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� ��ȣ�� �Է��ϼ���.");
		int num = sc.nextInt();
		if (num < 0 || num >= v.size()) {
			System.out.print("���� ���� ���ڸ� �Է����ּ���.");
		} 
		else {		
		System.out.println("������ �� ������ �Է��ϼ���.");
		String name = sc.next();
		String address = sc.next();
		String tel = sc.next();
		v.set(num-1, new Customer(num, name, address, tel));
		}
	}	
}	

