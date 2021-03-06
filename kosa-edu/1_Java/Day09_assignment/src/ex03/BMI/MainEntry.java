package ex03.BMI;

import java.util.*;
import java.io.*;
/*
문제3] 비만도 측정 프로그램 작성하기 - collection, file io 이용하기
추가 / 삭제 / 출력 / 종료 처리할것
몸무게, 키 를 입력 받아서 BMI 계산하기
BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) ) ;
*/

public class MainEntry {
	static String name, bmi_result;
	static double weight, height, bmi;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int check = 0, i = 0;
	static Map<String, BMI> map =new HashMap<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = "BMI.txt";
		File file = new File(fileName);		
		if(!file.exists()){
			file.createNewFile();}
		OutputStream os = new FileOutputStream(fileName);
		
		while(true) {
			menu();
			switch(check) {
				case 1:
					add(); break;
				case 2:
					del(); break;
				case 3:
					show(); break;
				case 4: {
					Set set = map.entrySet();
					Iterator it = set.iterator();
					String str;					
					while (it.hasNext()) { 
						Map.Entry e = (Map.Entry) it.next();
						str = (i + 1) + ") " + e.getValue().toString() + "\r\n";
						os.write(str.getBytes());
						i++;
					}
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
			}
		}
	}

	private static void show() {
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.print((i + 1) + ") ");
			System.out.println(e.getValue().toString());
			i++;
		}
	}

	private static void del() {
		map.clear();		
	}
	
	public static void add() throws IOException {
		System.out.print("이름 : ");
		BMI bmi = new BMI();
		name = br.readLine();
		System.out.print("몸무게 : ");
		weight = Double.parseDouble(br.readLine());
		System.out.print("키 : ");
		height = Double.parseDouble(br.readLine());
		map.put(name, new BMI(name, weight, height, bmi.bmi_score, bmi.bmi_result));
	}

	public static void menu() throws NumberFormatException, IOException {
		System.out.println("======================");
		System.out.println("1. 정보 추가");
		System.out.println("2. 정보 삭제");
		System.out.println("3. 정보 출력");		
		System.out.println("4. 프로그램 종료");
		System.out.println("======================");
		System.out.print("숫자를 입력해주세요 : ");
		check = Integer.parseInt(br.readLine());
	}
}